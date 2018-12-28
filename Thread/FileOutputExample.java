import java.io.FileOutputStream;
import java.io.IOException;

class FileOutputExample {
    public static void main(String[] args) throws IOException{
        FileOutputStream fout = new FileOutputStream("test.txt");
        String s = "Writing in file";
        byte[] sbytes = s.getBytes();
        fout.write(65);
        fout.write(sbytes);
        fout.close();
        System.out.println("Success...");
    }
}