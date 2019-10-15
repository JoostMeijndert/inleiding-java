package challenge;

import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Opdracht2 extends Applet {

    int gewichtValerie;
    int GewichtJeroen;
    int GewichtHans;
    int hoogteXas;
    TextField valerie;
    TextField jeroen;
    TextField hans;
    Button toon;
    Label valerielabel;
    Label jeroenlabel;
    Label hanslabel;
    public void init(){

        setSize(500,400);
        gewichtValerie = 40;
        GewichtJeroen = 100;
        GewichtHans = 80;
        hoogteXas = 350;
        valerie = new TextField("", 10);
        jeroen = new TextField("", 10);
        hans = new TextField("", 10);
        valerielabel = new Label("vallerie");
        jeroenlabel = new Label("jeroen");
        hanslabel = new Label("hans");
        add(valerielabel);
        add(valerie);
        add(hanslabel);
        add(hans);
        add(jeroenlabel);
        add(jeroen);
        toon = new Button("toon");
        toon.addActionListener(new Opdracht2.toonKnopActionListener());
        add(toon);


    }

    @Override
    public void paint(Graphics g) {
        g.drawString("Valerie", 75, 375);
        g.drawString("hans", 175, 375);
        g.drawString("jeroen", 275, 375);


        g.drawLine(50,50, 50, hoogteXas);
        g.drawLine(50,hoogteXas, hoogteXas, hoogteXas);

        g.setColor(Color.red);
        g.fillRect(51, hoogteXas-gewichtValerie * 3, 80, gewichtValerie * 3);
        g.fillRect(151, hoogteXas- GewichtHans * 3, 80, GewichtHans * 3);
        g.fillRect(251, hoogteXas- GewichtJeroen * 3, 80, GewichtJeroen * 3);

        g.setColor(Color.black);
        g.drawString("0", 30, hoogteXas-0 );
        g.drawString("10", 30, hoogteXas-30 );
        g.drawString("20", 30, hoogteXas-60 );
        g.drawString("30", 30, hoogteXas-90 );
        g.drawString("40", 30, hoogteXas-120 );
        g.drawString("50", 30, hoogteXas-150 );
        g.drawString("60", 30, hoogteXas-180 );
        g.drawString("70", 30, hoogteXas-210 );
        g.drawString("80", 30, hoogteXas-240 );
        g.drawString("90", 30, hoogteXas-270 );
        g.drawString("100", 30, hoogteXas-300 );


    }

    public class toonKnopActionListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            String valerietekst = valerie.getText();
            gewichtValerie = Integer.parseInt(valerietekst);
            String jeroentekst = jeroen.getText();
            GewichtJeroen = Integer.parseInt(jeroentekst);
            String hanstekst = hans.getText();
            GewichtHans = Integer.parseInt(hanstekst);
            repaint();
        }
    }
}