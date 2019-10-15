package challenge;

import h08.Opdracht3;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht4 extends Applet{
    Label labelbedrag;
    Label fooipercentage;
    Label labelfooi;;
    TextField textfield;
    Button omlaag;
    Button omhoog;

    double fooi = 15;
    double totaal;
    double fooibedrag;

    @Override
    public void init() {
        labelbedrag = new Label("rekening bedrag");
        labelfooi = new Label("persentage fooi             ");
        fooipercentage = new Label(fooi + "%       ");
        textfield = new TextField("", 30);
        textfield.addActionListener( new TekstvakListener() );
        omlaag = new Button(" - ");
        omlaag.addActionListener(new omlaagActionlistener());
        omhoog = new Button(" + ");
        omhoog.addActionListener(new omhoogActionlistener());
        add(labelbedrag);
        add(textfield);
        add(labelfooi);
        add(fooipercentage);
        add(omlaag);
        add(omhoog);
    }

    @Override
    public void paint(Graphics g) {
        g.drawString("fooi:" + fooibedrag,50, 100);
        g.drawString("Totaal incl. fooi: " + totaal, 50, 125);
    }

    public class omlaagActionlistener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            fooi--;
            fooipercentage.setText(""+ fooi);
        }
    }

    private class omhoogActionlistener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            fooi++;
            fooipercentage.setText(""+ fooi);
        }
    }

    private class TekstvakListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            String tekst = textfield.getText();
            double input = Double.parseDouble(tekst);
            fooibedrag = (input/100) * fooi;
            double afrondenfooi = Math.round( fooibedrag * 100.0 ) / 100.0;
            fooibedrag = afrondenfooi;


            totaal = (input/100) * (100 + fooi);
            double afrondenprijs = Math.round( totaal * 100.0 ) / 100.0;
            totaal = afrondenprijs;


            repaint();
        }
    }
}
