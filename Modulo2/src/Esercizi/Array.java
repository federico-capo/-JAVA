package Esercizi;

import java.util.Iterator;

public class Array {

	public static void main(String[] args) {
		 int[] array = {20,19,18,17,16,15,14,13,12,11,10};
		 
		// determino la lunghezza dell array
		 int lunghezza = array.length;
//		 int[] arrayInvertito = new int [lunghezza];
//		 
//		 for(int i = 0; i < lunghezza; i++){
//		 	arrayInvertito[i] = array[lunghezza -1 -i];
//		 	System.out.print(arrayInvertito[i] + " ");
//		 }
//		 

		 for (int i = lunghezza - 1; i >= 0; i--) {
			    System.out.print(array[i] + "-");
			}
		 System.out.println("-----");
		 for(int i = 0; i < array.length;i++) {
			 if (i%2==0){
				// System.out.println("numero pari: "+array[i]);
			 }
			 if (i%2==1) {
				 int tempDispari= array[i];
				 //System.out.println(tempDispari);
			 } 
		 }//fine for pari dispari
	}

}
