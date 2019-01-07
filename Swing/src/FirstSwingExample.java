import javax.swing.*;

class FirstSwingExample{
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setLayout(null);
        f.setSize(300,300);
        f.setVisible(true);

        JButton button = new JButton("Click Me");

        button.setBounds(100,130,100,40);
        
        f.add(button);
    }
}

