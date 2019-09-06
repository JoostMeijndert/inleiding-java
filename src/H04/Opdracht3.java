package H04;

import java.awt.*;
import java.applet.*;

public class Opdracht3 extends Applet {
    @Override
    public void init() {
    }

    @Override
    public void paint(Graphics g) {
        setBackground(Color.black);
        g.setColor(Color.white);
        g.drawRect(800,100,10,800);
        g.setColor(Color.red);
        g.fillRect(811,100,400,50);
        g.setColor(Color.white);
        g.fillRect(811,150,400,50);
        g.setColor(Color.blue);
        g.fillRect(811,200,400,50);
    }
}