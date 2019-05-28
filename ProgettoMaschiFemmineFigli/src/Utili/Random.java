package Utili;
public class Random implements InfoUtili {

    public int randomizza(){
        int minimo = 0;
        int massimo = (numSquare - 1) * squareDimension;
        int range = massimo - minimo + 1;

        int rand = (int) (Math.random() * range) + minimo;

        if (rand % squareDimension != 0) {
            if (rand % squareDimension > squareDimension / 2)
                rand = rand - rand % squareDimension + squareDimension;
            else
                rand = rand - rand % squareDimension;
        }
        return rand;
    }
}
