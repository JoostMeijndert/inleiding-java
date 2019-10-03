package h12;

import java.applet.Applet;
import java.awt.*;

public class Opdracht2 extends Applet{

    Button[] knoppen;


    public void init() {
        setSize(450, 400);

        knoppen = new Button[25];
        for (int i = 0; i < knoppen.length; i++) {
            knoppen[i] = new Button(" Ok  ");
            add(knoppen[i]);


        }

    }

    public void paint(Graphics g) {
        int x = 50;
        for (int i = 0; i < knoppen.length; i++) {
        }
    }
}