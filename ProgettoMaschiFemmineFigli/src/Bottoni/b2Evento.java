package Bottoni;

import SviluppoPopolazione.EvoluzioneFigli;
import Utili.InfoUtili;
import Utili.MostraGrafico;

import javax.swing.*;

public class b2Evento extends JPanel implements InfoUtili {

    public b2Evento(){

        new EvoluzioneFigli(matriceFigli);

        MostraGrafico g3 = new MostraGrafico();
        g3.riempiGrafico(matriceMaschi, "Maschi");
        g3.riempiGrafico(matriceFemmine, "Femmine");
        g3.riempiGrafico(matriceFigli, "Figli");


        System.out.println("Matrice maschi");
        matriceMaschi.stampaMatrice();
        System.out.println("Matrice femmine");
        matriceFemmine.stampaMatrice();
        System.out.println("Matrice figli");
        matriceFigli.stampaMatrice();
        System.out.println("Matrice BUFFER");
        matriceDiControllo.stampaMatrice();

        System.out.println();
    }

}
