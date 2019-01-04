import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

class KeyListenerExample {
    public static void main(String[] args) {
        Frame f = new Frame("Key listener");
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);

        TextArea ta = new TextArea();
        Label lbl = new Label();
        lbl.setBounds(20,25,200,30);
        ta.setBounds(50,50,200,200);
        ta.setSize(200,200);

        f.add(ta);
        f.add(lbl);

        ta.addKeyListener(new KeyListener(){
        
            @Override
            public void keyTyped(KeyEvent e) {
                String text=ta.getText();  
                String words[]=text.split("\\s");  
                lbl.setText("Words: "+words.length+" Characters:"+text.length());  
            }
        
            @Override
            public void keyReleased(KeyEvent e) {
                
            }
        
            @Override
            public void keyPressed(KeyEvent e) {
                
            }
        });
    }
}