package h14;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

public class praktijkopdracht extends Applet{
    Label label;
    TextField tekstvak;
    Button okknop;
    String tekstverkeerd;
    String tekstverloren;
    String tekstgewonnen;
    int aantal;
    int x;
    int y;
    Image smiley;
    URL pad;

    @Override
    public void init() {
        setSize(330, 450);
        label = new Label("Type een 1, 2 of 3 en druk druk op OK");
        add(label);
        tekstvak = new TextField(40);
        add(tekstvak);
        okknop = new Button("OK");
        okknop.addActionListener(new knopvakListener());
        add(okknop);
        aantal = 23;
        tekstverkeerd = "";
        tekstverloren = "";
        tekstgewonnen = "";
        pad = praktijkopdracht.class.getResource("/resources/");
        smiley = getImage(pad, "smiley.png");

    }

    @Override
    public void paint(Graphics g) {
        x = 40;
        y = 175;
        for (int i = 0; i < aantal; i++) {
            g.drawImage(smiley, x, y, 40, 40, this);
            x += 50;
            if (i == 4 || i == 9 || i == 14 || i == 19) {
                x = 40;
                y += 50;
            }
        }
        g.setColor(Color.red);
        g.drawString("" + tekstverkeerd, 50, 100);
        g.setColor(Color.red);
        g.drawString("" + tekstverloren, 50, 100);
        g.setColor(Color.black);
        g.drawString("" + tekstgewonnen, 50, 100);
        g.drawString("Er zijn nog "+ aantal + " plaatjes", 50, 150);

    }

    public class knopvakListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            int input = Integer.parseInt(s);
            if( input == 1 || input == 2 || input == 3){
                tekstverkeerd = "";
                aantal -= input;

                // kijken voor goed antwoord
                if( aantal <= 0){
                    tekstverloren = "U heeft verloren";
                }
                else if( aantal == 1){
                    aantal = 0;
                    tekstgewonnen = "U heeft gewonnen";
                } else {
                    // computer is aan zet
                    if( aantal == 22){
                        aantal -= 1;
                    }
                    else if( aantal == 21) {
                        aantal -=(int)(Math.random()*3+1);
                    }
                    else if( aantal == 20){
                        aantal -= 3;
                    }
                    else if( aantal == 19) {
                        aantal -= 2;
                    }
                    else if( aantal == 18){
                        aantal -= 1;
                    }
                    else if( aantal == 17){
                        aantal -=(int)(Math.random()*3+1);
                    }
                    else if( aantal == 16){
                        aantal -= 3;
                    }
                    else if( aantal == 15){
                        aantal -= 2;
                    }
                    else if( aantal == 13){
                        aantal -= (int)(Math.random()*3+1);
                    }
                    else if( aantal == 12){
                        aantal -= 3;
                    }
                    else if( aantal == 11){
                        aantal -= 2;
                    }
                    else if( aantal == 10){
                        aantal -= 1;
                    }
                    else if( aantal == 9){
                        aantal -= (int)(Math.random()*3+1);
                    }
                    else if( aantal == 8){
                        aantal -= 3;
                    }
                    else if( aantal == 7){
                        aantal -= 2;
                    }
                    else if( aantal == 6){
                        aantal -= 1;
                    }
                    else if( aantal == 5){
                        aantal -= (int)(Math.random()*3+1);
                    }
                    else if( aantal == 4){
                        aantal -= 3;
                    }
                    else if( aantal == 3){
                        aantal -= 2;
                    }
                    else if( aantal == 2){
                        aantal -= 1;
                    }
                }
            }
            else{
                tekstverkeerd = "U heeft een verkeerd nummer ingevoerd";
            }
            repaint();
        }
    }
}