package esSvoltoClassi2;

import java.util.ArrayList;
import java.util.List;

public class Progetto {
	private String nome;
	private String città;
	private int budget;
	private List<Impiegato> partecipanti = new ArrayList<Impiegato>();
	
	//set getter.
	public Progetto(String nome) {
		this.nome= nome;
	}
	public String getNome() {
		return nome;
	}
//	public void setNome(String nome) {
//		this.nome = nome;
//	}
	public String getCittà() {
		return città;
	}
	public void setCittà(String città) {
		this.città = città;
	}
	public int getBudget() {
		return budget;
	}
	public void setBudget(int budget) {
		this.budget = budget;
	}
	public List<Impiegato> getPartecipanti() {
		return partecipanti;
	}
	public void setPartecipanti(List<Impiegato> partecipanti) {
		this.partecipanti = partecipanti;
	}
	@Override
	public String toString() {
		return "Progetto [nome=" + nome + ", città=" + città + ", budget=" + budget + ", partecipanti=" + partecipanti
				+ "]";
	}
	
	
}
