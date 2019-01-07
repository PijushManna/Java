import javax.swing.*;
import java.awt.event.*;

class Delivery {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setLayout(null);
        frame.setSize(400, 400);
        frame.setVisible(true);

        // Create and add components
        JCheckBox checkBox1 = new JCheckBox("Pizza", false);
        frame.add(checkBox1);
        JCheckBox checkBox2 = new JCheckBox("Burger", false);
        frame.add(checkBox2);
        JCheckBox checkBox3 = new JCheckBox("Cola", false);
        frame.add(checkBox3);

        JLabel label = new JLabel();
        frame.add(label);

        JButton button = new JButton("Pay");
        frame.add(button);

        // Add bounds
        checkBox1.setBounds(120, 100, 100, 30);
        checkBox2.setBounds(120, 150, 100, 30);
        checkBox3.setBounds(120, 200, 100, 30);

        label.setBounds(120, 300, 250, 30);

        button.setBounds(150, 250, 80, 30);

        // Add events
        button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                int amount = 0;
                if (checkBox1.isSelected()) {
                    amount += 100;
                }
                if (checkBox2.isSelected()) {
                    amount += 50;
                }
                if (checkBox3.isSelected()) {
                    amount += 10;
                }

                label.setText("Your bill is :" + amount);
            }
        });

        frame.setDefaultCloseOperation(2);

    }
}