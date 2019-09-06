package h05;


import java.applet.*;
import java.awt.*;


public class Opdracht2 extends Applet {

    int gewichtValerie;
    int getGewichtJeroen;
    int getGewichtHans;
    int hoogteXas;
    public void init(){

        setSize(400,400);
        gewichtValerie = 40;
        getGewichtJeroen = 100;
        getGewichtHans = 80;
        hoogteXas = 350;


    }

    @Override
    public void paint(Graphics g) {
      g.drawLine(50,50, 50, hoogteXas);
      g.drawLine(50,hoogteXas, hoogteXas, hoogteXas);

      g.setColor(Color.red);
      g.fillRect(51, hoogteXas-gewichtValerie, 80, gewichtValerie);
      g.setColor(Color.blue);
      g.fillRect(151, hoogteXas-getGewichtHans, 80, getGewichtHans);
        g.setColor(Color.orange);
        g.fillRect(251, hoogteXas-getGewichtJeroen, 80, getGewichtJeroen);

        g.setColor(Color.black);
        g.drawString("40", 30, hoogteXas-gewichtValerie );
        g.setColor(Color.black);
        g.drawString("80", 30, hoogteXas-getGewichtHans );
        g.setColor(Color.black);
        g.drawString("100", 30, hoogteXas-getGewichtJeroen );


    }
}