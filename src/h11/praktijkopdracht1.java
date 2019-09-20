package h11;


import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class praktijkopdracht1 extends Applet{
    TextField tafelnummmer;
    Button knopOK;
    String tekst;
    Label label;
    int input;

    @Override
    public void init() {
        setSize(400, 400);
        tafelnummmer = new TextField("", 30);
        knopOK = new Button(" Ok  ");
        knopOK.addActionListener(new praktijkopdracht1.OkButtonActionListener());
        tekst = "";
        label = new Label("Type iets in het tekstvak en druk op Oke");
        add(label);
        add(tafelnummmer);
        add(knopOK);

    }

    @Override
    public void paint(Graphics g) {

        for (int i = 1; i <= 10; i++) {
            g.drawString(i + " x " + input + " = " + (i * input), 50, 50 + i * 20);
        }

    }

    public class OkButtonActionListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            tekst = tafelnummmer.getText();
            input =Integer.parseInt(tekst);

            repaint();
        }
    }
}