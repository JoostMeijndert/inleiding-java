package h06;



import java.awt.*;
import java.applet.*;

public class practijkopdracht extends Applet {
    int a;
    int b;
    int c;
    int d;
    int uitkomst;


    public void init() {
        a= (int) 5.9;
        b= (int) 6.3;
        c= (int) 6.9;
        d= 3;
        uitkomst= (int) (a +b +c) / d;

    }

    public void paint(Graphics g) {
        g.drawString("het grmiddelde cijfer van de cursist is:"+uitkomst, 50, 50 );

    }

}
