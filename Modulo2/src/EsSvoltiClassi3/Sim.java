package EsSvoltiClassi3;

public class Sim {
	private int numeroSim;
	private int importo;
	private Telefonata[] telefonateFatte = new Telefonata[10];
	private Telefonata[] telefonateRicevute  = new Telefonata[10];
	
	public void aggiungiTelefonataFatta(Telefonata f) {
		for(int i = telefonateFatte.length -2;i>=0;i--) {
			telefonateFatte[i+1]= telefonateFatte[i];
		}
		telefonateFatte[0]=f;
	}
	public void stampaTelefonateFatte() {
		System.out.println("Chiamate Fatte:");
		for (int i = 0; i < telefonateFatte.length; i++) {
			if(telefonateFatte[i]!= null)
			System.out.println(telefonateFatte[i].getNumero());
		}
	}
	
	public void aggiungiTelefonataRicevute(Telefonata f) {
		for(int i = telefonateRicevute.length -2;i>=0;i--) {
			telefonateRicevute[i+1]= telefonateRicevute[i];
		}
		telefonateRicevute[0]=f;
	}
	public void stampaTelefonateRicevute() {
		System.out.println("Chiamate Ricevute:");
		for (int i = 0; i < telefonateRicevute.length; i++) {
			if(telefonateRicevute[i]!= null)
			System.out.println(telefonateRicevute[i].getNumero());
		}
	}
	
	public void costoTotaleTelefonate() {
		int costoTotale=0;
		for(int i = telefonateFatte.length -2;i>=0;i--) {
			costoTotale= costoTotale+ telefonateFatte[i].getCosto();
			
		}
		System.out.println("costo totale :"+costoTotale+"€");
	}
	public void durataTotaleTelefonate() {
		int durataTotale=0;
		for(int i = telefonateFatte.length -2;i>=0;i--) {
			durataTotale= durataTotale+ telefonateFatte[i].getDurata();
			
		}
		System.out.println("durata totale :"+durataTotale+" Minuti");
	}
	
	
	
	public static void main(String[] args) {
		Sim s = new Sim();
		for (int i = 0; i <12; i++) {
			Telefonata t = new Telefonata();
			t.setNumero(i+300);
			t.setDurata(i+10);
			t.setCosto(i+1);
			s.aggiungiTelefonataFatta(t);
		}
		for (int i = 0; i <12; i++) {
			Telefonata t = new Telefonata();
			t.setNumero(i+300);
			t.setDurata(i+10);
			t.setCosto(i+1);
			s.aggiungiTelefonataRicevute(t);
		}
		
		s.stampaTelefonateFatte();
		s.stampaTelefonateRicevute();
		s.costoTotaleTelefonate();
		s.durataTotaleTelefonate();
		


		
		
		

		
	}
	
}
