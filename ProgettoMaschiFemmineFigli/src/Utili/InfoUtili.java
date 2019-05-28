package Utili;

public interface InfoUtili {

    int numSquare = 100; //Numero di quadrati per lato
    int squareDimension = 100; //dimensioni del singolo quadratino

    int numMaschiIniziali = 200;//numero di maschi all'inizio della simulazione
    int numFemmineIniziali = 150;//numero di femmine all'inizio della simulazione

    int Coordinate = 2;//numero di colonne della matrice, in cui ogni riga rappresenta le coordinate di ciascun soggetto


    //Matrice di maschi (la dimensione è tale per cui non sarà mai piena)
    Matrice matriceMaschi = new Matrice(numSquare*squareDimension, Coordinate);
    //Matrice di femmine (la dimensione è tale per cui non sarà mai piena)
    Matrice matriceFemmine = new Matrice(numSquare*squareDimension, Coordinate);
    //Matrice di figli (la dimensione è tale per cui non sarà mai piena)
    Matrice matriceFigli = new Matrice(numSquare*squareDimension, Coordinate);

    //Matrice che controlla che i soggetti non si sovrappongono
    Matrice matriceDiControllo = new Matrice(numSquare*numSquare*squareDimension*squareDimension, Coordinate);



    double distanzaMassima = squareDimension * Math.sqrt(2); //distanza oltre la quale i soggetti non interagiscono tra loro

}
