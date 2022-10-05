import java.util.Scanner;

public class Zad16 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        double cenaPosi;
        System.out.println("Podaj cene posiłku: ");
        cenaPosi = klawiatura.nextDouble();
        klawiatura.nextLine();
        double podatek = 0.0675;
        double napiwek = 0.2;
        double cenaPoda = cenaPosi * podatek;
        double cenaNap = (cenaPosi + cenaPoda) * napiwek;
        double lacznieDoZapplaty = cenaPosi + cenaNap + cenaPoda;
        System.out.println("Cena posiłku: " + cenaPosi + "zł \n" + "Wartość podatku: " + cenaPoda + "zł \n" +
                "Wartość napiwku: " + cenaNap + "zł \n" + "łącznie do zapłaty: " + lacznieDoZapplaty + "zł");

    }
}
