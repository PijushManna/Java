import java.awt.*;

/** Sample button using inheritance */
class SampleButton extends Frame{
    private static final long serialVersionUID = -1662413809685693587L;

    SampleButton() {
        setSize(300,300);
        setLayout(null);
        setVisible(true);
        Button b = new Button("Click Me");
        b.setBounds(30,100, 80, 30);
        add(b);
        
    }
    public static void main(String[] args) {
         new SampleButton();
    }
}