import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class test{
    public static void main(String[] args) throws IOException {
        FileOutputStream fo = new FileOutputStream("bytewrite.txt");
        ByteArrayOutputStream bo = new ByteArrayOutputStream();

        String msg = "Hello hello Mike testing";
        byte[] b = msg.getBytes();
        bo.write(b);
        bo.writeTo(fo);
        bo.writeTo(System.out);
    }
}