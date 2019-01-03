import java.awt.*;

class CanvasDemo{
    public static void main(String[] args) {
        Frame f = new Frame();
        f.setSize(500,500);
        f.setLayout(null);
        f.setVisible(true);

        f.add(new MyCanvas());
    }
}