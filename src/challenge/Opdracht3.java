package challenge;


import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht3 extends Applet{
    Button Fris;
    Button Bier;
    Button Wijn;
    Button Koffie;
    Button Binnenlands;
    Button Buitenlands;
    Button nieuw;
    double totaal = 0;
    double dagbestelling = 0;
    double prijsfris = 2.25;
    double prijsBier = 2.50;
    double prijsWijn = 2.75;
    double prijsKoffie = 2;
    double Binnenlandsgedistilleerd = 3;
    double Buitenlandsgedistilleerd = 3.75;

    public void init() {
        Fris = new Button("   Fris   ");
        Fris.addActionListener(new FrisActionlistener());
        Bier = new Button("   Bier   ");
        Bier.addActionListener(new BierActionlistener());
        Wijn = new Button("   Wijn   ");
        Wijn.addActionListener(new WijnActionlistener());
        Koffie = new Button("   Koffie   ");
        Koffie.addActionListener(new KoffieActionlistener());
        Binnenlands = new Button("binn gedist.");
        Binnenlands.addActionListener(new binnActionlistener());
        Buitenlands = new Button("buit gedist.");
        Buitenlands.addActionListener(new BuitActionlistener());
        nieuw = new Button("nieuw bestelling");
        nieuw.addActionListener(new nieuwActionlistener());
        add(Fris);
        add(Bier);
        add(Wijn);
        add(Koffie);
        add(Binnenlands);
        add(Buitenlands);
        add(nieuw);
    }

    public void paint(Graphics g) {
        g.drawString("Bestelling totaal:" + "€ " + totaal, 50, 100);
        g.drawString("totaal dagomzet:" + "€ " + dagbestelling, 50, 125);

    }

    public class FrisActionlistener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            double prijstotaal = totaal + prijsfris;
            double prijs = dagbestelling + prijsfris;
            totaal= prijstotaal;
            dagbestelling = prijs;
            repaint();
        }
    }

    public class BierActionlistener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            double prijstotaal = totaal + prijsBier;
            double prijs = dagbestelling + prijsBier;
            totaal= prijstotaal;
            dagbestelling = prijs;
            repaint();
        }
    }

    public class WijnActionlistener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            double prijstotaal = totaal + prijsWijn;
            double prijs = dagbestelling + prijsWijn;
            totaal= prijstotaal;
            dagbestelling = prijs;
            repaint();
        }
    }

    public class KoffieActionlistener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            double prijstotaal = totaal + prijsKoffie;
            double prijs = dagbestelling+ prijsKoffie;
            totaal= prijstotaal;
            dagbestelling = prijs;
            repaint();
        }
    }

    public class binnActionlistener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            double prijstotaal = totaal + Binnenlandsgedistilleerd;
            double prijs = dagbestelling + Binnenlandsgedistilleerd;
            totaal= prijstotaal;
            dagbestelling = prijs;
            repaint();
        }
    }

    public class BuitActionlistener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            double prijstotaal = totaal + Buitenlandsgedistilleerd;
            double prijs = dagbestelling + Buitenlandsgedistilleerd;
            totaal= prijstotaal;
            dagbestelling = prijs;
            repaint();

        }
    }

    private class nieuwActionlistener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            totaal = 0;
            repaint();
        }
    }
}
