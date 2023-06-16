package EsSvoltiClassi6;

public class Libro {
    private String titolo;
    private String autore;
    private int prezzo;
    public String getTitolo() {
        return titolo;
    }
    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }
    public String getAutore() {
        return autore;
    }
    public void setAutore(String autore) {
        this.autore = autore;
    }
    public int getPrezzo() {
        return prezzo;
    }
    public void setPrezzo(int prezzo) {
        this.prezzo = prezzo;
    }
    public Libro(String titolo, String autore, int prezzo) {
        this.titolo = titolo;
        this.autore = autore;
        this.prezzo = prezzo;
    }
    @Override
    public String toString() {
        return "Libro [titolo=" + titolo + ", autore=" + autore + ", prezzo=" + prezzo + "]";
    }
    
}
