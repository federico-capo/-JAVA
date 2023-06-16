package com;

import java.util.Scanner;

public class array {

	public static void main(String[] args) {
		//iniziallizzo scan 
		Scanner scan = new Scanner(System.in);
		// System.out.println("Inserisci il lato in cm");

		// int input = scan.nextInt();


		//array 
		//con int dico che tipo di dati all interno dell array
		//grandezza è detta size
		//
		// int[] array = new int[2];
		// float[] tmp = new float[30];
		// //voglio modificare il contenuto di una cella
		// array[1]=30;
		// array[0]=20;

		//array piu grande
		//la dimensione dell array è data solo  creazione dell array
		int[] prova = {1,33,22,34,55};
		//stampa array 
		for(int i=0; i<5; i++){
			System.out.println("prova[i]");
		}
		//visto che in questo caso ho un array di 5 caselle ma se il mio array fosse
		//piu grande dovrei aggiungere una proprieta dell array .length
		//cosi evito di cambiare i<5 in tutti i miei cicli for aggiungendo solo i<nomearray.length
		for(int i=0; i<5; i++){
			System.out.println(prova[i]);
		}

	}

}
