package EsSvoltiClassi4;

public class Impiegato {
	private String cognome;
	private String nome;
	private int retribuzione;
	private int matricola;
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getRetribuzione() {
		return retribuzione;
	}
	public void setRetribuzione(int retribuzione) {
		this.retribuzione = retribuzione;
	}
	public int getMatricola() {
		return matricola;
	}
	public void setMatricola(int matricola) {
		this.matricola = matricola;
	}
	@Override
	public String toString() {
		return "Impiegato [cognome=" + cognome + ", nome=" + nome + ", retribuzione=" + retribuzione + ", matricola="
				+ matricola + "]";
	}
	public Impiegato(String cognome, String nome, int retribuzione, int matricola) {
		super();
		this.cognome = cognome;
		this.nome = nome;
		this.retribuzione = retribuzione;
		this.matricola = matricola;
	}
	
	
}
