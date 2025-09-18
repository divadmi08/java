import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //Scrivi un programma in Java che restituisca, dati i giorni della settimana (es. LUNEDI, MARTEDI...) scritti in maiuscolo, il numero corrispondente al giorno (1 - LUNEDI...). Se il giorno è uno del Weekend (SABATO e DOMENICA) scrivere all'utente "complimenti sei nel Weekend)
        Random r = new Random();

        int n1 = r.nextInt(1,8);
        System.out.println(n1);

        String[] giorniSettimana = {"LUNEDI","MARTEDI","MERCOLEDI","GIOVEDI","VENERDI","SABATO","DOMENICA"};

        String giornoPreso = giorniSettimana[n1 - 1];
        System.out.println(giornoPreso);
        if (n1 == 6 || n1 == 7){
            System.out.println("complimenti sei nel Weekend");
        }

    }

}
