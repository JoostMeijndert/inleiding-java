package h12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class praktijkopdracht extends Applet{
    TextField namenvak;
    TextField nummersvak;
    Button knopOk;
    Label label;
    String[] namen;
    String[] nummers;
    int aantal;

    @Override
    public void init() {
        setSize(500, 400);
        namenvak = new TextField(15);
        nummersvak = new TextField(15);
        knopOk = new Button("Ok");
        knopOk.addActionListener(new praktijkopdracht.OkKnopActionListener());
        label = new Label("type in de vakken en druk op OK");
        add(label);
        add(namenvak);
        add(nummersvak);
        add(knopOk);
        nummers = new String[10];
        namen = new String[10];
    }

    @Override
    public void paint(Graphics g) {
        int y = 50;
        int x1 = 50;
        int x2 = 100;
        if (aantal > 0) {
            for (int i = 0; i < namen.length; i++) {
                g.drawString("" + namen[i], x1, y);
                g.drawString("" + nummers[i], x2, y);
                y += 20;
            }
        }




    }

    public class OkKnopActionListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            String naam= namenvak.getText();
            namen[aantal] = naam;
            String nummer= nummersvak.getText();
            nummers[aantal] = nummer;

            aantal++;
            if (aantal == 10){
                repaint();
            }
        }
    }
}
