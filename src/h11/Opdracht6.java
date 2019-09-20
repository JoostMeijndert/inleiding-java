package h11;


import java.awt.*;
import java.applet.*;


public class Opdracht6 extends Applet {

    public void init() {
        setSize(400, 400);
    }

    public void paint(Graphics g) {
        int teller = 1;


        while(teller <= 5) {


            g.drawArc(10*teller, 10*teller, 100 - 20 * teller, 100 - 20 * teller, 0, 360);

            teller++;
        }
    }
}