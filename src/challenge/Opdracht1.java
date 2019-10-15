package challenge;

import java.applet.Applet;
import java.awt.*;

public class Opdracht1 extends Applet{
    @Override
    public void init() {
        setSize(400, 400);
        setBackground(Color.black);
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.fillRect(160, 270, 100, 100);
        g.setColor(Color.white);
        g.fillRect(160, 0, 250, 150);
        g.fillRect(0, 160, 150, 100);
        g.fillRect(160, 160, 250, 100);
        g.fillRect(60, 270, 90, 200);
        g.fillRect(160, 380, 100, 200);
        g.fillRect(270, 270, 200, 200);
        g.setColor(Color.yellow);
        g.fillRect(0, 270, 50, 300);
        g.setColor(Color.red);
        g.fillRect(0, 0, 150, 150);


    }
}
