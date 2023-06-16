package arrayList;
import java.util.ArrayList;
import java.util.List;
public class arraylist {
	
	
	public static void main(String[] args) {
		Persona p = new Persona();
		p.setCognome("Pippo");
		Persona p1 = new Persona();
		p1.setCognome("Pluto");

		/*gli array hanno problemi di dimensioni
		ad esempio se io creo un array di persone cosi
		Persona[] array1 = new Persona[4];
		in questo caso posso aggiungere solo 4 persone
		è una limitazione
		per superare questa limitazione esistono gli
		ARRAYLIST che sono array dinamici,Gli elementi contenuti sono di un solo tipo: Object.
	 	posso inserire quanti elementi voglio cosi
		*/
		List<Persona> PersoneArray = new ArrayList<>();
		//cosi posso aggiungere con add quante oggetti nella arraylist
		
		PersoneArray.add(p);
		PersoneArray.add(p1);
		//Per Richiamare un oggetto nell ArrayList bisogna usare:
		//Persona r = PersoneArray.get(index) dove index sta per numero di cella
		Persona r = PersoneArray.get(0);
		System.out.println(r.getCognome());//Pippo 
		//poichè è stato il primo oggetto inserito
		
		//Per Stampare il contenuto di un arraylist ci sono svariati modi
		//ad esempio il ciclo for
		for(int i= 0; i<PersoneArray.size();i++) {
			Persona c = PersoneArray.get(i);
			System.out.println(c.getCognome());
		}
		//oppure il for each
			//classe //nome variabile /nome array
		for(Persona persona : PersoneArray) {
			System.out.println(persona.getCognome());
		}
		
		/*
		 Sintassi:

		ArrayList<Integer> arrli = new ArrayList<Integer>();// arrayList di integer
			
		I metodi più importanti sono:
		
		arrli.add(i); // aggiunge l’oggetto i
		
		arrli.remove(3);// rimmuove l elemento nella posizione 3
		
		arrli.size();// ritorna il numero di elementi presenti nell'arraylist
		
		arrli.get(5);// ritorna l'oggetto memorizzato nella posizione 5		
		 */
	}




}
