package Utili;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame implements InfoUtili {

    public MyFrame(String titolo){
        super(titolo);
        setBounds(100, 100, 400, 200);
    }

    public MyFrame(String titolo, int num) {
        super(titolo);
        this.dispose();
        this.setBounds(500, 200, numSquare * squareDimension + 2, numSquare * squareDimension + 23);
        this.setMinimumSize(new Dimension(numSquare * squareDimension + 2, numSquare * squareDimension + 23));
    }

    public MyFrame(String titolo, int num1, int num2) {
        super(titolo);
        this.dispose();
        this.setBounds(700, 300, numSquare * squareDimension + 2, numSquare * squareDimension + 23);
        this.setMinimumSize(new Dimension(numSquare * squareDimension + 2, numSquare * squareDimension + 23));
    }

}
