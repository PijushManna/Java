import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class DialogDemo {
    public static void main(String[] args) {
        Frame f = new Frame("My frame");
        // f.setSize(300,300);
        // f.setLayout(null);
        // f.setVisible(true);

        Dialog d = new Dialog(f,"My Dialog",true);
        d.setSize(200,200);
        d.setVisible(true);
        d.setLayout(new FlowLayout());

        Button b = new Button("Click me");
        b.setBounds(100, 200, 100 , 30);
        b.addActionListener( new ActionListener(){
        
            @Override
            public void actionPerformed(ActionEvent e) {
                d.setVisible(true);
            }
        } );

        
    }
}