import java.awt.*;

public class PanelExample {
    public static void main(String[] args) {
        Frame f = new Frame("Panel Example");
        f.setLayout(null);
        f.setSize(500, 500);
        f.setVisible(true);

        Panel p = new Panel();
        Button b1 = new Button(" Button 1");
        Button b2 = new Button(" Button 2");

        p.setBackground(Color.lightGray);
        b1.setBackground(Color.orange);
        b2.setBackground(Color.red);

        b1.setBounds(50,100,80,30);
        b2.setBounds(100,100,80,30);
        p.setBounds(40,80,200,200);    
        

        f.add(p);
        p.add(b1);
        p.add(b2);
    }
}