package h14;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht1 extends Applet{
    Button deelknop;
    String kaarttekst;
    //deck
    String[] kleuren = {"schoppen", "ruiten", "klaver", "harten"};
    String[] kaarten = {"aas", "twee", "drie", "vier", "vijf", "zes", "zeven",
            "acht", "negen", "tien", "boer", "vrouw", "heer"};


    public String[] deck;

    public void init() {
        deelknop = new Button("deel kaart");
        add(deelknop);
        deelknop.addActionListener(new DeelknopListener());
        setSize(500, 500);
        deck = new String[52];
        int index = 0;
        for (int i = 0; i < kleuren.length; i++) {
            String kleur = kleuren[i];
            for (int j = 0; j < kaarten.length; j++) {
                String kaart = kaarten[j];
                String kleurkaart = kleur + " " + kaart;
                deck[index] = kleurkaart;
                index++;
            }
        }
        kaarttekst = "";
    }


    public void paint(Graphics g) {
        g.drawString(kaarttekst, 50, 50);


    }

    class DeelknopListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            int r = (int) (Math.random() * deck.length);
            kaarttekst = deck[r];
            repaint();

        }
    }

}
