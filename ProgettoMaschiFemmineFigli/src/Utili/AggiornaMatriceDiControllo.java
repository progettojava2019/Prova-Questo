package Utili;

import Utili.InfoUtili;

public class AggiornaMatriceDiControllo implements InfoUtili {


    public AggiornaMatriceDiControllo(){

        matriceDiControllo.clearMatrice();

        for(int i = 0; i < matriceMaschi.getnRigheComplete(); i++){
            matriceDiControllo.addRiga(matriceMaschi.getElement(i,0), matriceMaschi.getElement(i,1));
        }
        for(int j = 0; j < matriceFemmine.getnRigheComplete(); j++){
            matriceDiControllo.addRiga(matriceFemmine.getElement(j,0), matriceFemmine.getElement(j,1));
        }
        for(int k = 0; k < matriceFigli.getnRigheComplete(); k++){
            matriceDiControllo.addRiga(matriceFigli.getElement(k,0), matriceFigli.getElement(k,1));
        }

    }
}
