package EsSvoltoClassi;

public class Giocatore {
	private String nome;
	private int annoDiNascita;
	private boolean capitano;
	

	//getter setter
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getAnnoDiNascita() {
		return annoDiNascita;
	}
	public void setAnnoDiNascita(int annoDiNascita) {
		this.annoDiNascita = annoDiNascita;
	}
	public boolean isCapitano() {
		return capitano;
	}
	public void setCapitano(boolean capitano) {
		this.capitano = capitano;
	}
}
