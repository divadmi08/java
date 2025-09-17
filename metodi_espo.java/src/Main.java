//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


public class Main {
    public static void main(String[] args) {
        Car mycar1 = new Car("ferrari","f40","rosso",1);
        System.out.println(mycar1);

        Bici mybici = new Bici(7, "AAAA");
        mybici.nome = "cicicicio";
        mybici.setPippo(9);
        System.out.println(mybici.nome);
        System.out.println(mybici.getPippo());


}
}


class Bici{
    private int pippo;
    public String nome;
    public Bici(int pippo, String nome){
        this.pippo = pippo;
        this.nome = nome;
    }

    public int getPippo(){
        return pippo;
    }

    public void setPippo(int pippo){
        this.pippo = pippo;
    }
}

class Car{
    String brand;
    String modello;
    String color;
    int age;

    public Car(String brand, String modello, String color, int age) {
        this.brand = brand;
        this.modello = modello;
        this.color = color;
        this.age = age;
    }
    @Override
    public String toString() {
        return "brand " + brand + " model " + modello + " color " + color + " anni " + age;
    }
}

