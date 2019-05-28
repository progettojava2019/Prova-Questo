package Bottoni;

import SviluppoPopolazione.EvoluzionePopolazione;
import Utili.InfoUtili;
import Utili.MostraGrafico;

import javax.swing.*;

public class b1Evento extends JPanel implements InfoUtili {

    public b1Evento(){

        new EvoluzionePopolazione().nascitaFigli(matriceMaschi, matriceFemmine);
        //System.out.println("matrice maschi");
        //matriceMaschi.stampaMatrice();
        //System.out.println("matrice femmine");
        //matriceFemmine.stampaMatrice();
        //System.out.println("matrice figli");
        //matriceFigli.stampaMatrice();


        new EvoluzionePopolazione().lottaSoggetti(matriceMaschi, "Maschi");
        new EvoluzionePopolazione().lottaSoggetti(matriceFemmine, "Femmine");
        //System.out.println("matrice maschi");
        //matriceMaschi.stampaMatrice();
        //System.out.println("matrice femmine");
        //matriceFemmine.stampaMatrice();
        //System.out.println("matrice figli");
        //matriceFigli.stampaMatrice();


        //Disegna su un nuovo frame
        MostraGrafico ggg = new MostraGrafico();
        ggg.riempiGrafico(matriceMaschi, "Maschi");
        ggg.riempiGrafico(matriceFemmine, "Femmine");
        ggg.riempiGrafico(matriceFigli, "Figli");

        //DIsegna sullo stesso frame
            /*g0D.riempiGrafico(matriceMaschi, "Maschi");
            g0D.riempiGrafico(matriceFemmine, "Femmine");
            g0D.riempiGrafico(matriceFigli, "Figli");*/


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
