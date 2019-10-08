package h13;

import java.applet.Applet;
import java.awt.*;

public class praktijkopdracht1 extends Applet{

    public void init() {
        setSize(700, 500);
    }

    public void paint(Graphics g) {
        g.setColor(Color.black);
        tekenstam(g, 75, 120, 20, 50);

        g.setColor(Color.green);
        tekenrond(g,50, 50, 75, 75, 0, 360);

    }

    void tekenrond( Graphics g, int x, int y, int height, int width, int startarc, int endarc){

        g.fillArc(x, y, height, width, startarc, endarc);
    }
    void tekenstam( Graphics g, int x1, int y1, int width, int height){

        g.fillRect(x1, y1, width, height);
    }
}
