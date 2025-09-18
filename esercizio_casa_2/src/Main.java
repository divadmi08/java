import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
       // Scrivi un programma in Java che generi 3 numeri casuali e li salvi in un Array. Restituire all'utente il valore massimo contenuto nell'Array, il valore minimo e la media.

        Random r = new Random();
        int n1 = r.nextInt(100);
        int n2 = r.nextInt(100);
        int n3 = r.nextInt(100);

        int[] lista = {n1, n2, n3};
        OptionalInt max = Arrays.stream(lista).max();
        OptionalInt min = Arrays.stream(lista).min();
        OptionalDouble media = Arrays.stream(lista).average();

        System.out.println(max);
        System.out.println(min);
        System.out.println(media);
    }
}
