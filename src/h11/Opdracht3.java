package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht3 extends Applet {
    int cijfer1;
    int cijfer2;
    int som;

    public void init(){
        setSize(600,600);
        cijfer1 = 0;
        cijfer2 = 1;
        som = cijfer1 + cijfer2;
    }
    public void paint(Graphics graphics){

        int x = 20;

        graphics.drawString("" + som,x,50);
        x += 20;
        for(int i = 0; i < 12; i++){
            graphics.drawString("" + som,x,50);
            cijfer1 = cijfer2;
            cijfer2 = som;
            som = cijfer1 + cijfer2;
            x += 30;


        }
    }
}
