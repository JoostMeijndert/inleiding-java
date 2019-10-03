package h12;
import h10.Opdracht5;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class Opdracht4 extends Applet {
    Button knopOK;
    TextField tekstvak;
    Label label;
    String s, tekst;
    int[] getalen = { 5, 13, 24, 35, 50};


    public void init() {
        setSize(500, 400);
        knopOK = new Button("OK");
        knopOK.addActionListener(new Opdracht4.OkKnopActionListener());
        tekstvak = new TextField("", 20);
        label = new Label("Type een getal in het tekstvak en druk op enter");
        tekst = "";
        add(label);
        add(tekstvak);
        add(knopOK);
    }
       public void paint(Graphics g) {

        g.drawString(tekst, 50, 60 );
    }

    public class OkKnopActionListener implements ActionListener{
    public void actionPerformed(ActionEvent e) {

        tekst = "het getal is niet gevonden";
            s = tekstvak.getText();
            int cijfer = Integer.parseInt(s);
        for (int i = 0; i < getalen.length; i++) {
            int getal = getalen[i];
            if (cijfer == getal){
                tekst = "het getal is: " + getal + ",  de index is:" + i;
            }
            repaint();

        }

    }

}
}
