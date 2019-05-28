package Soggetti;

import Utili.InfoUtili;

import java.awt.*;

public class Maschio implements Soggetto, InfoUtili {

    private int x;
    private int y;
    private int dx = squareDimension;

    public Maschio(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public void Disegna(Graphics g){
        g.setColor(Color.BLUE);
        g.fillRect(x, y, dx, dx);
    }
}
