package utenti;

public class LambdaCalculator {
    public static void main(String[] args) {
        Calculator somma = (a,b) -> a + b;
        Calculator diff = (a,b) -> a - b;
        Calculator mol = (a,b) -> a * b;
        Calculator div = (a,b) -> a / b;
        System.out.println(mol.operation(5,7));
    }
}

interface Calculator {
    int operation(int a, int b);
}