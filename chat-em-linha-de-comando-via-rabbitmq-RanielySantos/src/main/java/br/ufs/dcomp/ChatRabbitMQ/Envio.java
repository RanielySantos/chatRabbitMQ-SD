package br.ufs.dcomp.ChatRabbitMQ;

import com.rabbitmq.client.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import com.google.protobuf.*;
import java.text.DateFormat;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.nio.file.*;

public class Envio{
    private static String emissor;
    private static String data;
    private static String hora;
    private static String chave;
    private static String path;
    
    //Inicia a classe
    public Envio (String emissor, String data, String hora, String chave, String path){
        this.emissor = emissor;
        this.data = data;
        this.hora = hora;
        this.chave = chave;
        this.path = path;
    }
    
    public static String getEmissor(){
        return emissor;
    }
    
    public static String getData(){
        return data;
    }
    
    public static String getHora(){
        return hora;
    }
    
    public static String getChave(){
        return chave;
    }
    
    
    public static String getPath(){
        return path;
    }
    
    private static Runnable envio = new Runnable(){
        @Override
        
        public void run(){
            ConnectionFactory factory = new ConnectionFactory();
            factory.setUsername("");
            factory.setPassword("");
            //factory.setHost("AMQP-Chat-RabbitMQ-bb7f487b5a155d9c.elb.us-east-1.amazonaws.com");
            factory.setHost("");
            factory.setVirtualHost("/");
            
            try{
                Connection connection = factory.newConnection();
                Channel canal = connection.createChannel();
                
                String[] splitPath = getPath().split("\\p{Punct}");
                int i = splitPath.length;
                String arq = splitPath[i-2].concat(".").concat(splitPath[i-1]);
                String chaveArquivo = getChave().substring(1).concat("-arquivos");
                
                File file = new File(getPath());
                int len = (int)file.length();
                byte[] arquivo = new byte[len];
                FileInputStream input  = new FileInputStream(file);
                input.read(arquivo);
                input.close();
                
                MsgProto.Mensagem.Builder mensagem = MsgProto.Mensagem.newBuilder();
                    
                mensagem.setEmissor(getEmissor());
                mensagem.setData(getData());
                mensagem.setHora(getHora());
                
                if(getChave().startsWith("#"))
                    mensagem.setGrupo(getChave());
                else
                    mensagem.setGrupo("");
                
                mensagem.setCorpo(ByteString.copyFrom(arquivo));
                mensagem.setNome(arq);
                
                MsgProto.Mensagem wrapper = mensagem.build();
                byte[] buffer = wrapper.toByteArray();
                    
                if (getChave().startsWith("@")){
                    canal.basicPublish("", chaveArquivo, null, buffer);
                    System.out.println("Arquivo /" + getPath() + "/ foi enviado para " + getChave());
                    System.out.print(getChave() + ">> ");
                }
                else {
                    canal.basicPublish(chaveArquivo, "", null, buffer);
                    System.out.println("Arquivo /" + getPath() + "/ foi enviado para " + getChave());
                    System.out.print(getChave() + ">> ");
                }

            }
            catch(Exception e){
                System.out.println(e.getMessage() + "\nErro no envio! Tente novamente.");
                System.out.print(getChave() + ">> ");
            }
        }
    };
    
    public static void main(String[] args){
        new Thread(envio).start();
    }
}