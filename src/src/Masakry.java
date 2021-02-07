package src;

import java.util.Scanner;

public class Masakry {
    public static float[] cena(int plus, int ilosc) {

        Scanner scanner = new Scanner(System.in);
        int cenaUp = 0;
        float koszt = 0;
        float zarobek;

        for (int i = 1; i <= plus; i++) {
            cenaUp += i * 2;
        }
        cenaUp -= 12;

        System.out.println("Cena jednego Kamienia Duszy Masakry +" + plus + "?");
        float cenaSell = scanner.nextInt();

        // UM +0

        System.out.println("Ile Kamieni Duszy Masakry +3 posiadasz?");
        int iloscMasyTrzy = scanner.nextInt();

        System.out.println("Koszt zakupu jednego Kamienia Duszy Masakry +3?");
        float cenaMasyTrzy = scanner.nextFloat();

        // ZMIENNE ULEPSZACZY

        // +4
        int iloscBroni210 = 0;
        float cenaBroni210 = 0;
        float cenaKamienia = 0;
        // +5
        int iloscBroni220 = 0;
        float cenaBroni220 = 0;
        float cenaZiemi = 0;

        // ULEPSZACZE

        if (plus > 3) {

            // KAMIENIA (+4)

            System.out.println("Ile broni 210lvl posiadasz?");
            iloscBroni210 = scanner.nextInt();

            System.out.println("Koszt zakupu jednej broni 210lvl?");
            cenaBroni210 = scanner.nextFloat();

            if (ilosc == 1) {
                cenaKamienia = (4 * cenaBroni210) - (iloscBroni210 * cenaBroni210);
            } else {
                cenaKamienia = (((int) Math.ceil(ilosc / 4.0) * 4) * cenaBroni210) - (iloscBroni210 * cenaBroni210);
            }

            //

            if (plus > 4) {

                // ZIEMI (+5)

                System.out.println("Ile broni 220lvl posiadasz?");
                iloscBroni220 = scanner.nextInt();

                System.out.println("Koszt zakupu jednej broni 220lvl?");
                System.out.println("~ broń 210 + 140SM (" + (cenaBroni210 + 140) + "SM/szt)");
                cenaBroni220 = scanner.nextFloat();

                if (ilosc == 1) {
                    cenaZiemi = (4 * cenaBroni220) - (iloscBroni220 * cenaBroni220);
                } else {
                    cenaZiemi = (((int) Math.ceil(ilosc / 4.0) * 4) * cenaBroni220) - (iloscBroni220 * cenaBroni220);
                }
            }
        }

        System.out.println("Ceny składników:");
        System.out.println("Koszt ulepszania: " + cenaUp + "SM (" + ilosc * cenaUp + "SM)");
        System.out.println("Kamień Duszy Masakry +3: " + cenaMasyTrzy + "SM (" + ilosc * cenaMasyTrzy + "SM)");

        if (plus > 3) {

            System.out.println("[+4] Zwój Kamienia: " + cenaKamienia / ilosc + "SM [na 1 kamień] (" + cenaKamienia + "SM)");

            if (plus > 4) {

                System.out.println("[+5] Zwój Ziemi: " + cenaZiemi / ilosc + "SM [na 1 kamień] (" + cenaZiemi + "SM)");

            }
        }



        System.out.print("\n\n");

        //koszt += (ilosc * cenaMeteor - (iloscMeteor * cenaMeteor)) + (ilosc * cenaUmZero - (iloscUmZero * cenaUmZero)) + (ilosc * (cenaMagii / 2) - (iloscZwojowMagii * cenaMagii)) + (ilosc * cenaUp);
        koszt += (ilosc * cenaMasyTrzy) - (iloscMasyTrzy * cenaMasyTrzy);

        if (plus > 3) {
            koszt += cenaKamienia - (iloscBroni210 * cenaBroni210);
        }

        if (plus > 4) {
            koszt += cenaZiemi - (iloscBroni220 * cenaBroni220);
        }

        koszt += cenaUp * ilosc;

        zarobek = (ilosc * cenaSell) - koszt;

        return new float[] {koszt, zarobek};
    }
}
