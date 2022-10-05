public class Zad17 {
    public static void main(String[] args) {
        int akcje = 600;
        double cenaJednAkcji = 21.77;
        double prowzja = 0.02;
        double wysoProw = akcje * cenaJednAkcji * prowzja;
        double cenaBezProw = akcje * cenaJednAkcji;
        double lacznacena = cenaBezProw + wysoProw;
        System.out.println("Cena akcji bez prowizji: " +cenaBezProw + "zł \n" + "Prowazja do zapłaty: " + wysoProw + "zł \n" +
                "łącznie do zapłaty po prowizji: " + lacznacena + "zł");
    }
}
