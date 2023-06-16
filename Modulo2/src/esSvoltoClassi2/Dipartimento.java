package esSvoltoClassi2;

import java.util.ArrayList;
import java.util.List;

public class Dipartimento {
	private String nome;
	private int numeroTelefono;
	private Impiegato dirigente;
	private String cittàSede;
	private String regioneSede;
	private List<Impiegato> impiegati = new ArrayList<Impiegato>();
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getNumeroTelefono() {
		return numeroTelefono;
	}
	public void setNumeroTelefono(int numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
	}
	public Impiegato getDirigente() {
		return dirigente;
	}
	public void setDirigente(Impiegato dirigente) {
		this.dirigente = dirigente;
	}
	public String getCittàSede() {
		return cittàSede;
	}
	public void setCittàSede(String cittàSede) {
		this.cittàSede = cittàSede;
	}
	public String getRegioneSede() {
		return regioneSede;
	}
	public void setRegioneSede(String regioneSede) {
		this.regioneSede = regioneSede;
	}
	public List<Impiegato> getImpiegati() {
		return impiegati;
	}
	public void setImpiegati(List<Impiegato> impiegati) {
		this.impiegati = impiegati;
	}
	

	@Override
	public String toString() {
		return "Dipartimento [nome=" + nome + ", numeroTelefono=" + numeroTelefono + ", dirigente=" + dirigente
				+ ", cittàSede=" + cittàSede + ", regioneSede=" + regioneSede + ", impiegati=" + impiegati + "]";
	}
	public List<Impiegato> getPartecipanti() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
