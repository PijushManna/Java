import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class buffReader {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(System.console().reader());
        // br.skip(2);
        char [] c = new char[10];
        br.read(c,0,9);
        String str = br.readLine();
        System.out.println("Message : "+str);

        for (char var : c) {
            System.out.print(var + " ");
        }
        br.close();
    }
}