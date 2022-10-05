import java.util.Scanner;

public class Zad11 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        double km;
        System.out.println("Podaj ilość przejechanych kilometrów: ");
        km = klawiatura.nextDouble();
        klawiatura.nextLine();

        double litry;
        System.out.println("Podaj ilość zużytych litrów: ");
        litry = klawiatura.nextDouble();
        klawiatura.nextLine();
        double av = km / litry;
        System.out.println("Ilość przejechanych kilometrów na jednym litrze paliwa wynosi: " + av);
    }
}
