import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int n1,n2;
        int result;

        System.out.println("insersici un numero: ");
        n1 = scanner.nextInt();
        System.out.println("insersici un altro numero: ");
        n2 = scanner.nextInt();

        result = Math.max(n1,n2);
        System.out.println(result);

        Random r = new Random();
        System.out.println(r.nextInt(50));
    }
}
