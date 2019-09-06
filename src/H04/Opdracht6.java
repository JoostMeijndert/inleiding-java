package H04;

import java.applet.*;
import java.awt.*;

public class Opdracht6 extends Applet {
    @Override
    public void paint(Graphics g) {
        g.fillRect(400,395,150,375);
        g.setColor(Color.red);
        g.fillOval(425,410,100,100);
        g.setColor(Color.orange);
        g.fillOval(425,530,100,100);
        g.setColor(Color.green);
        g.fillOval(425,650,100,100);
    }
}