package challenge;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Opdracht5 extends Applet{
    TextField tijdinvoer;
    Button knopOk;
    int amsterdam;
    int newyork;
    int tokyo;
    int london;
    int shanghai;

    public void init() {
        tijdinvoer = new TextField("", 30);
        knopOk = new Button("OK");
        add(tijdinvoer);
        add(knopOk);
        knopOk.addActionListener(new Actionlistener());


    }

    @Override
    public void paint(Graphics g) {

            g.drawString("de tijd in londen is: " + london + ":00", 50, 100);
            g.drawString("de tijd in New York is: " + newyork + ":00", 50, 120);
            g.drawString("de tijd in Tokyo is: " + tokyo + ":00", 50, 140);
            g.drawString("de tijd in Shanghai is: " + shanghai + ":00", 50, 160);


    }

    private class Actionlistener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            String s = tijdinvoer.getText();
            amsterdam = Integer.parseInt(s);


            if(amsterdam < 25 || amsterdam > 0) {
                london = amsterdam - 1;
                newyork = amsterdam - 6;
                tokyo = amsterdam + 7;
                shanghai = amsterdam + 6;
            }


            else{
            }




            repaint();
        }
    }
}
