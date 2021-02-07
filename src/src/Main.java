package src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // ILOŚĆ KAMIENI

        System.out.println("Ile kamieni chcesz wytworzyć?");
        int ilosc = scanner.nextInt();

        // KOSZT ULEPSZANIA

        System.out.println("Plus ile kamienie chcesz wytworzyć?");
        int plus = scanner.nextInt();

        if (plus > 5) {
            plus = 5;
            System.out.println("Maksymalne ulepszenie kamienia to +5, podana wartość jest większa, zmniejszono do 5");
        }

        System.out.println("Jakie kamienie chcesz wytworzyć? Możliwe rodzaje:");
        System.out.println("Traumy");
        System.out.println("Um");
        System.out.println("Ludzi / Masakry");

        String typ = scanner.nextLine();

        if (typ.isEmpty()) {
            typ = scanner.nextLine();
        }

        float[] wynik;
        switch (typ) {
            case "traumy":
                wynik = Trauma.cena(plus, ilosc);
                System.out.println("Koszt wytworzenia: " + wynik[0] + "SM (" + wynik[0] / ilosc + "SM/szt)");
                System.out.println("Zarobek: " + wynik[1] + "SM, " + wynik[1] / ilosc + "/sztuka, " + (wynik[1] + wynik[0]) + " całkowicie");
                break;
            case "um":
                wynik = Um.cena(plus, ilosc);
                System.out.println("Koszt wytworzenia: " + wynik[0] + "SM (" + wynik[0] / ilosc + "SM/szt)");
                System.out.println("Zarobek: " + wynik[1] + "SM, " + wynik[1] / ilosc + "/sztuka, " + (wynik[1] + wynik[0]) + " całkowicie");
                break;
            case "ludzi":
                wynik = Ludzi.cena(plus, ilosc);
                System.out.println("Koszt wytworzenia: " + wynik[0] + "SM (" + wynik[0] / ilosc + "SM/szt)");
                System.out.println("Zarobek: " + wynik[1] + "SM, " + wynik[1] / ilosc + "/sztuka, " + (wynik[1] + wynik[0]) + " całkowicie");
                break;
            case "masakry":
                wynik = Masakry.cena(plus, ilosc);
                System.out.println("Koszt wytworzenia: " + wynik[0] + "SM (" + wynik[0] / ilosc + "SM/szt)");
                System.out.println("Zarobek: " + wynik[1] + "SM, " + wynik[1] / ilosc + "/sztuka, " + (wynik[1] + wynik[0]) + " całkowicie");
                break;
        }
        System.out.println("\n\nEnter, aby wyjść");
        scanner.nextLine();
    }
}
