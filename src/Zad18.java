public class Zad18 {
    public static void main(String[] args) {
        int liczAnkietowanych = 12467;
        double jedenTyg = 0.14;
        double smakcyt = 0.64;
        double liczbOsobTyg = liczAnkietowanych * jedenTyg;
        double liczSmakCyt = liczAnkietowanych * smakcyt;
        System.out.println("Liczba osób kupująca jeden napój tygodniowo: " + liczbOsobTyg + "\n" +
                "Liczba osób kupująca napoje cytrusowe: " + liczSmakCyt);
    }
}
