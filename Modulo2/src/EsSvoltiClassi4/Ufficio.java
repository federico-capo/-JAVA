package EsSvoltiClassi4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ufficio {
	private Impiegato[] listaImpiegati;
	public Ufficio(Impiegato[] listaImpiegati) {
		super();
		this.listaImpiegati = listaImpiegati;
	}
	
	public int mMedia(int[] m) {
		int somma=0;
		int numerImpiegati = 0;
		for (Impiegato impiegato : listaImpiegati) {
			for (int impiegato2 : m) {
				if(impiegato.getMatricola()== impiegato2) {
					numerImpiegati++;
					somma= somma+impiegato.getRetribuzione();
				}
			}
		}
		int media = somma/numerImpiegati;
//		System.out.println("la media è : " + media);
		return media;
	}
	public static void main(String[] args) {
		
		Impiegato p = new Impiegato("Aldo","Rossi",1000,1);
		Impiegato p1 = new Impiegato("Flar","bet",2000,2);
		Impiegato p2 = new Impiegato("bub","asd",1000,3);
		
		Impiegato[] elencoIMP = new Impiegato[3];
		elencoIMP[0]= p;
		elencoIMP[1]= p1;
		elencoIMP[2]= p2;
		
		Ufficio u = new Ufficio(elencoIMP);
		
		int[] m = new int[4];
		m[0]=2;
		m[1]=3;
		m[2]=40;
		m[3]=10;
		
		int media= u.mMedia(m);
		System.out.println(media);
	}
	
}
