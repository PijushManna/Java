import java.awt.*;

class SampleButton2{
    public static void main(String[] args) {
        // Create a feame
        Frame f = new Frame();
        f.setSize(300,300);
        f.setVisible(true);
        f.setLayout(null);

        // Create components
        Button b = new Button("Click me");
        b.setBounds(30,100, 100, 30);

        // Add components
        f.add(b);
    }
}