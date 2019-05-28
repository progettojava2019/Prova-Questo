package Bottoni;

import SviluppoPopolazione.CreazionePopolazione;
import Utili.InfoUtili;
import Utili.MostraGrafico;

import javax.swing.*;

public class b0Evento extends JPanel implements InfoUtili {

    public b0Evento(){

        CreazionePopolazione g0 = new CreazionePopolazione();
        MostraGrafico g0D = new MostraGrafico();


        g0.creaSoggetti(matriceMaschi, numMaschiIniziali);
        g0.creaSoggetti(matriceFemmine, numFemmineIniziali);
        //System.out.println("Matrice maschi");
        //matriceMaschi.stampaMatrice();
        //System.out.println("Matrice femmine");
        //matriceFemmine.stampaMatrice();
        //System.out.println("Matrice buffer");
        //matriceDiControllo.stampaMatrice();

        g0D.riempiGrafico(matriceMaschi, "Maschi");
        g0D.riempiGrafico(matriceFemmine, "Femmine");
        g0D.riempiGrafico(matriceFigli, "Figli");


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
