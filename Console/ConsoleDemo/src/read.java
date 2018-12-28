import java.io.Console;

class read{
    public static void main(String[] args) {
        Console con = System.console();
        // read text
        // String test = System.console().readLine();
        // System.out.println("Your text is : "+test);
        
        // // reader
        // Reader rdr = System.console().reader();
        // System.out.println(rdr.toString());
        // System.console().flush();
        // System.out.println(rdr.toString());

        con.printf("Coolie No %d \n", 1);

        char[] pass = con.readPassword("Enter password :");
        System.out.println("Password : " + String.valueOf(pass));
        

    }
}