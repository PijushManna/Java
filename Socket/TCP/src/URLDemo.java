import java.io.*;
import java.net.*;
import java.util.Scanner;

public class URLDemo {
    public static void main(String[] args) throws IOException{
        String spec = "http://www.javatpoint.com/java-tutorial";
        URLConnection conn = (new URL(spec)).openConnection();
        Scanner sc = new Scanner(conn.getInputStream());
        while(sc.hasNext()){
            System.out.println(sc.next());
        }
        sc.close();
    }
}