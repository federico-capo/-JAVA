package dao;

import java.util.ArrayList;
import java.util.List;


import model.Impiegato;

public class ImpiegatoDao {
	private List<Impiegato> listaImpiegato = new ArrayList<>();

	public  Impiegato ricercaCodiceFiscale(String codiceFiscale) {
		
		return null;
	}
	
	public List<Impiegato> getlistaImpiegato() {
		return listaImpiegato;
	}
	public void inserisci(Impiegato i) {
		listaImpiegato.add(i);
	}
	
	public boolean aggiorna(Impiegato i) {
		
		return false;
	}
	
	public boolean elimina(String codiceFiscale) {
		
		return false;
	}
	
	public static void main(String[] args) {
		ImpiegatoDao t = new ImpiegatoDao();
		Impiegato c = new Impiegato("Federico","Capo","cprf123ss",22);
		Impiegato c1 = new Impiegato("Capo","Rossi","cprf123s22s",23);
		Impiegato c2 = new Impiegato("Stoner","ducatu","cprf333123ss",255);
		t.inserisci(c);
		t.inserisci(c1);
		t.inserisci(c2);
		
		List<Impiegato> listaImpiegato = t.getlistaImpiegato();
		for (Impiegato impiegato : listaImpiegato) {
			System.out.println(impiegato);
		}

	}
}
