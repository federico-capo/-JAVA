package EsSvoltiClassi7;

public class Trasloco {
    private String data;
    private int codiceCliente;
    private String nome;
    private String cognome ;

    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
    public int getCodiceCliente() {
        return codiceCliente;
    }
    public void setCodiceCliente(int codiceCliente) {
        this.codiceCliente = codiceCliente;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCognome() {
        return cognome;
    }
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }
    @Override
    public String toString() {
        return "Trasloco [data=" + data + ", codiceCliente=" + codiceCliente + ", nome=" + nome + ", cognome=" + cognome
                + "]";
    }
    public Trasloco(String data, int codiceCliente, String nome, String cognome) {
        this.data = data;
        this.codiceCliente = codiceCliente;
        this.nome = nome;
        this.cognome = cognome;
    }
    
}
