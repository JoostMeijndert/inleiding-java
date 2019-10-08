package h13;

import java.applet.Applet;
import java.awt.*;

public class Opdracht2 extends Applet{

    @Override
    public void init() {
        setSize(500, 400);

    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.red);
        tekenmuur(g, 50, 50, 100, 50);
        tekenmuur(g, 151, 50, 100, 50);
        tekenmuur(g, 252, 50, 100, 50);
        tekenmuur(g, 353, 50, 100, 50);
        tekenmuur(g, 0, 101, 100, 50);
        tekenmuur(g, 101, 101, 100, 50);
        tekenmuur(g, 202, 101, 100, 50);
        tekenmuur(g, 303, 101, 100, 50);
        tekenmuur(g, 404, 101, 100, 50);
        tekenmuur(g, 50, 152, 100, 50);
        tekenmuur(g, 151, 152, 100, 50);
        tekenmuur(g, 252, 152, 100, 50);
        tekenmuur(g, 353, 152, 100, 50);
        tekenmuur(g, 0, 203, 100, 50);
        tekenmuur(g, 101, 203, 100, 50);
        tekenmuur(g, 202, 203, 100, 50);
        tekenmuur(g, 303, 203, 100, 50);
        tekenmuur(g, 404, 203, 100, 50);
        tekenmuur(g, 50, 254, 100, 50);
        tekenmuur(g, 151, 254, 100, 50);
        tekenmuur(g, 252, 254, 100, 50);
        tekenmuur(g, 353, 254, 100, 50);

    }

    void tekenmuur( Graphics g, int x1, int y1, int width, int height){

        g.fillRect(x1, y1, width, height);

    }

}
