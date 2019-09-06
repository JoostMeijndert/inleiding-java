package h06;

import java.applet.Applet;
import java.awt.*;

public class Opdracht3 extends Applet{

    int hoogsteInt = 2147483647;
    int nogHoger = hoogsteInt + 2;



    @Override
    public void paint(Graphics g) {
        g.drawString("" + nogHoger, 50, 50);
    }
}
