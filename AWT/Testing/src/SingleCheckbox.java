import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class SingleCheckbox{
    public static void main(String[] args) {
        // Set the frame
        Frame f = new Frame("Checkbox");
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);

        // Create the components
        CheckboxGroup cbg = new CheckboxGroup();
        Checkbox cbx1 = new Checkbox("Male",cbg,false);
        Checkbox cbx2 = new Checkbox("Female",cbg,false);
        Label lbl = new Label();

        // Set the bounds
        cbx1.setBounds(150, 50, 120, 20);
        cbx2.setBounds(150, 100, 120, 20);
        lbl.setBounds(150,150,200,30);

        // Add the components
        f.add(cbx1);
        f.add(cbx2);
        f.add(lbl);

        // Add item listener
        cbx1.addItemListener(new ItemListener(){
        
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(e.getStateChange()==1)
                    lbl.setText("The person is : Male");
                else
                    lbl.setText("");
            }
        });

        cbx2.addItemListener(new ItemListener(){
        
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(e.getStateChange()==1)
                    lbl.setText("The person is : Female");
                else
                    lbl.setText("");
            }
        });
    }
}