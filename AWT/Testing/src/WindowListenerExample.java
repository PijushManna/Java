import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

class WindowListenerExample{
    public static void main(String[] args) {
        Frame f = new Frame("Window Listener");
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);

        f.addWindowListener(new WindowListener(){
        
            @Override
            public void windowOpened(WindowEvent e) {
                System.out.println("Window opened");
            }
        
            @Override
            public void windowIconified(WindowEvent e) {
                System.out.println("Window Iconified");
            }
        
            @Override
            public void windowDeiconified(WindowEvent e) {
                System.out.println("Window DeIconified");
            }
        
            @Override
            public void windowDeactivated(WindowEvent e) {
                System.out.println("Window Deactivated");
            }
        
            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("Window Closing");
                f.dispose();
            }
        
            @Override
            public void windowClosed(WindowEvent e) {
                System.out.println("Window Closed");
            }
        
            @Override
            public void windowActivated(WindowEvent e) {
                System.out.println("Window Activated");
            }
        });
    }
}