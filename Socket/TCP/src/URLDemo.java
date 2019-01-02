import java.io.*;
import java.net.*;
import java.util.Scanner;

public class URLDemo {
    public static void main(String[] args) throws IOException{
        HttpURLConnection conn =(HttpURLConnection) (new URL("https://www.javatpoint.com/java-http-url-connection")).openConnection();
        Scanner sc = new Scanner(conn.getInputStream());
        for (int i = 0; i < 8; i++) {
            System.out.println(conn.getHeaderFieldKey(i)+ " : " + conn.getHeaderField(i));
        }
        sc.close();
    }
}