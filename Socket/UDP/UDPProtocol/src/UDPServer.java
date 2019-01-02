import java.io.*;
import java.net.*;

class UDPServer {
    public static void main(String[] args) throws SocketException,IOException {
        DatagramSocket dSocket = new DatagramSocket();
        String str = "Banchood ";
        InetAddress ip = InetAddress.getByName("localhost");
        DatagramPacket dp = new DatagramPacket(str.getBytes(), str.length(),ip ,3000 );
        dSocket.send(dp);
        dSocket.close();
    }
}