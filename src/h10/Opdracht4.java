package h10;


import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class Opdracht4 extends Applet {
    TextField maandTextField;
    TextField jaarTextField;
    Label label;
    String s, tekst;
    int maand;
    int jaar;




    public void init() {
        setSize(600, 400);
        maandTextField = new TextField("", 20);
        jaarTextField = new TextField("", 20);
        label = new Label("Type een nummer en druk op enter");
        maandTextField.addActionListener( new TekstvakListener() );
        tekst = "";
        add(label);
        add(maandTextField);
        add(jaarTextField);


    }

    public void paint(Graphics g) {
        g.drawString(tekst, 50, 60 );

    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = maandTextField.getText();
            maand = Integer.parseInt( s );
            switch(maand) {
                case 1:
                    tekst = "De maand is Januari en heeft 31 dagen";
                    break;
                case 2:
                    s = jaarTextField.getText();
                    jaar = Integer.parseInt( s );
                    if ( (jaar % 4 == 0 && !(jaar % 100 == 0)) ||
                            jaar % 400 == 0 ) {
                        tekst = " de maand is februari en heeft 29 dagen ";
                    }
                    else {
                        tekst = " de maand is februari en heeft 28 dagen ";
                    }
                    repaint();
                    break;
                case 3:
                    tekst = "De maand is maart en heeft 31 dagen";
                    break;
                case 4:
                    tekst = "De maand is april en heeft 30 dagen";
                    break;
                case 5:
                    tekst = "De maand is mei en heeft 31 dagen";
                    break;
                case 6:
                    tekst = "De maand is juni en heeft 30 dagen";
                    break;
                case 7:
                    tekst = "De maand is juli en heeft 31 dagen";
                    break;
                case 8:
                    tekst = "De maand is augustus en heeft 31 dagen";
                    break;
                case 9:
                    tekst = "De maand is september en heeft 30 dagen";
                    break;
                case 10:
                    tekst = "De maand is october en heeft 31 dagen";
                    break;
                case 11:
                    tekst = "De maand is november en heeft 30 dagen";
                    break;
                case 12:
                    tekst = "De maand is december en heeft 31 dagen";
                    break;
                default:
                    tekst = "U hebt een verkeerd nummer ingetikt.";
                    break;
            }
            repaint();
        }
    }
}