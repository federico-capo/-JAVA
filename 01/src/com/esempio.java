package com;

public class esempio {
/*Dispensa Operatoti Logici
	Gli operatori logici sono degli operatori che permettono di mettere in relazione due variabili x e y e restituiscono un risultato di tipo booleano.






	Esempio:

	boolean x = true;

	boolean y =true;



	if(x && y)// sarà true se x e y sono entrambe vere, false altrimenti (almeno una delle due false)

	System.out.println("Condizione verificata");



	if(x || y)// sarà true se almeno una tra x e y è vera (o entrambe), false altrimenti (entrambe false)

	System.out.println("Condizione verificata");



	if(!x)// sarà true se x è falsa e false se x è vera.

	System.out.println("Condizione verificata");







	Esempio

	boolean result1 = true;

	boolean result2 = false;

	boolean result3 = true;

	boolean result4 = false;



	System.out.println("AND Condition 1: "+(result1 && result2));

	System.out.println("AND Condition 2: "+(result2 && result3));

	System.out.println("AND Condition 3: "+(result1 && result3));

	System.out.println("AND Condition 4: "+(result2 && result4));

	System.out.println("AND Condition 5: "+(result2 & result4));





	Questi operatori possono anche essere combinati tra di loro.



	Notare che x e y devono essere o delle variabili booleane o una espressione che ritorna un valore booleano.



	Esempio: espressioni che ritornano un booleano

	int score = 20;

	int temperature = 40;



	if ((score >= 10) && (temperature >= 100)) {

	System.out.println("It's hot out, and so am I!");

	}



	if ((score < 5) || (temperature <= 32)) {

	System.out.println("I'm in a bad mood");

	}



	if (!(score < 5)) {

	System.out.println("Score is 5 or more)");

	}











	Se si combinano gli operatori logici, bisogno aver presente che l’operatore ! ha la massima precedenza e || la minima



	Esempio

	a && b || a && c

	equivalente a

	(a && b) || (a && c)





	Esempio

	a && b || a && c

	equivalente a

	(a && b) || (a && c)







	Esempio

	!a && b || a && !c

	equivalente a

	((!a) && b) || (a && (!c))

*/
}
