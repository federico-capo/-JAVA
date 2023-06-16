package com;

import java.util.Scanner;
public class elseif {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("inserisci un numero : ");
		int pos = scan.nextInt();
		
		if (pos < 100) {
			System.out.println("minore di 100");
		}else if (pos < 200) {
			System.out.println("maggiore di 100");
		}else {
			System.out.println("maggiore di 200 e 100");
		}
	}

}
