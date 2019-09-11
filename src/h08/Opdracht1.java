package h08;


import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class  Opdracht1 extends Applet {

    Button knopOK;
    Button knopRESET;
    TextField tekstvak;
    Label label;
    String schermtekst;

    public void init(){
        tekstvak = new TextField("",30);
        add(tekstvak);
        knopOK = new Button("Oke");
        add(knopOK);
        knopRESET = new Button("Reset");
        add(knopRESET);
        label= new Label("Type iets in het tekstvak en druk op Oke");
        add(label);
        knopOK.addActionListener(new OkButtonActionListener());
        knopRESET.addActionListener(new resetKnopactionListener());


    }

    public void paint(Graphics graphics){

    }
    class resetKnopactionListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            tekstvak.setText("");
            label.setText("");
            repaint();

        }
    }

    class OkButtonActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            schermtekst = tekstvak.getText();
            label.setText(schermtekst);
            repaint();
        }
    }
}