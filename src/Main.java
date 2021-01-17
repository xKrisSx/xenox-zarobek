import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        final String ANSI_YELLOW = "\u001B[33m";
        final String ANSI_RED = "\u001B[31m";
        final String ANSI_GREEN = "\u001B[32m";

        float koszt = 0;
        float zarobek;
        final int cenaUp = 6;

        float cenaMeteor = 6.5F;

        System.out.println(ANSI_YELLOW + "Ile kamieni chcesz wytworzyć?");
        int ilosc = scanner.nextInt();

        System.out.println(ANSI_YELLOW + "Cena jednego KD Um +2?");
        float cenaUmDwa = scanner.nextInt();

        // METEORY

        System.out.println(ANSI_YELLOW + "Ile zwojów meteoru posiadasz?");
        int iloscMeteor = scanner.nextInt();

        // UM +0

        System.out.println(ANSI_YELLOW + "Ile kamieni duszy um +0 posiadasz?");
        int iloscUmZero = scanner.nextInt();

        System.out.println(ANSI_YELLOW + "Koszt zakupu jednego KD Um +0?");
        float cenaUmZero = scanner.nextInt();

        // MAGII, BRONIE 190

        System.out.println(ANSI_YELLOW + "Ile broni 190lvl posiadasz?");
        int iloscBroni = scanner.nextInt();

        System.out.println(ANSI_YELLOW + "Koszt zakupu jednej broni 190lvl?");
        int cenaMagii = scanner.nextInt() * 2;

        //

        System.out.println(ANSI_YELLOW + "Aktualne ceny:");
        System.out.println(ANSI_RED + "Zwój Meteorów: " + ANSI_GREEN + cenaMeteor + "SM " + "(" + ilosc * cenaMeteor + "SM)");
        System.out.println(ANSI_RED + "Kamień Duszy UM +0: " + ANSI_GREEN + cenaUmZero + "SM"  + "(" + ilosc * cenaUmZero + "SM)");
        System.out.println(ANSI_RED + "Zwój Magii: " + ANSI_GREEN + cenaMagii / 2 + "SM [na 1 szt] " + "(" + ilosc * cenaMagii / 2 + "SM)");

        System.out.print("\n\n");

        int iloscZwojowMagii = 0;

        if (iloscBroni > 0) {
            if (iloscBroni % 2 == 1) {
                iloscZwojowMagii = (int) Math.floor(iloscBroni / 2);
                koszt = 20;
            } else {
                iloscZwojowMagii = iloscBroni / 2;
            }
        }

        koszt += (ilosc * cenaMeteor - (iloscMeteor * cenaMeteor)) + (ilosc * cenaUmZero - (iloscUmZero * cenaUmZero)) + (ilosc * (cenaMagii / 2) - (iloscZwojowMagii * cenaMagii)) + (ilosc * cenaUp);

        System.out.println(ANSI_RED + "Koszt wytworzenia: " + ANSI_GREEN + koszt + "SM");

        zarobek = (ilosc * cenaUmDwa) - koszt;

        System.out.println(ANSI_RED + "Zarobek: " + ANSI_GREEN + zarobek + "SM (" + zarobek / 2 + "/osoba)");
    }
}
