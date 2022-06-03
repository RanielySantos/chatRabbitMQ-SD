package br.ufs.dcomp.ChatRabbitMQ;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import com.google.gson.*;
import com.rabbitmq.client.impl.StrictExceptionHandler;
import java.io.*;
import java.util.ArrayList;
import org.glassfish.jersey.client.*;
 
public class RESTClient 
{
    private static String path;
    
    public RESTClient(String path) {
        this.path = path;
    }

    public static String getPath() {
        return path;
    }
    
    public static String getData()
    {
        String json = new String();
        try {
            
            // JAVA 8 como pré-requisito (ver README.md)
            
            String username = "";
            String password = "";
     
            String usernameAndPassword = username + ":" + password;
            String authorizationHeaderName = "Authorization";
            String authorizationHeaderValue = "Basic " + java.util.Base64.getEncoder().encodeToString( usernameAndPassword.getBytes() );
     
            // Perform a request
            String restResource = "AMQP-Chat-RabbitMQ-bb7f487b5a155d9c.elb.us-east-1.amazonaws.com";
            Client client = ClientBuilder.newClient();
            Response resposta = client.target( restResource ).path(getPath()).request(MediaType.APPLICATION_JSON).header( authorizationHeaderName, authorizationHeaderValue ).get();     // Perform a post with the form values
           
            if (resposta.getStatus() == 200) {
            	json = resposta.readEntity(String.class);
                System.out.println(json);
            } else {
                System.out.println("Erro! Tente novamente.");
                System.out.println(resposta.getStatus());
                System.exit(0);
            }   
		} catch (Exception e) {
			e.printStackTrace();
		}
		return json;
    }
    
    public static void readData(String json){
        try {
            
            JsonArray saida = (new Gson().fromJson(json, JsonArray.class));
            String eval = saida.get(0).getAsJsonObject().get("source").getAsString();
            if (eval.equals("")) {
                for (int i = 1; i < saida.size(); i++) {
                    System.out.print(saida.get(i).getAsJsonObject().get("source").getAsString());
                    if (i != saida.size()-1)
                        System.out.print(", ");
                }
            }
            else {
                for (int i = 0; i < saida.size(); i++) {
                    System.out.print(saida.get(i).getAsJsonObject().get("destination").getAsString());
                    if (i != saida.size()-1)
                        System.out.print(", ");
                }
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args){
        String json = new String();
        json = getData();
        readData(json);
    }
}
