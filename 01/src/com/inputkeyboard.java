package com;

import java.util.Scanner;

public class inputkeyboard {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
//		
//		System.out.println("inserisci un numero");
//		int r = scan.nextInt();
//		
//		System.out.println("il numero inserito è "+ r);
//		
//		
		
		
 // esercizio n1 3 numeri e fare la media di input
		
		System.out.println("inserisci il primo numero");
		int primo = scan.nextInt();
		System.out.println("inserisci il primo numero");
		int secondo = scan.nextInt();
		System.out.println("inserisci il secondo numero");
		int terzo = scan.nextInt();
		System.out.println("inserisci il terzo numero");
		
		
		int media = (primo + secondo + terzo)/3;
		System.out.println("La media è "+ media);
		
		
		
		
	}

}
