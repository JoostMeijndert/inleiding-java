package h12;

import h10.Opdracht5;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;


public class Opdracht3 extends Applet{

    TextField[] tekstvakken;
    Button knopOK;
    int[] cijfers;



    public void init() {
        setSize(800, 300);
        knopOK = new Button(" Ok  ");
        add(knopOK);
        knopOK.addActionListener(new Opdracht3.knopOKActionListener());
        tekstvakken = new TextField[5];
        cijfers = new int[5];
        for (int i = 0; i < tekstvakken.length; i++) {
            tekstvakken[i] = new TextField("", 15);
            add(tekstvakken[i]);

        }

    }

    public void paint(Graphics g) {

    }
    public class knopOKActionListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            for (int i = 0; i < tekstvakken.length; i++) {
                String s = tekstvakken[i].getText();
                int input = Integer.parseInt( s );
                cijfers[i] = input;
            }
            Arrays.sort(cijfers);
            for (int i = 0; i < cijfers.length; i++) {
                tekstvakken[i].setText(String.valueOf(cijfers[i]));

            }


        }

    }
}