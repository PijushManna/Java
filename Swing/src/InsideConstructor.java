import javax.swing.*;

class InsideConstructor{
    InsideConstructor(){
        JFrame frame = new JFrame();
        frame.setLayout(null);
        frame.setSize(400,400);
        frame.setVisible(true);

        JButton button = new JButton();
        button.setBounds(130,100,100,40);

        frame.add(button);

    }

    public static void main(String[] args) {
        new InsideConstructor();
    }
}