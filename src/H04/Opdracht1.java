package H04;


import java.awt.*;
import java.applet.*;

public class Opdracht1 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.drawLine(200,120,350,400);
        g.drawLine(50,400,350,400);
        g.drawLine(200,120,50,400);
    }
}