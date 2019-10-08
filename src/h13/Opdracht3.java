package h13;



import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht3 extends Applet{
    Button rodemuur;
    Button grijzemuur;
    Button reset;
    boolean rood;
    boolean grijs;

    @Override
    public void init() {
        setSize(700, 500);
        rodemuur = new Button("rode muur");
        rodemuur.addActionListener(new rodemuurActionlistener());
        grijzemuur = new Button("grijze muur");
        grijzemuur.addActionListener(new grijzemuurActionlistener());
        reset = new Button("reset");
        reset.addActionListener(new resetActionlistener());
        add(rodemuur);
        add(grijzemuur);
        add(reset);
        rood = false;
        grijs = false;

    }

    @Override
    public void paint(Graphics g) {
        if(rood){
            g.setColor(Color.red);
            tekenmuur(g, 50, 50, 100, 50);
            tekenmuur(g, 151, 50, 100, 50);
            tekenmuur(g, 252, 50, 100, 50);
            tekenmuur(g, 353, 50, 100, 50);
            tekenmuur(g, 0, 101, 100, 50);
            tekenmuur(g, 101, 101, 100, 50);
            tekenmuur(g, 202, 101, 100, 50);
            tekenmuur(g, 303, 101, 100, 50);
            tekenmuur(g, 404, 101, 100, 50);
            tekenmuur(g, 50, 152, 100, 50);
            tekenmuur(g, 151, 152, 100, 50);
            tekenmuur(g, 252, 152, 100, 50);
            tekenmuur(g, 353, 152, 100, 50);
            tekenmuur(g, 0, 203, 100, 50);
            tekenmuur(g, 101, 203, 100, 50);
            tekenmuur(g, 202, 203, 100, 50);
            tekenmuur(g, 303, 203, 100, 50);
            tekenmuur(g, 404, 203, 100, 50);
            tekenmuur(g, 50, 254, 100, 50);
            tekenmuur(g, 151, 254, 100, 50);
            tekenmuur(g, 252, 254, 100, 50);
            tekenmuur(g, 353, 254, 100, 50);
        }
        if(grijs){
            g.setColor(Color.gray);
            tekenmuur(g, 50, 50, 120, 60);
            tekenmuur(g, 171, 50, 120, 60);
            tekenmuur(g, 292, 50, 120, 60);
            tekenmuur(g, 413, 50, 120, 60);
            tekenmuur(g, 0, 111, 120, 60);
            tekenmuur(g, 121, 111, 120, 60);
            tekenmuur(g, 242, 111, 120, 60);
            tekenmuur(g, 363, 111, 120, 60);
            tekenmuur(g, 484, 111, 120, 60);
            tekenmuur(g, 50, 172, 120, 60);
            tekenmuur(g, 171, 172, 120, 60);
            tekenmuur(g, 292, 172, 120, 60);
            tekenmuur(g, 413, 172, 120, 60);
            tekenmuur(g, 0, 233, 120, 60);
            tekenmuur(g, 121, 233, 120, 60);
            tekenmuur(g, 242, 233, 120, 60);
            tekenmuur(g, 363, 233, 120, 60);
            tekenmuur(g, 484, 233, 120, 60);
            tekenmuur(g, 50, 294, 120, 60);
            tekenmuur(g, 171, 294, 120, 60);
            tekenmuur(g, 292, 294, 120, 60);
            tekenmuur(g, 413, 294, 120, 60);


        }
    }

    public class rodemuurActionlistener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            rood = true;
            grijs = false;
            repaint();
        }

    }

    public class grijzemuurActionlistener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            grijs = true;
            rood = false;
            repaint();
        }
    }

    public class resetActionlistener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            grijs = false;
            rood= false;
            repaint();
        }
    }

    void tekenmuur( Graphics g, int x1, int y1, int width, int height){

        g.fillRect(x1, y1, width, height);
    }


}
