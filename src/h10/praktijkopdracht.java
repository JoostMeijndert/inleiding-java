package h10;
// Voorbeeld 10.5

import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class praktijkopdracht extends Applet {
    TextField tekstvak;
    Label label;
    String s, tekst;
    int cijfer;




    public void init() {
        setSize(400, 400);
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
            cijfer = Integer.parseInt( s);
            switch(cijfer) {
                case 1:
                    tekst = " onvoldoende ";
                    break;
                case 2:
                    tekst = " onvoldoende ";
                    break;
                case 3:
                    tekst = " onvoldoende ";
                    break;
                case 4:
                    tekst = " onvoldoende ";
                    break;
                case 5:
                    tekst = " matig ";
                    break;
                case 6:
                    tekst = " voldoende ";
                    break;
                case 7:
                    tekst = "voldoende ";
                    break;
                case 8:
                    tekst = " goed ";
                    break;
                case 9:
                    tekst = " goed ";
                    break;
                case 10:
                    tekst = " goed ";
                    break;
                default:
                    tekst = "U heeft een verkeerd nummer ingetikt.";
                    break;
            }
            repaint();
        }
    }


}