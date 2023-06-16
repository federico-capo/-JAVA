package com;

import java.util.Scanner;
public class eserciziarraysvolti {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("inserisci testo :");

        String testo = scan.nextLine();

        String[] array = testo.split(" ");

        // for(int i = 0; i< array.length; i= i+1){
        //     System.out.println(array[i]);
        // }

        //prendo il per ultimo
        System.out.println(array[array.length-2]);

    }
}
