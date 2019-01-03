import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

class PopupMenuDemo{
    public static void main(String[] args) {
        Frame f= new Frame("Popup Menu");
        f.setLayout(null);
        f.setSize(400,400);
        f.setVisible(true);

        PopupMenu popupMenu = new PopupMenu();
        MenuItem cut = new MenuItem("cut");
        MenuItem copy = new MenuItem("copy");
        MenuItem paste = new MenuItem("paste");

        popupMenu.add(cut);
        popupMenu.add(copy);
        popupMenu.add(paste);

        f.add(popupMenu);

        f.addMouseListener(new MouseListener(){
        
            @Override
            public void mouseReleased(MouseEvent e) {
                
            }
        
            @Override
            public void mousePressed(MouseEvent e) {
                
            }
        
            @Override
            public void mouseExited(MouseEvent e) {
                
            }
        
            @Override
            public void mouseEntered(MouseEvent e) {
                
            }
        
            @Override
            public void mouseClicked(MouseEvent e) {
                // popupMenu.show(f, e.getX(), e.getY());
                popupMenu.show(f, e.getX(), e.getY());
            }
        } );

        
    }
}