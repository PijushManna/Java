import java.awt.*;

/** -------[ Add event using outer class ]---------- */
class BEvent extends Frame{
    private static final long serialVersionUID = 1L;
    Button b;
    TextField tf;

    BEvent(){
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
        Outer action = new Outer(this);
        b.addActionListener(action);
    }

    // Main
    public static void main(String[] args) {
        new BEvent();
    }
}