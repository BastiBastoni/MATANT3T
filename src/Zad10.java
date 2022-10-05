import java.util.Scanner;

public class Zad10 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        int wartosc;
        System.out.println("Podaj wartość produktu: ");
        wartosc = klawiatura.nextInt();
        klawiatura.nextLine();
        double podStan = 0.04;
        double podLocal = 0.02;
        double warStan = wartosc * podStan;
        double warLoc = wartosc * podLocal;
        double sprze = wartosc + warStan + warLoc;
        System.out.println("Produkt kosztuje: " + wartosc);
        System.out.println("Podatek lokalny wyniesie: " + warLoc + "zł");
        System.out.println("Podatek stanowy wyniesie: " + warStan + "zł");
        System.out.println("Łączna suma sprzedarzy wyniesie: " + sprze + "zł");



    }
}
