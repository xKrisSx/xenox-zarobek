package src;

import java.util.Scanner;

public class Ludzi {
    public static float[] cena(int plus, int ilosc) {

        Scanner scanner = new Scanner(System.in);
        int cenaUp = 0;
        float koszt = 0;
        float zarobek;

        for (int i = 1; i <= plus; i++) {
            cenaUp += i * 2;
        }
        cenaUp -= 6;

        System.out.println("Cena jednego Kamienia Duszy Ludzi +" + plus + "?");
        float cenaSell = scanner.nextInt();

        // UM +0

        System.out.println("Ile Kamieni Duszy Ludzi +2 posiadasz?");
        int iloscLudziDwa = scanner.nextInt();

        System.out.println("Koszt zakupu jednego Kamienia Duszy Ludzi +2?");
        float cenaLudziDwa = scanner.nextFloat();

        // ZMIENNE ULEPSZACZY

        // +3
        int iloscBroni200 = 0;
        float cenaBroni200 = 0;
        float cenaRozkladu = 0;
        // +4
        int iloscBroni210 = 0;
        float cenaBroni210 = 0;
        float cenaKamienia = 0;
        // +5
        int iloscBroni220 = 0;
        float cenaBroni220 = 0;
        float cenaZiemi = 0;

        // ULEPSZACZE

        if (plus > 2) {

            // ROZKLADU (+3)

            System.out.println("Ile broni 200lvl posiadasz?");
            iloscBroni200 = scanner.nextInt();

            System.out.println("Koszt zakupu jednej broni 200lvl?");
            cenaBroni200 = scanner.nextFloat();

            if (ilosc == 1) {
                cenaRozkladu = (4 * cenaBroni200) - (iloscBroni200 * cenaBroni200);
            } else {
                cenaRozkladu = (((int) Math.ceil(ilosc / 4.0) * 4) * cenaBroni200) - (iloscBroni200 * cenaBroni200);
            }

            //

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
        }

        System.out.println("Ceny składników:");
        System.out.println("Koszt ulepszania: " + cenaUp + "SM (" + ilosc * cenaUp + "SM)");
        System.out.println("Kamień Duszy Ludzi +2: " + cenaLudziDwa + "SM (" + ilosc * cenaLudziDwa + "SM)");


        if (plus > 2) {

            System.out.println("[+3] Zwój Rozkładu: " + cenaRozkladu / ilosc + "SM [na 1 kamień] (" + cenaRozkladu + "SM)");

            if (plus > 3) {

                System.out.println("[+4] Zwój Kamienia: " + cenaKamienia / ilosc + "SM [na 1 kamień] (" + cenaKamienia + "SM)");

                if (plus > 4) {

                    System.out.println("[+5] Zwój Ziemi: " + cenaZiemi / ilosc + "SM [na 1 kamień] (" + cenaZiemi + "SM)");

                }
            }
        }


        System.out.print("\n\n");

        //koszt += (ilosc * cenaMeteor - (iloscMeteor * cenaMeteor)) + (ilosc * cenaUmZero - (iloscUmZero * cenaUmZero)) + (ilosc * (cenaMagii / 2) - (iloscZwojowMagii * cenaMagii)) + (ilosc * cenaUp);
        koszt += (ilosc * cenaLudziDwa) - (iloscLudziDwa * cenaLudziDwa);

        if (plus > 2) {
            koszt += cenaRozkladu - (iloscBroni200 * cenaBroni200);
        }

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
