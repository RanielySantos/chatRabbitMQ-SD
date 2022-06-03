package br.ufs.dcomp.ChatRabbitMQ;

import java.io.*;
import java.util.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import com.rabbitmq.client.*;
import com.google.protobuf.*;
import java.nio.file.*;
import java.util.concurrent.TimeoutException;
import com.google.gson.*;

public class Chat{

    public static void main (String[] argv) throws Exception{
        String queueName;
        String queueNameFile;
        ConnectionFactory factory = new ConnectionFactory();
        factory.setUsername("");
        factory.setPassword("");
        //factory.setHost("RabbitMQ-SD-LB-b9a92ec9ce007347.elb.us-east-1.amazonaws.com");
        factory.setHost("");
        factory.setVirtualHost("/");
        
        Connection connection = factory.newConnection();
        Channel channel = connection.createChannel();
        Channel channelFile = connection.createChannel();
        
        MsgProto.Mensagem.Builder mensagem = MsgProto.Mensagem.newBuilder();        
        
        System.out.print ("User: ");
        Scanner scan = new Scanner(System.in);
        queueName = scan.nextLine();
        queueNameFile = queueName.concat("-files");
        
        channel.queueDeclare(queueName,     false,    false,     false,       null);
        channelFile.queueDeclare(queueNameFile, false,    false,     false,       null);
        
        Consumer consumer = new DefaultConsumer(channel) {
            public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body) 
            throws IOException {
                try {
                    MsgProto.Mensagem message = MsgProto.Mensagem.parseFrom(body);
                    String emissor = message.getEmissor();
                    String data = message.getData();
                    String hora = message.getHora();
                    String grupo = message.getGrupo();
                    String cont = message.getCorpo().toStringUtf8();
                        
                    if (grupo.isEmpty()) 
                        System.out.println("(" + data + " às " + hora +") " +  emissor +" diz: " + cont);
                    else 
                        System.out.println("(" + data + " às " + hora +") " +  emissor + grupo +" diz: " + cont);
                }
                catch(IOException e){
                    System.out.println(e.getMessage());
                }
            }
        };
        
