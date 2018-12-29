import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

class writerExample{
    public static void main(String[] args) throws IOException {
        Writer writer = new FileWriter("output.txt");
        String content = "I love India";
        writer.write(content);
        String csq = "google";
        writer.append(csq,0,2);
        writer.close();
    }
}