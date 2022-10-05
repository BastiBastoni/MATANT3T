import java.util.Scanner;

public class Zad13 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        double wynik1;
        System.out.println("Podaj wynik z pierwszego testu: ");
        wynik1 = klawiatura.nextDouble();
        klawiatura.nextLine();
        double wynik2;
        System.out.println("Podaj wynik z drugiego testu: ");
        wynik2 = klawiatura.nextDouble();
        klawiatura.nextLine();
        double wynik3;
        System.out.println("Podaj wynik z trzeciego testu: ");
        wynik3 = klawiatura.nextDouble();
        klawiatura.nextLine();
        double avg = (wynik1 + wynik2 + wynik3) / 3;
        System.out.println("Wynik z pierwszego testu: " + wynik1 + "\n" + "Wynik z drugiego testu: " + wynik2 + "\n" +
                "Wynik z trzeciego testu: " + wynik3 + "\n" + "średnia wyniesie: " + avg);
    }
}
