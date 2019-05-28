package Bottoni;

import Utili.InfoUtili;

import javax.swing.*;
import java.awt.*;

public class Bottoni extends JPanel implements InfoUtili {

    public Bottoni(){

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

            new b0Evento();

            b0.setEnabled(false);
            b1.setEnabled(true);
        });



        b1.setFont(new Font("Courier new", Font.BOLD, 30));
        add(b1);
        b1.addActionListener(e -> {

            new b1Evento();

            b1.setEnabled(false);

            if(matriceFigli.getnRigheComplete() != 0)
                b2.setEnabled(true);
        });



        b2.setFont(new Font("Courier new", Font.BOLD, 30));
        add(b2);
        b2.addActionListener(e -> {

            new b2Evento();
            b2.setEnabled(false);
            b1.setEnabled(true);

        });




        /*JButton clearAll = new JButton("CLEAR ALL");
        clearAll.setFont(new Font("Courier new", Font.BOLD, 35));
        add(clearAll, BorderLayout.SOUTH);
        clearAll.addActionListener(e -> {

            matriceMaschi.clearMatrice();
            matriceFemmine.clearMatrice();
            matriceFigli.clearMatrice();
            matriceDiControllo.clearMatrice();

            b0.setEnabled(true);
        });*/

    }
}
