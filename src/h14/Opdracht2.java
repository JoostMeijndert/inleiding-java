package h14;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Opdracht2 extends Applet {
    Button deelknop;
    String kaarttekst;
    boolean isgeklikt = false;
    //deck
    String[] kleuren = {"schoppen", "ruiten", "klaver", "harten"};
    String[] kaarten = {"aas", "twee", "drie", "vier", "vijf", "zes", "zeven",
            "acht", "negen", "tien", "boer", "vrouw", "heer"};


    public String[] deck;

    public String[] speler1;

    public String[] speler2;

    public String[] speler3;

    public String[] speler4;

    public void init() {
        deelknop = new Button("deel kaart");
        add(deelknop);
        deelknop.addActionListener(new DeelknopListener());
        setSize(500, 500);
        deck = new String[52];

        //spelers
        speler1 = new String[13];
        speler2 = new String[13];
        speler3 = new String[13];
        speler4 = new String[13];

        kaarttekst = "";
    }

    public String deelkaart() {
        int random = new Random().nextInt(deck.length);
        String kaart = deck[random];
        String[] hulplijst = new String[deck.length - 1];
        int hulpindex = 0;
        for (int i = 0; i < deck.length; i++) {
            if (i != random) {
                hulplijst[hulpindex] = deck[i];
                hulpindex++;
            }

        }
        deck = hulplijst;
        return kaart;
    }


    public void paint(Graphics g) {


        int x = 50;
        int y = 50;
        g.drawString("Speler 1", 50, 50);
        g.drawString("Speler 2", 150, 50);
        g.drawString("Speler 3", 250, 50);
        g.drawString("Speler 4", 350, 50);

        if (isgeklikt) {
            for (int i = 0; i < speler1.length; i++) {
                g.drawString("" + speler1[i], x, y + 50);
                g.drawString("" + speler2[i], x + 100, y + 50);
                g.drawString("" + speler3[i], x + 200, y + 50);
                g.drawString("" + speler4[i], x + 300, y + 50);

                y += 15;

            }
        }



    }

    class DeelknopListener implements ActionListener {


        public void actionPerformed(ActionEvent e) {
            isgeklikt = true;
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
            for (int i = 0; i < speler1.length; i++) {

                speler1[i] = deelkaart();
                speler2[i] = deelkaart();
                speler3[i] = deelkaart();
                speler4[i] = deelkaart();


            }
            repaint();
        }





    }

}