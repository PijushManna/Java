import java.io.*;
import java.net.*;

class chatClient{
    public static void main(String[] args) {

        try {
            // Initializing Sockets
            Socket socket = new Socket("localhost", 8800);
            DataInputStream dInputStream = new DataInputStream(socket.getInputStream());
            DataOutputStream dOutputStream = new DataOutputStream(socket.getOutputStream());

            Thread read = new Thread(){
                public void run(){
                    
                    try {
                        System.out.println("Client : " + dInputStream.readUTF());
                    } catch (IOException e) {
                      
                        e.printStackTrace();
                    }
                }
            };
    
            Thread write = new Thread(){
                public void run(){
                    try {
                        dOutputStream.writeUTF(System.console().readLine("You :"));
                    } catch (IOException e) {
                      
                        e.printStackTrace();
                    }
                }
            };
    
            read.start();
            write.start();

            // Close
            socket.close();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
          
            e.printStackTrace();
        }

    }
}