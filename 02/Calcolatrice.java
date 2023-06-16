public class Calcolatrice {
    int a;
    int b;

    public void somma() {
        int s=a+b;
        System.out.println("La somma è :"+s);
    }
    public void sottrazione() {
        int s=a-b;
        System.out.println("La sottrazione è :"+s);
    }
    public void moltiplicazione() {
        int s=a*b;
        System.out.println("La moltiplicazione è :"+s);
    }
    public void divisione() {
        int s=a/b;
        System.out.println("La divisione è :"+s);
    }

    public static void main(String[] args) {
        Calcolatrice c = new Calcolatrice();
        c.a=10;
        c.b=2;

        //richiamo i method
        c.somma();
        c.sottrazione();
        c.moltiplicazione();
        c.divisione();
    }
}
