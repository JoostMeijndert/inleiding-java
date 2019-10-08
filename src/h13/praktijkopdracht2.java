package h13;

import java.applet.Applet;
import java.awt.*;

public class praktijkopdracht2 extends Applet{

    public void init() {
        setSize(700, 500);
    }

    public void paint(Graphics g) {
        g.setColor(Color.black);
        tekenstam(g, 75, 120, 20, 50);
        tekenstam(g, 175, 120, 20, 50);
        tekenstam(g, 275, 120, 20, 50);
        tekenstam(g, 375, 120, 20, 50);
        tekenstam(g, 475, 120, 20, 50);
        tekenstam(g, 575, 120, 20, 50);
        tekenstam(g, 75, 320, 20, 50);
        tekenstam(g, 175, 320, 20, 50);
        tekenstam(g, 275, 320, 20, 50);
        tekenstam(g, 375, 320, 20, 50);
        tekenstam(g, 475, 320, 20, 50);
        tekenstam(g, 575, 320, 20, 50);
        g.setColor(Color.green);
        tekenrond(g,50, 50, 75, 75, 0, 360);
        tekenrond(g,150, 50, 75, 75, 0, 360);
        tekenrond(g,250, 50, 75, 75, 0, 360);
        tekenrond(g,350, 50, 75, 75, 0, 360);
        tekenrond(g,450, 50, 75, 75, 0, 360);
        tekenrond(g,550, 50, 75, 75, 0, 360);
        tekenrond(g,50, 250, 75, 75, 0, 360);
        tekenrond(g,150, 250, 75, 75, 0, 360);
        tekenrond(g,250, 250, 75, 75, 0, 360);
        tekenrond(g,350, 250, 75, 75, 0, 360);
        tekenrond(g,450, 250, 75, 75, 0, 360);
        tekenrond(g,550, 250, 75, 75, 0, 360);
    }

    void tekenrond( Graphics g, int x, int y, int height, int width, int startarc, int endarc){

        g.fillArc(x, y, height, width, startarc, endarc);
    }
    void tekenstam( Graphics g, int x1, int y1, int width, int height){

        g.fillRect(x1, y1, width, height);
    }
}
