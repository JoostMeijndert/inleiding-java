package h11;


import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class praktijkopdracht2 extends Applet{
    Button knopup;
    String tekst;
    Label label;
    int nummer;

    @Override
    public void init() {
        setSize(400, 400);
        knopup = new Button(" Ok  ");
        knopup.addActionListener(new praktijkopdracht2.OkButtonActionListener());
        knopup = new Button(" Ok  ");
        tekst = "";
        label = new Label("Druk op Oke");
        add(label);
        add(knopup);

    }

    @Override
    public void paint(Graphics g) {

        for (int i = 1; i <= 10; i++) {
            g.drawString(i + " x " + nummer + " = " + (i * nummer), 50, 50 + i * 20);
        }

    }

    public class OkButtonActionListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            nummer++;
            repaint();
        }
    }

}