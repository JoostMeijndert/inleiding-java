package h11;


import java.awt.*;
import java.applet.*;


public class Opdracht8 extends Applet {

    public void init() {
        setSize(800, 800);
    }

    public void paint(Graphics g) {
        int teller = 0;
        int x = 0;
        int y = 0;


        while(teller < 100) {
            x += 50;
            y += 50;


            g.drawArc(1*teller, 1*teller, 700 - 7 * teller, 700 - 7 * teller, 0, 360);


            teller++;
        }
    }
}