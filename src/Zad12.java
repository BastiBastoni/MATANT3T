import java.util.Scanner;

public class Zad12 {
    public static void main(String[] args) {
        int boxCookie = 40;
        int porcje = 10;
        int calorie = 300;
        Scanner klawiatura = new Scanner(System.in);
        double zjedzoenciast;
        System.out.println("Podaj ilość zejdzonych ciasteczek: ");
        zjedzoenciast = klawiatura.nextDouble();
        klawiatura.nextLine();
        double skoncal = zjedzoenciast / boxCookie * porcje * calorie;
        System.out.println("Zjadłeś/aś " + skoncal + " calorii");
    }
}
