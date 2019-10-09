package h10;
// Voorbeeld 10.5

import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class Opdracht3 extends Applet {
    TextField tekstvak;
    Label label;
    String s, tekst;
    int maand;

    public void init() {
        setSize(600, 400);
        tekstvak = new TextField("", 20);
        label = new Label("Type een nummer en druk op enter");
        tekstvak.addActionListener( new TekstvakListener() );
        tekst = "";
        add(label);
        add(tekstvak);
    }

    public void paint(Graphics g) {
        g.drawString(tekst, 50, 60 );
    }

class TekstvakListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        s = tekstvak.getText();
        maand = Integer.parseInt( s);
        switch(maand) {
            case 1:
                tekst = "De maand is Januari en er zijn 31 dagen";
                break;
            case 2:
                tekst = "De maand is februari en er zijn 28 dagen";
                break;
            case 3:
                tekst = "De maand is maart en er zijn 31 dagen";
                break;
            case 4:
                tekst = "De maand is april en er zijn 30 dagen";
                break;
            case 5:
                tekst = "De maand is mei en er zijn 31 dagen";
                break;
            case 6:
                tekst = "De maand is juni en er zijn 30 dagen";
                break;
            case 7:
                tekst = "De maand is juli en er zijn 31 dagen";
                break;
            case 8:
                tekst = "De maand is augustus en er zijn 31 dagen";
                break;
            case 9:
                tekst = "De maand is september en er zijn 30 dagen";
                break;
            case 10:
                tekst = "De maand is october en er zijn 31 dagen";
                break;
            case 11:
                tekst = "De maand is november en er zijn 30 dagen";
                break;
            case 12:
                tekst = "De maand is december en er zijn 31 dagen";
                break;
            default:
                tekst = "U hebt een verkeerd nummer ingetikt ..!";
                break;
        }
        repaint();
    }
}
}
