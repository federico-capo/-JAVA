package EsSvoltoClassi;

import java.util.List;

public class Squadra {
	private String nome;
	//minimo 15 giocatori
	private List<Giocatore> giocatori;
	
	//get set
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Giocatore> getGiocatori() {
		return giocatori;
	}

	public void setGiocatori(List<Giocatore> giocatori) {
		this.giocatori = giocatori;
	}
	
}
