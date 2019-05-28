package Utili;

import Soggetti.Femmina;
import Soggetti.Figlio;
import Soggetti.Maschio;

import java.awt.*;

public class MostraGrafico implements InfoUtili {

    private MyFrame frame = new MyFrame("Sviluppo popolazione", 0);
    private Container c = frame.getContentPane();//dentro ad ogni JFrame c'è un Container recuperabile con getContentPane()

    public void riempiGrafico(Matrice mat, String str){

        Pannello pannello = new Pannello();


        for(int i = 0; i < mat.getnRigheComplete(); i++)
        {
            if(str.equals("Maschi")) {
                Maschio maschio = new Maschio(mat.getElement(i, 0), mat.getElement(i, 1));
                pannello.addMaschio(maschio);
            }
            else if (str.equals("Femmine")){
                Femmina femmina = new Femmina(mat.getElement(i, 0), mat.getElement(i, 1));
                pannello.addFemmina(femmina);
            }
            else if(str.equals("Figli")){
                Figlio figlio = new Figlio(mat.getElement(i, 0), mat.getElement(i, 1));
                pannello.addFiglio(figlio);
            }
        }        c.add(pannello);

        frame.setVisible(true);//lo imposto visible in questo metodo altrimenti me lo mostra prima del frame bottoni
    }


}
