import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int scelta;
        double conto = 0;
        ArrayList<String> libri_presi = new ArrayList<>();

        String[] libri = {"libro_1", "libro_2", "libro_3", "libro_4", "libro_5"};
        double[] costi_libri = {29.99, 30.99, 50, 9.99, 1.99};

        System.out.println("Benvenuto nella libreria ReadIt, scegli l'indice dei libri ceh vuoi: \n");
        do {
            for(int i = 0; i < libri.length; i++){
                System.out.println(i + 1 + ")" + libri[i] + "-> " + costi_libri[i] +"€");
            }
            System.out.println("scegli l'indice del libro ceh vuoi(premere 0 per uscire)");
            scelta = scanner.nextInt();

            if(scelta == 0){
                break;
            } else if (scelta == 1) {
                conto += costi_libri[0];
            } else if (scelta == 2) {
                conto += costi_libri[1];
            } else if (scelta == 3) {
                conto += costi_libri[2];
            } else if (scelta == 4) {
                conto += costi_libri[3];
            } else if (scelta == 5) {
                conto += costi_libri[4];
            } else{
                System.out.println("indice non presente!");
                continue;
            }
            libri_presi.add(libri[scelta - 1]);

            System.out.println("libro aggiunto al carrello!");
        }while(scelta != 0);

        System.out.println("i libri che hai preso sono: " + libri_presi + " per un totale di " + conto + "€\n");

        if(conto >= 40){
            libri_presi.add("I promessi sposi");
            System.out.println("visto che hai speso 40 euro o più ti regaliamo i promessi sposi!!");
        }if (conto == 50) {
            libri_presi.add("Harry potter");
            System.out.println("visto che hai speso 50 euro precisi ti regaliamo Harry potter sposi!!");
        }

    }
}
