package Utili;

import Soggetti.Femmina;
import Soggetti.Figlio;
import Soggetti.Maschio;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Pannello extends JPanel implements InfoUtili {

    private List<Femmina> femmina;
    private List<Maschio> maschio;
    private List<Figlio> figlio;

    private int indiceMaschio = 0;
    private int indiceFemmina = 0;
    private int indiceFiglio = 0;

    public Pannello() {
        maschio = new ArrayList<>();
        femmina = new ArrayList<>();
        figlio = new ArrayList<>();
    }

    public void addMaschio(Maschio m){
        maschio.add(m);
        indiceMaschio += 1;
        repaint();
    }

    public void addFemmina(Femmina f){
        femmina.add(f);
        indiceFemmina += 1;
        repaint();
    }

    public void addFiglio(Figlio ff){
        figlio.add(ff);
        indiceFiglio += 1;
        repaint();
    }

    public void clearMaschio(){
        maschio.remove(maschio.size() - 1);
        indiceMaschio -= 1;
    }
    public void clearMaschio(int index){
        maschio.remove(maschio.size() - 1);
        indiceMaschio -= 1;
    }

    public void clearFemmina(){
        femmina.remove(femmina.size() - 1);
        indiceFemmina -= 1;
    }
    public void clearFemmina(int index){
        femmina.remove(index);
        indiceFemmina -= 1;
    }

    public void clearFiglio(){
        while (indiceFiglio > 0){
            figlio.remove(figlio.size() - 1);
            indiceFiglio -= 1;
        }
    }

    public void clearAllFigli(){
        while (indiceFiglio > 0){
            figlio.remove(figlio.size() - 1);
            indiceFiglio -= 1;
        }
    }

    public void clearAll(){
        while(indiceMaschio > 0) {
            maschio.remove(maschio.size() - 1);
            indiceMaschio -= 1;
        }

        while(indiceFemmina > 0) {
            femmina.remove(femmina.size() - 1);
            indiceFemmina -= 1;
        }

        while (indiceFiglio > 0){
            figlio.remove(figlio.size() - 1);
            indiceFiglio -= 1;
        }

        repaint();

    }


    public List getListFemmine(){
        return femmina;
    }



    @Override
    public void paintComponent(Graphics g){
        super.paintComponents(g);

        g.setColor(Color.LIGHT_GRAY);
        for (int i = 0; i <= numSquare * squareDimension; i += squareDimension) {
            g.drawLine(i, 0, i, numSquare * squareDimension);
        }
        for (int j = 0; j <= numSquare * squareDimension; j += squareDimension) {
            g.drawLine(0, j, numSquare * squareDimension, j);
        }

        for(Maschio m : maschio){
            m.Disegna(g);
        }

        for(Femmina f : femmina){
            f.Disegna(g);
        }

        for (Figlio ff : figlio){
            ff.Disegna(g);
        }

    }

}
