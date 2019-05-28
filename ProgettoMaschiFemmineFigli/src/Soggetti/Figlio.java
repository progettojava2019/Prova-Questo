package Soggetti;

import Utili.InfoUtili;

import java.awt.*;

public class Figlio implements Soggetto, InfoUtili {

    private int x;
    private int y;
    private int dx = squareDimension;

    public Figlio(int x, int y){
        this.x = x;
        this.y = y;
    }


    @Override
    public void Disegna(Graphics g) {
        g.setColor(Color.GRAY);
        g.fillRect(x, y, dx, dx);
    }
}
