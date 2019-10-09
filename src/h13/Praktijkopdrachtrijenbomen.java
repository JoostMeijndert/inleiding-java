package h13;

import java.applet.Applet;
import java.awt.*;

public class Praktijkopdrachtrijenbomen extends Applet{
    int x1 = 50;
    int y1 = 50;
    int width = 50;
    int height = 100;
    @Override
    public void init() {
        setSize(1000, 700);
    }

    @Override
    public void paint(Graphics g) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 6; j++) {
                tekenstam(g, x1, y1, 40, 100);

                x1 += 150;
            }
            x1 = 50;
            y1 += 250;
        }
    }

    void tekenstam( Graphics g, int x1, int y1, int width, int height){
        g.setColor(Color.black);
        g.fillRect( x1, y1 + height, width, height);
        g.setColor(Color.green);
        g.fillOval(x1 - width, y1, width * 3, height);
    }
}
