import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;

public class piping{
    public static void main(String[] args) throws IOException{
        PipedReader reader = new PipedReader();
        PipedWriter writer = new PipedWriter();
        
        // Reader Thread
        Thread readerThread = new Thread(){
            public void run(){
                System.out.print(this.getName() + " : ");
                try {
                    reader.connect(writer);
                    // Reading
                    int var = reader.read();
                    while(var != -1){
                        System.out.println((char)var);
                        var = reader.read();
                    }
                    reader.close();
                } catch (Exception e) {
                    System.err.println("Reading Error!!!" + e);
                }
            }
        };

        // Write Thread
        Thread writeThread = new Thread(){
            public void run(){
                System.out.print(this.getName() + " : ");
                try {
                    writer.write("I love india");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        };

        readerThread.start();
        writeThread.start();

        System.gc();
    }
}