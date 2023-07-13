package EsSvoltiClassi8;

import java.util.ArrayList;
import java.util.List;

public class Corso {
	private List<Esame> listaEsami;

	//creo il costrutto che inizializza array
	public Corso() {
		listaEsami = new ArrayList<>();
	}
	//creo un metodo per inserire e uno per vedere gli esami
	public void aggiungiEsame(Esame esame) {
		listaEsami.add(esame);
	}
	public List<Esame> getListaEsami() {
		return listaEsami;
	}
	public static void main(String[] args) {
		
		Corso c = new Corso();
		Esame e = new Esame(44, "Capo",8);
		Esame e1 = new Esame(22, "Rossi",10);
		Esame e2 = new Esame(333, "Voci",2);
		Esame e4 = new Esame(555, "Voci3",3);
		c.aggiungiEsame(e);
		c.aggiungiEsame(e1);
		c.aggiungiEsame(e2);
		c.aggiungiEsame(e4);
		
		//stampo la lista
		List<Esame> listaEsami = c.getListaEsami();
		
		int votoMinimo = 33;
		String cognomeStudente = null; 
		int numeroMatricola = 0;
	
		for (Esame esame : listaEsami) {
			if(esame.getVoto()< votoMinimo ) {
				votoMinimo=esame.getVoto();
				cognomeStudente= esame.getCognome();
				numeroMatricola = esame.getMatricola();
			}
		}
		System.out.println("Stundente con il voto piu' basso è: "+cognomeStudente+" Voto: "+votoMinimo +" Numero matricola: "+numeroMatricola);
	}
}
