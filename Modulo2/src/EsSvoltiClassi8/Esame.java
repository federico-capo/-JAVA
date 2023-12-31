package EsSvoltiClassi8;

public class Esame {
	//informazioni relative allo studente
	private int matricola;
	private String cognome;
	private int voto;
	
	//metodi di accesso 
	public int getMatricola() {
		return matricola;
	}
	public void setMatricola(int matricola) {
		this.matricola = matricola;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public int getVoto() {
		return voto;
	}
	public void setVoto(int voto) {
		this.voto = voto;
	}
	
	public Esame(int matricola, String cognome, int voto) {
		super();
		this.matricola = matricola;
		this.cognome = cognome;
		this.voto = voto;
	}
	@Override
	public String toString() {
		return "Esame [matricola=" + matricola + ", cognome=" + cognome + ", voto=" + voto + "]";
	}
	
}
