package h08;
//Voorbeeld 8.7

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdracht3 extends Applet {
    TextField tekstvak;
    Label label;
    double getal;
    double a;
    double b;


    public void init() {
        tekstvak = new TextField("", 20);
        label = new Label("Type een getal");
        tekstvak.addActionListener( new TekstvakListener() );
        add(label);
        add(tekstvak);
        a= 100;
        b= 121;


    }

    @Override
    public void paint(Graphics g) {
        g.drawString(""+ (getal/a) * b, 50, 50 );

    }
    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            getal = Double.parseDouble( s );
            repaint();
        }
    }
}
