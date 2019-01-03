import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Outer implements ActionListener{
    BEvent event;
    Outer(BEvent obj){
        event = obj;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        event.tf.setText("Welcome");
	}
}