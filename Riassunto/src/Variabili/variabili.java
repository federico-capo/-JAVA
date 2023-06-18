package Variabili;

public class variabili {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= {10,20,30,40,50,100,300,90,22};
		int counter= 0;
		for(int i= 0; i<array.length;i++){
			counter= counter+array[i];
		}
		System.out.println(counter);

		//n3
		int max = 0;
		for(int i = 0; i<array.length;i++){
			if(max<array[i]){
				max= array[i];
			}
		}
		System.out.println(max);
	}

}
