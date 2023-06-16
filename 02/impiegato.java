

public class impiegato {
    String nome;
    String cognome;


    //posso inserire anche delle operazioni all interno delle classi

    //ad esempio calcolo codice fiscale
    public void calcoloCodiceFiscale() {
        System.out.println("Codice fiscale: "+nome+cognome);
    }
// posso passare piu  dati cosi: basta
    public void verificaEta(int eta,int stipendio) {
        if(eta > 18){
            System.out.println("è maggiorenne");
        }else{
            System.out.println("è minorenne");
        }
    }
}
