import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

class BufferedWriterExample {
    public static void main(String[] args) {
        try {
            BufferedWriter br = new BufferedWriter(new OutputStreamWriter(System.out));

            br.write("Welvome to my coding");

            br.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
		} 

    }
}