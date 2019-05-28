import Bottoni.Bottoni;
import Bottoni.BottoniTuttoInsieme;
import Utili.MyFrame;

import javax.swing.*;
import java.awt.*;

public class test {

    public test(){
        MyFrame f = new MyFrame("Bottoni");
        Container c2 = f.getContentPane();
        //Bottoni btn = new Bottoni();//istanzio un oggetto della classe Bottone

        BottoniTuttoInsieme btn = new BottoniTuttoInsieme();

        c2.add(btn);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new test();
    }

}
