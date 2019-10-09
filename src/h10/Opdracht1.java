package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht1 extends Applet{

    TextField tekstvak;
    Label label;
    int hoogsteGetal;
    boolean isGeklikt;

    @Override
    public void init() {
        setSize(400, 400);
        tekstvak = new TextField("", 30);
        label = new Label("type hier uw getal.");
        tekstvak.addActionListener( new TekstvakListener() );
        add(label);
        add(tekstvak);
        hoogsteGetal = Integer.MIN_VALUE;
        isGeklikt = false;

    }

    @Override
    public void paint(Graphics g) {

        if (isGeklikt) {
            g.drawString("hoogste getal is: "+ hoogsteGetal, 50, 50);
        }


    }
    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            isGeklikt = true;
            String invoer = tekstvak.getText();
            int getal = Integer.parseInt( invoer );
            if ( getal > hoogsteGetal ) {
                hoogsteGetal = getal;
                repaint();
            }

        }
    }
}