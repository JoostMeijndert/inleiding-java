package H04;

import java.applet.*;
import java.awt.*;

public class Opdracht7 extends Applet{

    @Override
    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.black);
        g.drawRect(400, 400, 200, 200 );
        g.setColor(Color.black);
        g.fillOval(425,420,50,50);
        g.fillOval(525,420,50,50);
        g.fillOval(425,520,50,50);
        g.fillOval(525,520,50,50);
    }
}