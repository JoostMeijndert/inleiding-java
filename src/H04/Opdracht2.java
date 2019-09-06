package H04;

import java.awt.*;
import java.applet.*;

public class Opdracht2 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.yellow);
        g.fillRect(400, 400, 250, 250);
        g.setColor(Color.red);
        g.fillRect(410, 500, 100, 150);
        g.fillRect(540,510,100,65);
        g.setColor(Color.magenta);
        g.drawLine(400,400,525,300);
        g.drawLine(525,300,650,400);

    }
}