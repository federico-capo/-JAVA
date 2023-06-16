package Esercizi;

public class Calcolatrice {

	int a;
	int b;
	
	private void somma() {
		int s = a+b;
		System.out.println("la somma è:"+s);
	}
	
	private void sottrazione() {
		int s = a-b;
		System.out.println("la differenza è:"+s);
	}
	
	private void moltiplicazione() {
		int s = a*b;
		System.out.println("il prodotto  è:"+s);
	}
	
	private void divizione() {
		int s = a/b;
		System.out.println("la divisione è:"+s);
	}
	public static void main(String[] args) {
		Calcolatrice c = new Calcolatrice();
		c.a=10;
		c.b=2;
		
		c.somma();
		c.sottrazione();
		c.moltiplicazione();
		c.divizione();
	}
}
