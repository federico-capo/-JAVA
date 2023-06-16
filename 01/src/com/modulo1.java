package com;

import java.util.Scanner;

public class modulo1 {

	public static void main(String[] args) {
		//iniziallizzo scan 
		Scanner scan = new Scanner(System.in);
		// System.out.println("Inserisci il lato in cm");
		// int input = scan.nextInt();

		//shifting di un vettore di un array
		//effetua una traslazione o verso destra o verso sinistra
		//un utilizzo protrebbe essere la lettura della temperatura
		//esempio voglio tenere gli ultimi 4 dati di temperatura
		//registrati ogni ora 
		//quando nel mio array che è composto da 4 celle e sono piene 
		// ho registrato pero la nuova temp e ho bisogno di fare lo shift verso destra in questo caso per 
		//registrare la temperatura e tanto a me serve solo gli ultimi 4 dati regisdtrati


		//questo è l array
		// int[] temp={3,4,6,8};
		// //traslazione  verso sinistra
		// //il -1 evita che vada in eccezzione
		// for(int f= 0; f<temp.length-1; f++){
		// 	temp[f]=temp[f+1];
			
		// }
		// //shift verso destra
		// for(int i= temp.length-1; i>0; i--){
		// 	temp[i]=temp[i-1];
		// }

		// //stampa 
		// for(int i= 0; i<temp.length; i++){
		// 	System.out.println(temp[i]);
			
		// }


		
		// int[] array = {20,19,18,17,16,15,14,13,12,11,10};

		// //determino la lunghezza dell array
		// int lunghezza = array.length;

		// int[] arrayInvertito = new int [lunghezza];

		// for(int i = 0; i < lunghezza; i++){
		// 	arrayInvertito[i] = array[lunghezza -1 -i];
		// }
		// // Stampa l'array invertito
		// for (int i = 0; i < lunghezza; i++) {
		// 	System.out.print(arrayInvertito[i] + " ");
		// }

		for(int i = 0; i<20; i++){
			i *=2;
			System.out.println(i);
		}
	}

}
