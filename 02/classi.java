
import java.util.Scanner;

public class classi {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //classi cosè
        //una classe è un entita logica in cuio sono raggruppate informazioni
        //adesempio impiegato e all interno tutti i dati dell impiegato data di nascita ecc..


        //r in questo caso è un istanza della classe impiegato
        impiegato r = new impiegato();
        r.nome= "pippo";
        r.cognome= "puuuuu";


        //r1 in questo caso è un istanza della classe impiegato
        impiegato r1 = new impiegato();
        r1.nome= "pippo2";
        r1.cognome= "puuuuu2";

        r.calcoloCodiceFiscale();
        r1.calcoloCodiceFiscale();


        //posso passare in input dei dati alle classi 
        r.verificaEta(16,2500);

    }
}
