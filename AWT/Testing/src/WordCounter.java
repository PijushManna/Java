import java.awt.*;
import java.awt.event.*;

class WordCounter{
    public static void main(String[] args) {
        // Create frame
        Frame f= new Frame("Word Counter");
        f.setSize(550,500);
        f.setLayout(null);
        f.setVisible(true);

        // Create components
        TextArea tArea = new TextArea();
        Button b = new Button("Count");
        Label lbl = new Label();

        // Set bounds
        tArea.setBounds(50,50,450,400);
        b.setBounds(200, 450, 50, 30);
        lbl.setBounds(400,450,200,30);

        // Add components
        f.add(tArea);
        f.add(b);
        f.add(lbl);

        // Add event listener
        b.addActionListener(new ActionListener(){
        
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = tArea.getText();
                String[] words = text.split("\\s");
                lbl.setText("Words : "+words.length + "\t chars : "+ text.length());
            }
        });
    }
}