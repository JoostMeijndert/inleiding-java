package h11;


import java.awt.*;
import java.applet.*;


public class Opdracht1 extends Applet {

    public void init() {
        setSize(400, 400);
    }

    public void paint(Graphics g) {
        int teller = 0;
        int x = 0;

        while(teller < 10) {
            x += 20;
            g.drawLine(x ,50, x, 350 );

            teller++;
        }
    }
}

