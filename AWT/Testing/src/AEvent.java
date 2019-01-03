import java.awt.*;
import java.awt.event.*;

class AEvent extends Frame implements ActionListener{
    private static final long serialVersionUID = 1L;
    TextField tf ;
    Button b;

    /** ----- Event Handling within Class ------- */
    AEvent() {
        // Set the frame
        setSize(300,300);
        setLayout(null);
        setVisible(true);

        // Create components
        tf = new TextField();
        b = new Button("Click me");

        // Set the boundary
        tf.setBounds(60,50,170,20);
        b.setBounds(100,120,80,30);

        // Add the components
        add(tf);
        add(b);

        // Add the action listener
        b.addActionListener(this);

    }


    // Change the action performed event
    public void actionPerformed(ActionEvent e){
        tf.setText("Code Wizard");
    }

    public static void main(String[] args) {
        new AEvent();
    }
}