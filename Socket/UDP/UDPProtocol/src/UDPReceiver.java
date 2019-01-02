import java.io.*;
import java.net.*;

class UDPReceiver{
    public static void main(String[] args) throws SocketException,IOException {
        DatagramSocket ds = new DatagramSocket(3000);
        byte[] buf = new byte[1024];
        int length = 1024;
        DatagramPacket dp = new DatagramPacket(buf, length);
        ds.receive(dp);
        String msg = new String(dp.getData());
        System.out.println(msg);
        ds.close();
    }
}