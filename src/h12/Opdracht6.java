package h12;

        import java.applet.Applet;
        import java.awt.*;
        import java.awt.event.ActionEvent;
        import java.awt.event.ActionListener;

public class Opdracht6 extends Applet{
    TextField textField;
    Button knopOK;
    Label label;
    String tekst;
    int[] getallen = {5, 5, 13, 13, 40, 40, 77, 77, 5};
    int aantal;

    public void init() {
        setSize(500, 300);
        textField = new TextField(20);
        knopOK = new Button("OK");
        knopOK.addActionListener(new Opdracht6.OkKnopActionListener());
        label = new Label("Type en getal in het tekstvak en druk op OK");
        add(label);
        add(textField);
        add(knopOK);
        tekst = "";
    }

    @Override
    public void paint(Graphics g) {

        g.drawString(tekst, 50, 60);
    }
    public class OkKnopActionListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {

            aantal = 0;
            tekst = "het getal is niet gevonden";
            String s = textField.getText();
            int input = Integer.parseInt(s);
            for (int i = 0; i < getallen.length; i++) {
                int getal = getallen[i];
                if (input == getal){
                    aantal++;
                }
            }

            if (aantal > 0) {
                tekst = "het getal is " + aantal + " keer gevonden";
            }
            repaint();
        }
    }
}
