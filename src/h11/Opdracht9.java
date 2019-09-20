package h11;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionListener;

public class Opdracht9 extends Applet {
    int x;
    int y;


    public void init(){
        setSize(500,500);
    }

    public void paint(Graphics g){
        y = 50;
        x = 50;


        for (int kolom = 0; kolom < 8; kolom++) {

            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.black);
                g.fillRect(x, y, 50, 50);
            } else {
                g.setColor(Color.white);
                g.fillRect(x, y, 50, 50);
            }
            x += 50;
        }

        //tweede rij
        x = 50;
        y += 50;

        for (int kolom = 0; kolom < 8; kolom++) {
            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.white);
                g.fillRect(x, y, 50, 50);
            } else {
                g.setColor(Color.black);
                g.fillRect(x, y, 50, 50);

            }
            x += 50;
        }
        // derde rij
        y = 150;
        x = 50;


        for (int kolom = 0; kolom < 8; kolom++) {

            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.black);
                g.fillRect(x, y, 50, 50);
            } else {
                g.setColor(Color.white);
                g.fillRect(x, y, 50, 50);
            }
            x += 50;
        }
        //vierde rij
        x = 50;
        y += 50;

        for (int kolom = 0; kolom < 8; kolom++) {
            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.white);
                g.fillRect(x, y, 50, 50);
            } else {
                g.setColor(Color.black);
                g.fillRect(x, y, 50, 50);

            }
            x += 50;
        }
        //vijfde rij
        x = 50;
        y += 50;

        for (int kolom = 0; kolom < 8; kolom++) {
            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.black);
                g.fillRect(x, y, 50, 50);
            } else {
                g.setColor(Color.white);
                g.fillRect(x, y, 50, 50);

            }
            x += 50;
        }
        //zesde rij
        x = 50;
        y += 50;

        for (int kolom = 0; kolom < 8; kolom++) {
            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.white);
                g.fillRect(x, y, 50, 50);
            } else {
                g.setColor(Color.black);
                g.fillRect(x, y, 50, 50);

            }
            x += 50;
        }
        //zevende rij
        x = 50;
        y += 50;

        for (int kolom = 0; kolom < 8; kolom++) {
            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.black);
                g.fillRect(x, y, 50, 50);
            } else {
                g.setColor(Color.white);
                g.fillRect(x, y, 50, 50);

            }
            x += 50;
        }
        //achtste rij
        x = 50;
        y += 50;

        for (int kolom = 0; kolom < 8; kolom++) {
            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.white);
                g.fillRect(x, y, 50, 50);
            } else {
                g.setColor(Color.black);
                g.fillRect(x, y, 50, 50);

            }
            x += 50;
        }


        int x = 50;
        int y = 50;
        int width = 50;
        int height = 50;

        for (int i = 0; i < 8;i++){

            for (int j = 0; j < 8;j++){

                g.drawRect(x,y,width,height);
                x += width;
            }

            x = 50;
            y += height;

        }


    }


}