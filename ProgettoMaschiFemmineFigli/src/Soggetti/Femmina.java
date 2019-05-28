package Soggetti;

import Utili.InfoUtili;

import java.awt.*;

public class Femmina implements Soggetto, InfoUtili {

    private int x;
    private int y;
    private int dx = squareDimension;

    public Femmina(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public void Disegna(Graphics g) {
        g.setColor(Color.RED);
        g.fillRect(x, y, dx, dx);
    }
}
