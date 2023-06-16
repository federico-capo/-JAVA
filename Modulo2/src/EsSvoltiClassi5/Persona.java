package EsSvoltiClassi5;

public class Persona {
    private String nome;
    private String cognome;
    private String indirizzo;
    private String telefono;

    //getter Setter
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
    public String getIndirizzo() {
        return indirizzo;
    }
    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Persona [nome=" + nome + ", cognome=" + cognome + ", indirizzo=" + indirizzo + ", telefono=" + telefono
                + "]";
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Persona other = (Persona) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (cognome == null) {
            if (other.cognome != null)
                return false;
        } else if (!cognome.equals(other.cognome))
            return false;
        if (indirizzo == null) {
            if (other.indirizzo != null)
                return false;
        } else if (!indirizzo.equals(other.indirizzo))
            return false;
        if (telefono == null) {
            if (other.telefono != null)
                return false;
        } else if (!telefono.equals(other.telefono))
            return false;
        return true;
    }

    public Persona(String nome, String cognome, String indirizzo, String telefono) {
        this.nome = nome;
        this.cognome = cognome;
        this.indirizzo = indirizzo;
        this.telefono = telefono;
    }
    public static void main(String[] args) {
        Persona p = new Persona("Federico", "Giors", "Via Roma", "333-313-333");
        Persona p1 = new Persona("Federico", "Giors", "Via Roma", "333-313-333");
        // Persona p1 = new Persona("Federico1", "Giors1", "Via Roma1", "333-313-3331");
        System.out.println(p);
         System.out.println(p.equals(p1));
    }
    
}
