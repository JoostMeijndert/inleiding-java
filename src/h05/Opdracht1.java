package h05;
/*

@(#)Show.java 1.0 03/02/26

*

Voorbeeld 2.1

*

*/

//importeer de benodigde klassen uit de Java bibliotheek
import java.awt.*;
import java.applet.*;

//een klasse met de naam Show van het type Applet
public class Opdracht1 extends Applet {

    //een (lege) methode die de Applet initialiseert
    public void init() {

    }
    //een methode die de inhoud van het scherm tekent
    public void paint(Graphics g) {
        g.setColor(Color.orange);
        g.drawLine(50, 120, 300, 120);
        g.drawRect(50, 150, 250, 100 );
        g.drawRoundRect(50,275,250,100, 25, 25);
        g.setColor(Color.green);
        g.fillRect(350, 150, 250, 100);
        g.setColor(Color.orange);
        g.drawArc(350, 150, 250, 100, 90, 360);
        g.setColor(Color.green);
        g.fillArc(350,275, 250, 100, 90 , 360  );
        g.setColor(Color.orange);
        g.drawArc(650, 150, 250, 100, 90, 360);
        g.setColor(Color.green);
        g.fillArc(650,150, 250, 100, 0 , 45  );
        g.setColor(Color.orange);
        g.drawArc(725, 275, 100, 100, 90, 360);
    }

}