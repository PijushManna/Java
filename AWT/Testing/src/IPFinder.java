import java.awt.*;
import java.net.*;
import java.awt.event.*;

class IPFinder{
    public static void main(String[] args) {
        // Create components
        Frame f = new Frame("IP Finder");
        TextField tf = new TextField();
        Button b= new Button("Find IP");
        Label lbl = new Label();

        // Set the frame
        f.setLayout(null);
        f.setVisible(true);

        // Set bounds
        f.setSize(500,300);
        tf.setBounds(100,50,200,20);
        b.setBounds(150,100,100,30);
        lbl.setBounds(100,150,500,20);

        // Add components
        f.add(tf);
        f.add(b);
        f.add(lbl);

        // Add Action listener
        b.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                String host = tf.getText();
                try {
                    InetAddress addr = InetAddress.getByName(host);

                    lbl.setText(addr.getCanonicalHostName()+"  IP : "+ addr.getHostAddress());
                } catch (UnknownHostException e1) {
                    lbl.setText(e1.toString());
                }
            }
        });

    }
}