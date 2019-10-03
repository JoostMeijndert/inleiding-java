package h12;

import java.applet.Applet;
import java.awt.*;


public class Opdracht1 extends Applet{

    int[] getallen;
    int totaal;
    int aantal;

    public void init() {
        getallen = new int[10];

        for (int i = 0; i < getallen.length; i++) {
            getallen[i] = (int)(Math.random() * 100 + 1);
            totaal += getallen[i];
            aantal++;

        }

    }

    public void paint(Graphics g) {
        int x = 50;
        for (int i = 0; i < getallen.length; i++) {
            g.drawString("" + getallen[i], x, 25);
            x +=20;

        }

        g.drawString("het gemiddelde is: " + ((double) totaal / aantal), 50, 50);

    }
}
