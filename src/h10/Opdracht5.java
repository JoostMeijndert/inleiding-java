package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht5 extends Applet {
    double cijfer;
    TextField tektsvak;
    Label label;
    String tekst;
    String tekstgemiddelde;
    String tekstgeslaagd;
    Button okKnop;
    double totaal;
    double enter;
    double gemiddelde;
    boolean knop;

    public void init(){
        tektsvak = new TextField("",10);
        tektsvak.addActionListener( new TekstvakListener() );
        tekst = "";
        tekstgemiddelde = "";
        label = new Label("type uw cijfer in en druk op OK");
        okKnop = new Button("OK");
        okKnop.addActionListener(new OkKnopActionListener());
        add(label);
        add(tektsvak);
        add(okKnop);
        totaal = 0;
        knop = false;

    }public void paint(Graphics graphics){

        graphics.drawString(tekst,40,50);
        graphics.drawString(tekstgemiddelde,40,75);
        graphics.drawString(tekstgeslaagd,40,100);


    }
    public class OkKnopActionListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            knop = true;

            gemiddelde = totaal / enter;
            tekstgemiddelde = "het gemiddelde is: " + gemiddelde;

            if (cijfer < 5.5){
                tekstgeslaagd = "je bent niet geslaagd";
            }
            else {
                tekstgeslaagd= "je bent geslaagd";
            }
            repaint();

        }
    }

    private class TekstvakListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {

            cijfer = Double.parseDouble(tektsvak.getText());
            totaal += cijfer;
            if (cijfer < 5.5){
                tekst = "het cijfer is onvoldoende";
            }
            else {
                tekst = "het cijfer is voldoende";
            }
            enter++;


            repaint();
        }
    }
}