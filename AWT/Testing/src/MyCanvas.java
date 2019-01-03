import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

class MyCanvas extends Canvas{
    MyCanvas(){
        setBackground(Color.GRAY);
        setSize(300,300);
    }
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.RED);
        g.fillOval(100, 50, 100, 100);
    }
}