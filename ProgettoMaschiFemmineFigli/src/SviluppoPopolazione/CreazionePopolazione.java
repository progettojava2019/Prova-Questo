package SviluppoPopolazione;

import Utili.InfoUtili;
import Utili.Matrice;
import Utili.Random;

public class CreazionePopolazione implements InfoUtili {

    public Matrice creaSoggetti(Matrice mat, int numSoggetti){

        boolean controllore = true;

        for(int i = 0; i < numSoggetti; i++){
            int x = new Random().randomizza();
            int y = new Random().randomizza();
            if (matriceDiControllo.getnRigheComplete() != 0){
                for (int k = 0; k < matriceDiControllo.getnRigheComplete(); k++) {
                    if (x == matriceDiControllo.getElement(k, 0) && y == matriceDiControllo.getElement(k, 1)) {
                        controllore = false;
                    }
                }
            }
            if (controllore){
                mat.addRiga(x, y);
                matriceDiControllo.addRiga(x, y);
            }
            else {
                i -= 1;
            }
        }
        //new Utili.AggiornaMatriceDiControllo();

        return mat;
    }

}

