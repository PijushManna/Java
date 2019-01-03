import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/** -------[ Add event using anonymous class ]---------- */
class CEvent extends Frame {
    private static final long serialVersionUID = 2L;
    Button b;
    TextField tf;

    CEvent(){
        // Set the frame
        setSize(300,300);
        setLayout(null);
        setVisible(true);

        // create the components
        b = new Button("Show");
        tf = new TextField();

        // Set bounds
        b.setBounds(100, 170, 70, 30);
        tf.setBounds(70,30,170,20);

        // Add components
        add(b);
        add(tf);

        // Add action listener
        b.addActionListener(new ActionListener(){
        
            @Override
            public void actionPerformed(ActionEvent e) {
                tf.setText("Pijush Manna");
            }
        });
    }

    // Main
    public static void main(String[] args) {
        new CEvent();
    }
}