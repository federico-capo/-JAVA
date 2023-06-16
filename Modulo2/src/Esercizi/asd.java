package Esercizi;

public class asd {
    public static void main(String[] args) {
        int[] array = {2, 4, 6, 8, 10,21,1,14};
        
        int somma=0;
        for(int i = 0; i<array.length;i++){
            somma=somma+array[i];
        }
        int media= somma/array.length;
        //massimo
        int max = array[0];
        for(int i=0;i<array.length;i++){
            if (array[i]>max){
                max=array[i];
            }
        }
        //minimo
        int min = array[0];
        for(int i = 0; i<array.length;i++){
            if(array[i]<min){
                min=array[i];
            }
        }
        System.out.println("Arrayinvertito:");
        //rovescio array
        int lunghezza = array.length;
        for (int i = lunghezza - 1; i >= 0; i--) {
            System.out.print(array[i] + "-");
        }
        System.out.println(" ");
        System.out.println("la somma è: "+somma);
        System.out.println("il numero Massimo: "+max);
        System.out.println("il numero Minimo: "+min);
        System.out.println("la media è: "+media);

        
        

        
    }
}
