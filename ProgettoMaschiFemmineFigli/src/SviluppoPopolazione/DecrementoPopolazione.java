package SviluppoPopolazione;

import Utili.AggiornaMatriceDiControllo;
import Utili.CalcolaDistanze;
import Utili.InfoUtili;
import Utili.Matrice;

public class DecrementoPopolazione implements InfoUtili {

    //uccisioni
    public DecrementoPopolazione(Matrice mat, String str){

        for(int i = 0; i < mat.getnRigheComplete(); i++) {
            for (int j = 0; j < mat.getnRigheComplete(); j++) {

                float distanza = new CalcolaDistanze().distanza(
                        mat.getElement(i,0), mat.getElement(i,1), mat.getElement(j,0), mat.getElement(j,1));

                if(i != j && distanza < distanzaMassima){

                    if(str.equals("Maschi")){
                        System.out.println("Sono morti due maschi");
                        matriceMaschi.removeRiga(j);
                        j -= 1;
                        matriceMaschi.removeRiga(i);
                        i -= 1;
                    }
                    else{
                        System.out.println("Sono morte due femmine");

                        matriceFemmine.removeRiga(j);
                        j -= 1;
                        matriceFemmine.removeRiga(i);
                        i -= 1;
                    }

                }

            }
        }

        new AggiornaMatriceDiControllo();
    }





}
