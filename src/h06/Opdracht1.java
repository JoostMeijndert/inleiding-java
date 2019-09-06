package h06;

        ;
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
public class Opdracht1 extends Applet{
    int a;
    int b;
    int uitkomst;


    //een (lege) methode die de Applet initialiseert
    public void init() {
        a=113;
        b=3;
        uitkomst=a/b;


    }
    //een methode die de inhoud van het scherm tekent
    public void paint(Graphics g) {
        g.drawString("De uitkomst is: " + uitkomst, 20, 20);

    }

}
