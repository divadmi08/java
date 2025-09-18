import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int scelta;
        float conto = 0;
        ArrayList<String> libri_presi = new ArrayList<>();

        String[] libri = {"libro_1", "libro_2", "libro_3", "libro_4", "libro_5"};
        float[] costi_libri = {29.99f, 30.99f, 50f, 9.99f, 1.99f};
        ArrayList<Integer> indice_libri = new ArrayList<>(Arrays.asList(1,2,3,4,5));

        System.out.println("Benvenuto nella libreria ReadIt, scegli l'indice dei libri ceh vuoi: \n");
        do {
            for(int i = 0; i < libri.length; i++){
                System.out.println(i + 1 + ")" + libri[i] + "-> " + costi_libri[i] +"€");
            }
            System.out.println("scegli l'indice del libro ceh vuoi(premere 0 per uscire)");
            scelta = scanner.nextInt();

            if(scelta == 0){
                break;
            } else if (!indice_libri.contains(scelta)) {
                System.out.println("indice non presente!");
                continue;
            }
            conto += costi_libri[scelta - 1];
            libri_presi.add(libri[scelta - 1]);

            System.out.println("libro aggiunto al carrello!");
        }while(scelta != 0);

        System.out.println("i libri che hai preso sono: " + libri_presi + " per un totale di " + Math.round(conto * 100.0) / 100.0 + "€\n");

        if(conto >= 40){
            libri_presi.add("I promessi sposi");
            System.out.println("visto che hai speso 40 euro o più ti regaliamo i promessi sposi!!");
        }if (conto >= 50 && conto <= 50) {
            libri_presi.add("Harry potter");
            System.out.println("visto che hai speso 50 euro precisi ti regaliamo Harry potter sposi!!");
        }

    }
}
