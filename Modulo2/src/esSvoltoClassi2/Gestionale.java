package esSvoltoClassi2;

import java.util.ArrayList;
import java.util.List;

public class Gestionale {
	private List<Impiegato> impiegati = new ArrayList<Impiegato>();
	private List<Dipartimento> dipartimenti = new ArrayList<Dipartimento>();
	private List<Progetto> progetti = new ArrayList<Progetto>();
	
	public void aggiungiImpiegato(Impiegato i) {
		impiegati.add(i);
	}
	
	public void eliminaImpiegato(String codFisc) {
		for (Impiegato impiegato : impiegati) {
			if(impiegato.getCodiceFiscale().equals(codFisc)) {
				impiegati.remove(impiegato);
				break;
			}
		}
	}
	
	public void aggiungiProgetto(Progetto p) {
		progetti.add(p);
	}
	
	public void associaImpiegatoProgetto(Progetto p, Impiegato i) {
		for (Progetto prog : progetti) {
			if(prog.getNome().equals(p.getNome())) {
				prog.getPartecipanti().add(i);
			}
		}
	}
	public void aggiungiDipartimento(Dipartimento d) {
		dipartimenti.add(d);
	}
	public void associaImpiegatoDipartimento(Dipartimento d, Impiegato i) {
		for (Dipartimento dip : dipartimenti) {
			if(dip.getNome().equals(d.getNome())) {
				dip.getPartecipanti().add(i);
			}
		}
	}
	public static void main(String[] args) {
		Gestionale g = new Gestionale();
		
		Impiegato i = new Impiegato();
		i.setCodiceFiscale("sad");
		g.aggiungiImpiegato(i);
		
		Progetto p = new Progetto("ProvaG");
		g.aggiungiProgetto(p);
		
		Impiegato f = new Impiegato();
		f.setCodiceFiscale("fff");
		g.associaImpiegatoProgetto(p, f);
		
		Dipartimento d = new Dipartimento();
		d.setNome("ProvaDipartimento");
		g.associaImpiegatoDipartimento(d, f);
		System.out.println(g.toString());
	}

	@Override
	public String toString() {
		return "Gestionale [impiegati=" + impiegati + ", dipartimenti=" + dipartimenti + ", progetti=" + progetti + "]";
	}

}
