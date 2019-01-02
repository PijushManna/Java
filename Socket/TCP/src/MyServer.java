import java.io.*;
import java.net.*;
import java.util.Scanner;

class MyServer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            // Defining sockets
            ServerSocket server = new ServerSocket(3336);
            Socket socket = server.accept();

            // Initialin=zing sockets
            DataInputStream dInputStream = new DataInputStream(socket.getInputStream());
            DataOutputStream dOutputStream = new DataOutputStream(socket.getOutputStream());

            // Read and Write
            String msg = dInputStream.readUTF();
            System.out.println(socket.getRemoteSocketAddress() + " : " + msg);

            String reply = System.console().readLine("You :");
            dOutputStream.writeUTF(reply);

            // Flush
            dOutputStream.flush();

            // Close all
            socket.close();
            server.close();

        } catch (IOException e) {
            System.out.print("Error in server\n");
            e.printStackTrace();
        }

        sc.close();
    }
}