        Consumer consumerFile = new DefaultConsumer(channelFile) {
            public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body)           
            throws IOException {
                try {
                    MsgProto.Mensagem message = MsgProto.Mensagem.parseFrom(body);
                    String emissor = message.getEmissor();
                    String data = message.getData();
                    String hora = message.getHora();
                    String grupo = message.getGrupo();
                    String tipoMime = message.getTipo();
                    String nome = message.getNome();
                    byte[] conteudo = message.getCorpo().toByteArray();
                        
                    File dir = new File("/home/ubuntu/environment/downloads/");
                    dir.mkdirs();
                        
                    File file = new File(dir, nome);
                    FileOutputStream saida = new FileOutputStream(file);
                    BufferedOutputStream out = new BufferedOutputStream(saida);
                    out.write(conteudo);
                    out.flush();
                    out.close();
                
                    System.out.println("(" + data + " às " + hora +") Arquivo " + nome + " recebido de " + emissor);
                    System.out.println("@"+emissor+">>");
                }
                catch(IOException e){
                    System.out.println(e.getMessage());
                }
            }
        };
        
        channel.basicConsume(queueName, true, consumer);
        channelFile.basicConsume(queueNameFile, true, consumerFile);
        
        DateFormat dateTime = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        boolean loop = true;
        String msg;
        String queueKey = "";
        String groupName = "";
        String groupNameFile = "";
        System.out.print(">> ");
        
        while (loop) {
            try {
                msg = scan.nextLine();
                if(msg.equals("") || msg.isEmpty()){
                    System.out.println(queueKey + ">> ");
                }
                if (msg.startsWith("@") || msg.startsWith("#")) {
                    queueKey = msg;
                    System.out.print(queueKey + ">> ");
                }
                if (msg.startsWith("!addGroup")) {
                    groupName = msg.substring(10);
                    groupNameFile = groupName.concat("-arquivos");
                    
                    channel.exchangeDeclare(groupName, "fanout");
                    channel.queueBind(queueName, groupName, "");
                    
                    channelFile.exchangeDeclare(groupNameFile, "fanout");
                    channelFile.queueBind(queueNameFile, groupNameFile, "");
                    
                    System.out.print(queueKey + ">> ");
                }
                if (msg.startsWith("!addUser")) {
                    channel.queueBind(msg.split("\\s")[1], msg.split("\\s")[2], "");
                    channelFile.queueBind(msg.split("\\s")[1].concat("-arquivos"), msg.split("\\s")[2].concat("-arquivos"), "");
                    System.out.print(queueKey + ">> ");
                }
                if (msg.startsWith("!delFromGroup")) {
                    channel.queueUnbind(msg.split("\\s")[1], msg.split("\\s")[2], "");
                    channelFile.queueUnbind(msg.split("\\s")[1].concat("-arquivos"), msg.split("\\s")[2].concat("-arquivos"), "");
                    System.out.print(queueKey + ">> ");
                }
                if (msg.startsWith("!removeGroup")) {
                    groupName = msg.substring(13);
                    groupNameFile = groupName.concat("-arquivos");
                    
                    channel.exchangeDelete(groupName);
                    channelFile.exchangeDelete(groupNameFile);
                    
                    System.out.print(queueKey + ">> ");
                }
                if (msg.startsWith("!upload")) {
                    String url = msg.substring(8);
                    String pathArq = "";
                    pathArq = url;

                    Date dataHora = new Date();
                    String data = new SimpleDateFormat("dd/MM/yyyy").format(dataHora);
                    String hora = new SimpleDateFormat("HH:mm").format(dataHora);
                    
                    System.out.println("Enviando /" + pathArq + "/ para " + queueKey + "...");
                    System.out.print(queueKey + ">> ");
                    Envio enviando = new Envio(queueName, data, hora, queueKey, pathArq);
                    //Envio envio = new Envio(queueName, splitData[0], splitData[1], queueKey, pathArq);
                    enviando.main(new String[]{});
                }
                
                if(msg.startsWith("!listGroups")){
                    String user = queueKey.substring(6);
                    String path = "/api/queues/raniely" + user + "/bindings";
                    RESTClient rest = new RESTClient(path);
                    rest.main(new String[]{});
                    System.out.print("\n" + queueKey + ">> ");
                }
                
                if(msg.startsWith("!listUsers")){
                    String group = msg.substring(20);
                    String path = "/api/exchanges/raniely/" + group + "/bindings/source";
                    RESTClient rest = new RESTClient(path);
                    rest.main(new String[]{});
                    System.out.print("\n" + queueKey + ">> ");
                }
                
                if(msg.equals("!quit")){
                    System.out.println("Encerrando o chat.....Até a próxima.");
                    loop = false;
                }
                
                if (!msg.substring(0,1).matches("\\p{Punct}")) {
                    if (queueKey.startsWith("@")) {
                        Date data = new Date();
                        String dataS = dateTime.format(data);
                        String[] splitData = dataS.split("\\s");
                    
                        mensagem.setEmissor(queueName);
                        mensagem.setData(splitData[0]);
                        mensagem.setHora(splitData[1]);
                        mensagem.setTipo("text/plain");
                        mensagem.setCorpo(ByteString.copyFromUtf8(msg));
                    
                        MsgProto.Mensagem wrapper = mensagem.build();
                        byte[] buffer = wrapper.toByteArray();
                    
                        channel.basicPublish("", queueKey.substring(1), null, buffer);
                        System.out.print(queueKey + ">> ");
                    }
                    if (queueKey.startsWith("#")) {
                        Date data = new Date();
                        String dataS = dateTime.format(data);
                        String[] splitData = dataS.split("\\s");
                    
                        mensagem.setEmissor(queueName);
                        mensagem.setData(splitData[0]);
                        mensagem.setHora(splitData[1]);
                        mensagem.setGrupo(queueKey);
                        mensagem.setTipo("text/plain");
                        mensagem.setCorpo(ByteString.copyFromUtf8(msg));
                    
                        MsgProto.Mensagem wrapper = mensagem.build();
                        byte[] buffer = wrapper.toByteArray();
                    
                        channel.basicPublish(queueKey.substring(1),"", null, buffer);
                        System.out.print(queueKey + ">> ");
                    }
                }
            }
            catch (IOException e) {
                System.out.println("Algo deu errado, tente novamente.");
                if (queueKey.isEmpty())
                    System.out.print(">> ");
                else
                    System.out.print(queueKey + ">> ");
            }
        }
        //System.exit(0);
        channel.close();
        connection.close();
    }
}