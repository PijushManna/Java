import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

class BufferedWriterExample {
    public static void main(String[] args) {
        try {
            FileWriter fr = new FileWriter("file.txt");
            BufferedWriter br = new BufferedWriter(fr);

            br.write("Welvome to my coding");

            br.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
		} 

    }
}