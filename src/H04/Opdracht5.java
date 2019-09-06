package H04;

import java.applet.*;
import java.awt.*;


public class Opdracht5 extends Applet {

    @Override
    public void paint(Graphics g) {
        setBackground(Color.blue);
        g.setColor(Color.yellow);
        g.fillArc(200, 200 , 100, 50, 90, 360);


    }
}