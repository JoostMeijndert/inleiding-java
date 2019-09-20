package h11;


import java.awt.*;
import java.applet.*;


public class Opdracht7 extends Applet {

    public void init() {
        setSize(1000, 1000);
    }

    public void paint(Graphics g) {
        int teller = 0;



        while(teller < 50) {



            g.drawArc(10*teller, 10*teller, 1000 - 20 * teller, 1000 - 20 * teller, 0, 360);

            teller++;
        }
    }
}