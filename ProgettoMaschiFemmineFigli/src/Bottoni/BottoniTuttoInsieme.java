package Bottoni;

import SviluppoPopolazione.CreazionePopolazione;
import SviluppoPopolazione.EvoluzioneFigli;
import SviluppoPopolazione.EvoluzionePopolazione;
import Utili.InfoUtili;
import Utili.MostraGrafico;

import javax.swing.*;
import java.awt.*;

//In questa classe provo a fare in modo che venga aggiornato sempre lo stesso frame
public class BottoniTuttoInsieme extends JPanel implements InfoUtili {

    public BottoniTuttoInsieme(){

        JButton b0 = new JButton("Inizio simulazione");
        b0.setEnabled(true);
        JButton b1 = new JButton("Interazione");
        b1.setEnabled(false);
        JButton b2 = new JButton("Crescita figli");
        b2.setEnabled(false);
        JButton b3 = new JButton("Interazione");
        b3.setEnabled(false);

        b0.setFont(new Font("Courier new", Font.BOLD, 30));
        add(b0);
        b0.addActionListener(e -> {

            CreazionePopolazione g0 = new CreazionePopolazione();
            MostraGrafico g0D = new MostraGrafico();

            g0.creaSoggetti(matriceMaschi, numMaschiIniziali);
            g0.creaSoggetti(matriceFemmine, numFemmineIniziali);

            g0D.riempiGrafico(matriceMaschi, "Maschi");
            g0D.riempiGrafico(matriceFemmine, "Femmine");
            g0D.riempiGrafico(matriceFigli, "Figli");

            b0.setEnabled(false);
            b1.setEnabled(true);
        });



        b1.setFont(new Font("Courier new", Font.BOLD, 30));
        add(b1);
        b1.addActionListener(e -> {

            new EvoluzionePopolazione().nascitaFigli(matriceMaschi, matriceFemmine);

            new EvoluzionePopolazione().lottaSoggetti(matriceMaschi, "Maschi");
            new EvoluzionePopolazione().lottaSoggetti(matriceFemmine, "Femmine");

            //Disegna su un nuovo frame
            MostraGrafico ggg = new MostraGrafico();
            ggg.riempiGrafico(matriceMaschi, "Maschi");
            ggg.riempiGrafico(matriceFemmine, "Femmine");
            ggg.riempiGrafico(matriceFigli, "Figli");

            //DIsegna sullo stesso frame
            /*g0D.riempiGrafico(matriceMaschi, "Maschi");
            g0D.riempiGrafico(matriceFemmine, "Femmine");
            g0D.riempiGrafico(matriceFigli, "Figli");*/


            b1.setEnabled(false);

            if(matriceFigli.getnRigheComplete() != 0)
                b2.setEnabled(true);
        });



        b2.setFont(new Font("Courier new", Font.BOLD, 30));
        add(b2);
        b2.addActionListener(e -> {

            new EvoluzioneFigli(matriceFigli);

            MostraGrafico g3 = new MostraGrafico();
            g3.riempiGrafico(matriceMaschi, "Maschi");
            g3.riempiGrafico(matriceFemmine, "Femmine");
            g3.riempiGrafico(matriceFigli, "Figli");

            //DIsegna sullo stesso frame
            /*g0D.riempiGrafico(matriceMaschi, "Maschi");
            g0D.riempiGrafico(matriceFemmine, "Femmine");
            g0D.riempiGrafico(matriceFigli, "Figli");*/


            b2.setEnabled(false);
            b1.setEnabled(true);

        });

    }
}
