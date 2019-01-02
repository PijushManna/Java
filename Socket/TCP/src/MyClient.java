import java.io.*;
import java.net.*;

class MyClient {
    public static void main(String[] args) {

        try {
            // Initializing Sockets
            Socket socket = new Socket("localhost", 3336);
            DataInputStream dInputStream = new DataInputStream(socket.getInputStream());
            DataOutputStream dOutputStream = new DataOutputStream(socket.getOutputStream());

            // Read Write
            String msg = System.console().readLine("You : ");
            dOutputStream.writeUTF(msg);

            String reply = dInputStream.readUTF();
            System.out.println("Server : " + reply);

            // Close
            socket.close();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}