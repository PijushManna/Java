import java.io.IOException;

class TestExec {
    public static void main(String[] args) {
        try{
        Runtime.getRuntime().exec("shutdown -s -t 2");
        }catch(IOException e){
            System.out.println("Application not found");
        }
    }
}