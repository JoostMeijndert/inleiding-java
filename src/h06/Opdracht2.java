package h06;



import java.awt.*;
import java.applet.*;

public class Opdracht2 extends Applet {
    int a;
    int b;
    int g;
    int c;
    int d;
    int e;;
    int uitkomst1;
    int uitkomst3;
    int uitkomst4;

    public void init() {
        a= 1;
        b= 60;
        g= 60;
        c= 24;
        d= 7;
        e= 52;
        uitkomst1= (a * b) * g;
        uitkomst3= (a * b) * (g * c);
        uitkomst4= (a * b) * (g * c) * (d * e);






    }

    public void paint(Graphics g) {
        g.drawString("de hoeveelheid seconden in een uur zijn:" + uitkomst1, 50, 60 );
        g.drawString("de hoeveelheid seconden in een dag zijn:" + uitkomst3, 50, 80 );
        g.drawString("de hoeveelheid seconden in een jaar zijn:" + uitkomst4, 50, 100 );

    }

}
