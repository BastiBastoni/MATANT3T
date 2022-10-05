import java.util.Scanner;

public class Zad14 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        double cenadetal;
        System.out.println("Podaj cene detaliczną płytki drukowanej: ");
        cenadetal = klawiatura.nextDouble();
        klawiatura.nextLine();
        double marza = 0.4;
        double zysk = cenadetal * marza;
        System.out.println("Zysk wyniesie: " + zysk);
    }
}
