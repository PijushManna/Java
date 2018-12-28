package permission;

import java.io.FilePermission;
import java.security.PermissionCollection;

class filePerm {
    public static void main(String[] args) {
        String src = "D:\\My turorials\\Java\\Console\\ConsoleDemo\\permission\\-";
        FilePermission fp = new FilePermission(src, "read");
        FilePermission fp2 = new FilePermission("D:\\My turorials\\Java\\Console\\ConsoleDemo\\permission\\java.txt",
                "read,write");
        PermissionCollection perColl = fp.newPermissionCollection();
        perColl.add(fp);
        perColl.add(fp2);

        

        System.out.println(perColl.implies(new FilePermission(src, "read,write")));
        System.out.println(fp2.getActions());
        
        if (fp2.getActions().equals("read,write")) {
            System.out.print("Permission granted");
        } else {
            System.out.print("Permission not granted");    
        }
    }
}