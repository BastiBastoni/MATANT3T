import java.util.Scanner;

public class Zad15 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Podaj swoje ulubione miasto: ");
        String nazwaMiasta = klawiatura.nextLine();
        int dlugosc;
        dlugosc = nazwaMiasta.length();
        String duze = nazwaMiasta.toUpperCase();
        String male = nazwaMiasta.toLowerCase();
        char letter = nazwaMiasta.charAt(0);
        System.out.println("Miasto: " + nazwaMiasta + "\n" + "Liczba znakow: " + dlugosc + "\n" +
                "Nazwa miasta zapisana dużymi literami: " + duze + "\n" +
                "Nazwa miasta zapisana małymi literami: " + male + "\n" +
                "Pierwszy znak nazyw miasta: " + letter);

    }
}
