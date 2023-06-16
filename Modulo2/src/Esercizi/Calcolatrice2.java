package Esercizi;

public class Calcolatrice2 {
	private int a;
	private int b;
	
	//getter and setter
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	//costruttore
	public Calcolatrice2(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
	
	//metodi
	public int somma() {
		int s = a+b;
		System.out.println("la somma è:"+s);
		return s;
	}
	
	public int sottrazione() {
		int s = a-b;
		System.out.println("la differenza è:"+s);
		return s;
	}
	
	public int moltiplicazione() {
		int s = a*b;
		System.out.println("il prodotto  è:"+s);
		return s;
	}
	
	public int divizione() {
		int s = a/b;
		System.out.println("la divisione è:"+s);
		return s;
	}
	
	public static void main(String[] args) {
		Calcolatrice2 c = new Calcolatrice2(10, 2);
		c.somma();
		c.sottrazione();
		c.moltiplicazione();
		c.divizione();
	}
}
