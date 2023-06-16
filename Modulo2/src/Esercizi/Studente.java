package Esercizi;

public class Studente {

    private String nome;
    private String cognome;
    private int eta;

    //getter e setter
    //set
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }
    public void setEta(int eta) {
        this.eta = eta;
    }
    //get
    public String getNome() {
        return nome;
    }
    public String getCognome() {
        return cognome;
    }
    public int getEta() {
        return eta;
    }

    public static void main(String[] args) {

        Studente s = new Studente();
        //imposto i valori degli attribuiti all'oggetto
        s.setNome("Federico");
        s.setCognome("Capo");
        s.setEta(24);
        
        //Ottieni i valori degli attributi utilizzando i metodi getter
        String nome = s.getNome();
        String cognome = s.getCognome();
        int eta = s.getEta();
        
        // Stampa i dati
        System.out.println("Nome: " + nome);
        System.out.println("Cognome: " + cognome);
        System.out.println("Età: " + eta);

    }
}
