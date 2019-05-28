package SviluppoPopolazione;

import Utili.AggiornaMatriceDiControllo;
import Utili.CalcolaDistanze;
import Utili.InfoUtili;
import Utili.Matrice;

public class IncrementoPopolazione implements InfoUtili {

    public IncrementoPopolazione(Matrice m, Matrice f){

        for(int i = 0; i < m.getnRigheComplete(); i++) {
            for (int j = 0; j < f.getnRigheComplete(); j++) {

                float distanzaMF = new CalcolaDistanze().distanza(m.getElement(i,0), m.getElement(i,1), f.getElement(j,0), f.getElement(j,1));

                if (distanzaMF < distanzaMassima) {
                    matriceFigli.addRiga(f.getElement(j,0), f.getElement(j,1));
                    System.out.println("È nato un figlio: ");
                    matriceFigli.stampaMatrice();

                    Matrice nuovoMaschio = new Matrice(1,2);
                    nuovoMaschio = new CreazionePopolazione().creaSoggetti(nuovoMaschio, 1);
                    matriceMaschi.sosituisciRiga(nuovoMaschio, i);

                    Matrice nuovaFemmina = new Matrice(1,2);
                    nuovaFemmina = new CreazionePopolazione().creaSoggetti(nuovaFemmina, 1);
                    matriceFemmine.sosituisciRiga(nuovaFemmina, j);
                }
            }
        }
        new AggiornaMatriceDiControllo();

    }



}
