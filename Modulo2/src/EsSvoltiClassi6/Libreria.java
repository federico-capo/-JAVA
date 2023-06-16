package EsSvoltiClassi6;

import java.util.ArrayList;
import java.util.List;

public class Libreria {
    private List<Libro> libreria = new ArrayList<>();

    public static void main(String[] args) {
        Libreria libreria = new Libreria();

        Libro l1 = new Libro("La Giungla", "Mario", 25);
        libreria.aggiungiLibro(l1);

        Libro l2 = new Libro("Il Codice da Vinci", "Dan Brown", 30);
        libreria.aggiungiLibro(l2);

        // E così via...

        System.out.println(libreria.getLibri());
    }

    public void aggiungiLibro(Libro libro) {
        libreria.add(libro);
    }

    public List<Libro> getLibri() {
        return libreria;
    }
}
