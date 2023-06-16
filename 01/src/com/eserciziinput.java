package com;

import java.util.Scanner;

public class eserciziinput {

	public static void main(String[] args) {
		//iniziallizzo scan 
		Scanner scan = new Scanner(System.in);
		
//		System.out.println("//esercizio 1");
//		//esercizio 1
//		int primo = 10;
//		int secondo = 5;
//		if (primo > secondo) {
//			System.out.println("Il primo numero è più grande del secondo");
//		}else {
//			System.out.println("Il primo numero è più piccolo del secondo");
//		}
//		
//		System.out.println("//esercizio 2");
//		//esercizio2
//		int primo2 = 10;
//		int secondo2 = 5;
//		if (primo2 == secondo2) {
//			System.out.println("I numeri inseriti uguali");
//		}else {
//			System.out.println("I numeri inseriti sono diversi");
//		}
//		
//		System.out.println("//esercizio 3");
//		//esercizio3
//		System.out.println("inserisci input1");
//		int input1 = scan.nextInt();
//		System.out.println("inserisci input2");
//		int input2 = scan.nextInt();
//		System.out.println("inserisci input3");
//		int input3 = scan.nextInt();
//		
//		int media = (input1+input2+input3)/3;
//		
//		System.out.println("la media dell esercizio 3 è "+ media);
//		
//		
	
//		
		
//		int maxInt;
//		//esercizio 3
//		System.out.println("inserisci input_Maggiore1");
//		int a = scan.nextInt();
//		System.out.println("inserisci input_Maggiore2");
//		int b = scan.nextInt();
//		System.out.println("inserisci input_Maggiore3");
//		int c = scan.nextInt();
//		
//		if (a > b) {
//		// confronto prima i primi 2 
//			 maxInt  =  a;
//			System.out.println("a maggiore");
//		}else {
//			maxInt  =  b;
//			if (c > maxInt) {
//				System.out.println("c maggiore di a e b");
//			}else {
//				System.out.println("b maggiore di a e c");

		
		// esercizio n4 
//		int Gennaio = 1;
//		int Febbraio = 2;
//		int Marzo = 3;
//		int Aprile = 4;
//		int Maggio = 5;
//		int Giugno = 6;
//		int Luglio = 7;
//		int Agosto = 8;
//		int Settembre =9;
//		int Ottobre = 10;
//		int Novembre = 11;
//		int Dicembre = 12;
//		
//		System.out.println("Inserisci il mese da 1 a 12 per scoprire i giorni: ");
//		int mese = scan.nextInt();
//		
//		if (mese== 1) {
//			System.out.println("Gennaio Ha 31 giorni");
//		}
//		if (mese== 2) {
//			System.out.println("Febbraio Ha 28 giorni");
//		}
//		if (mese== 3) {
//			System.out.println("Marzo Ha 31 giorni");
//		}
//		if (mese== 4) {
//			System.out.println("Aprile Ha 30 giorni");
//		}
//		if (mese== 5) {
//			System.out.println("Maggio Ha 31 giorni");
//		}
//		if (mese== 6) {
//			System.out.println("Giugno Ha 30 giorni");
//		}
//		if (mese== 7) {
//			System.out.println("Luglio Ha 31 giorni");
//		}
//		if (mese== 8) {
//			System.out.println("Agosto Ha 31 giorni");
//		}
//		if (mese== 9) {
//			System.out.println("Settembre Ha 30 giorni");
//		}
//		if (mese== 10) {
//			System.out.println("Ottobre Ha 31 giorni");
//		}
//		if (mese== 11) {
//			System.out.println("Novembre Ha 30 giorni");
//		}
//		if (mese== 12) {
//			System.out.println("Dicembre Ha 31 giorni");
//		}
//		if (mese > 12) {
//			System.out.println("I mesi sono solo 12 quindi scelgi i mesi da 1 a 12");
//		}
//		
//		
		
		
		//eserciozio n 5
		
//		System.out.println("Inserisci la base");
//		int base1 = scan.nextInt();
//		System.out.println("Inserisci la l'altezza");
//		int altezza1 = scan.nextInt();
//		int area_triangolo1 = (base1*altezza1)/2;
//		System.out.println("L'area del triangolo1 è: "+area_triangolo1+ " cm^2");
//		
//		
		
		//eserciozio n 6.
		System.out.println("quale area vuoi calcolare?");
		System.out.println("Digita 1 per calcolare l' area del Rettangolo");
		System.out.println("Digita 0 per calcolare l' area del Triangolo");
		int input = scan.nextInt();

		
		if (input == 1) {
			System.out.println("Inserisci il lato in cm");
			int lato = scan.nextInt();
			int area_rettangolo = (lato*lato);
			System.out.println("L'area del Rettangolo è: "+area_rettangolo+ " cm^2");
		}
		if (input ==0) {
			System.out.println("Inserisci la base");
			int base = scan.nextInt();
			System.out.println("Inserisci la l'altezza");
			int altezza = scan.nextInt();
			int area_triangolo = (base*altezza)/2;
			System.out.println("L'area del triangolo è: "+area_triangolo+ " cm^2");
		}
		
		if (input > 1) {
			System.out.println("Puoi scegliere solo tra 0 e 1");
		}
		
		
		
		
		
		
		
		
		
		
	

	}

}
