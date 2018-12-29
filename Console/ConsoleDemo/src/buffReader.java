import java.io.BufferedReader;
import java.io.IOException;

class buffReader {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(System.console().reader());
        br.readLine();
        br.close();
    }
}