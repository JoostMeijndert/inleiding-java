package h11;


import java.awt.*;
import java.applet.*;


public class Opdracht5 extends Applet {

    public void init() {
        setSize(400, 400);
    }

    public void paint(Graphics g) {
        int teller = 0;
        int x = 0;
        int y = 0;


        while(teller < 5) {
            x += 50;
            y += 50;

            g.drawRect(x, y, 50, 50 );

            teller++;
        }
    }
}
