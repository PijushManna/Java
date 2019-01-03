import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ChoiceDemo{
    public static void main(String[] args) {
        // Set the frame
        Frame f = new Frame("Select Options");
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);

        // create the components
        Choice chs = new Choice();
        Button b = new Button("Select");
        Label lbl = new Label();
        
        // set the boundary
        chs.setBounds(100,100,100,100);
        b.setBounds(150,200,80,30);
        lbl.setBounds(50,300,300,30);

        // add the components
        f.add(b);
        f.add(lbl);
        f.add(chs);
        chs.add("c++");
        chs.add("Java");
        chs.add("Python");
        chs.add("HTML");
        chs.add("Ruby");

        // Add action listener
        b.addActionListener(new ActionListener(){
        
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = "Programming Language selected : "+chs.getSelectedItem();
                lbl.setText(text);
            }
        } );
    }
}