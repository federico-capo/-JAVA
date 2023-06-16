package com;

public class AlgebraBooleana {

	public static void main(String[] args) {
		
	//and && 	
	//or ||
	//not !
		//operatore not 
//		boolean a = true;
//		//ho aggiunto ! per la negazione
////		System.out.println(!a);
//		
//		if ( !a ) {
//			System.out.println("è vera");
//		}else {
//			System.out.println("è falsa");
//		}
		
//		//operatore and
//		boolean a = true;
//		boolean b = false;
//		
//		if ( a && b ) {
//			System.out.println("è vera");
//		}else {
//			System.out.println("è falsa");
//		}
		//operatore or
//		boolean a = true;
//		boolean b = true;
//		
//		if ( a || b ) {
//			System.out.println("è vera");
//		}else {
//			System.out.println("è falsa");
//		}
//		
		
		//combinazione
		boolean a = true;
		boolean b = true;
		int c = 10;
		int d = 40;
		//compara prima le parentesi tonde poi il &&
		if ((c<20) || (d<c) && (a || b) ) {
			System.out.println("condizione è vera");
		}else {
			System.out.println("condizione è falsa");
		}
		
		
	}

}
