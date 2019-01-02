import java.io.*;
import java.net.*;

class IPAddress{
    public static void main(String[] args) throws IOException{
        InetAddress ip = InetAddress.getByName("www.facebook.com");
        System.out.println("Host name : "+ip.getHostName()+" Addr: "+ip.getHostAddress());
    }
}