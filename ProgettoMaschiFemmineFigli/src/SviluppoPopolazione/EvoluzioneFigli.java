package SviluppoPopolazione;

import Utili.AggiornaMatriceDiControllo;
import Utili.InfoUtili;
import Utili.Matrice;

public class EvoluzioneFigli implements InfoUtili {

    public EvoluzioneFigli(Matrice figli){

        for (int i = 0; i < figli.getnRigheComplete(); i++){

            double random = Math.random();
            if(random <= 0.3) {
                System.out.println("È femminaaaa!!!!!");
                matriceFemmine.addRiga(figli.getElement(i, 0), figli.getElement(i, 1));
            }
            else{
                System.out.println("È maschiooooo!!!!!");
                matriceMaschi.addRiga(figli.getElement(i, 0), figli.getElement(i, 1));
            }
        }

        matriceFigli.clearMatrice();
        new AggiornaMatriceDiControllo();
    }
}
