package h11;


import java.awt.*;
import java.applet.*;


public class Opdracht2 extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        int x = 50;
        int y = 70;

        for(int i = 20; i > 9;i--){
            g.drawString("" + i,x,y);
            y += 20;
        }
    }
}
