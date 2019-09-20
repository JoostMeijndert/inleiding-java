package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht4 extends Applet{
    int a;


    @Override
    public void init() {
        a = 3;

    }

    @Override
    public void paint(Graphics g) {


        for (int i = 1; i <= 10; i++) {
            g.drawString("     x3="+ i * 3, 50, 50 + i * 20);
        }

        int teller;
        int y = 50;

        for(teller = 1; teller < 11; teller++) {
            y += 20;

            g.drawString("" + teller, 50, y );
        }
    }
}

