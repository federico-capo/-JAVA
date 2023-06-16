import java.util.Scanner;

public class esercizisvolticlassi {
    int base;
    int altezza;
    
    public void CalcolaArea() {
        int area = base*altezza;
        System.out.println("l'area è: "+area);
    }
    public void CalcolaPerimetro() {
        int perimetro = 2*base+2*altezza;
        System.out.println("Il perimetro  è: "+perimetro);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("dammi la base: ");
        int b = s.nextInt();
        System.out.println("dammi l'altezza: ");
        int h = s.nextInt();

        esercizisvolticlassi r = new esercizisvolticlassi();
        r.base  = b;
        r.altezza = h;

        r.CalcolaArea();
        r.CalcolaPerimetro();

    }
}
