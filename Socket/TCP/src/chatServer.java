import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

class chatServer{
    public static void main(String[] args) throws IOException{
        ServerSocket sc = new ServerSocket(8800);
        Socket so = sc.accept();

        DataInputStream di = new DataInputStream(so.getInputStream());
        DataOutputStream dout = new DataOutputStream(so.getOutputStream());

        Thread read = new Thread(){
            public void run(){
                
                try {
                    System.out.println("Client : " + di.readUTF());
                } catch (IOException e) {
                    
                    e.printStackTrace();
                }
            }
        };

        Thread write = new Thread(){
            public void run(){
                try {
                    dout.writeUTF(System.console().readLine("You :"));
                } catch (IOException e) {
                    
                    e.printStackTrace();
                }
            }
        };

        read.start();
        write.start();

        sc.close();
        so.close();
    }
}