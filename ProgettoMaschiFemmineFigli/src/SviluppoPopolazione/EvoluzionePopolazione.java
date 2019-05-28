package SviluppoPopolazione;

import Utili.InfoUtili;
import Utili.Matrice;

public class EvoluzionePopolazione implements InfoUtili {


    public void nascitaFigli(Matrice m, Matrice f){
        new IncrementoPopolazione(m, f);
    }

    public void lottaSoggetti(Matrice mat, String s){
        new DecrementoPopolazione(mat, s);
    }


}
