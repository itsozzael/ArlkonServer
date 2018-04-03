package main;

import implementations.Client;
import interfaces.ClientInterface;
import java.rmi.registry.Registry;
import java.util.Random;

public class Main {
    public static void main (String[] argv) {
        try {
            Random rand = new Random();

            // Generate an id for client
            int rand_id = rand.nextInt(9999) + 100;

            Client server = new Client(1);

            Registry r = java.rmi.registry.LocateRegistry.createRegistry(1099);
            r.bind("arlkon", new Client(1));
            System.out.println("Server Started");

            System.setProperty("java.security.policy","../security.policy");

            System.out.println("[System] Chat Remote Object is ready:");

            while(true){
                String msg = "" + server.getId();

                if (server.getClient() != null){
                    ClientInterface client = server.getClient();
                    msg = "[" + server.getId() + "] " + msg;

                    client.send(msg);
                }
            }

        } catch (Exception e) {
            System.out.println("[System] Server failed: " + e);
        }
    }
}
