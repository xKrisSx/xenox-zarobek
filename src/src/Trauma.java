package src;

import java.util.Scanner;

public class Trauma {
    public static float[] cena(int plus, int ilosc) {

        Scanner scanner = new Scanner(System.in);
        int cenaUp = 0;
        float koszt = 0;
        float zarobek;

        for (int i = 1; i <= plus; i++) {
            cenaUp += i * 2;
        }
        cenaUp -= 6;

        System.out.println("Cena jednego Kamienia Duszy Traumy +" + plus + "?");
        float cenaSell = scanner.nextInt();

        // UM +0

        System.out.println("Ile Kamieni Duszy Traumy +2 posiadasz?");
        int iloscTraumyDwa = scanner.nextInt();

        System.out.println("Koszt zakupu jednego Kamienia Duszy Traumy +2?");
        float cenaTraumyDwa = scanner.nextFloat();

        // ZMIENNE ULEPSZACZY

        // +3
        int iloscZbroi200 = 0;
        float cenaZbroi200 = 0;
        float cenaZywiolakaZiemi = 0;
        // +4
        int iloscZbroi210 = 0;
        float cenaZbroi210 = 0;
        float cenaKamiennegoGolema = 0;
        // +5
        int iloscZbroi220 = 0;
        float cenaZbroi220 = 0;
        float cenaCharyzmy = 0;

        // ULEPSZACZE

        if (plus > 2) {

            // ZYWIOLAKA ZIEMI (+3)

            System.out.println("Ile zbroi 200lvl posiadasz?");
            iloscZbroi200 = scanner.nextInt();

            System.out.println("Koszt zakupu jednej zbroi 200lvl?");
            cenaZbroi200 = scanner.nextFloat();

            if (ilosc == 1) {
                cenaZywiolakaZiemi = (4 * cenaZbroi200) - (iloscZbroi200 * cenaZbroi200);
            } else {
                cenaZywiolakaZiemi = (((int) Math.ceil(ilosc / 4.0) * 4) * cenaZbroi200) - (iloscZbroi200 * cenaZbroi200);
            }

            //

            if (plus > 3) {

                // KAMIENNEGO GOLEMA (+4)

                System.out.println("Ile zbroi 210lvl posiadasz?");
                iloscZbroi210 = scanner.nextInt();

                System.out.println("Koszt zakupu jednej zbroi 210lvl?");
                cenaZbroi210 = scanner.nextFloat();

                if (ilosc == 1) {
                    cenaKamiennegoGolema = (4 * cenaZbroi210) - (iloscZbroi210 * cenaZbroi210);
                } else {
                    cenaKamiennegoGolema = (((int) Math.ceil(ilosc / 4.0) * 4) * cenaZbroi210) - (iloscZbroi210 * cenaZbroi210);
                }

                //

                if (plus > 4) {

                    // CHARYZMY (+5)

                    System.out.println("Ile zbroi 220lvl posiadasz?");
                    iloscZbroi220 = scanner.nextInt();

                    System.out.println("Koszt zakupu jednej zbroi 220lvl?");
                    System.out.println("~ zbroja 210 + 140SM (" + (cenaZbroi210 + 140) + "SM/szt)");
                    cenaZbroi220 = scanner.nextFloat();

                    if (ilosc == 1) {
                        cenaCharyzmy = (4 * cenaZbroi220) - (iloscZbroi220 * cenaZbroi220);
                    } else {
                        cenaCharyzmy = (((int) Math.ceil(ilosc / 4.0) * 4) * cenaZbroi220) - (iloscZbroi220 * cenaZbroi220);
                    }
                }
            }
        }

        System.out.println("Ceny składników:");
        System.out.println("Koszt ulepszania: " + cenaUp + "SM (" + ilosc * cenaUp + "SM)");
        System.out.println("Kamień Duszy Traumy +2: " + cenaTraumyDwa + "SM (" + ilosc * cenaTraumyDwa + "SM)");


        if (plus > 2) {

            System.out.println("[+3] Zwój Żywiołaka Ziemi: " + cenaZywiolakaZiemi / ilosc + "SM [na 1 kamień] (" + cenaZywiolakaZiemi + "SM)");

            if (plus > 3) {

                System.out.println("[+4] Zwój Kamiennego Golema: " + cenaKamiennegoGolema / ilosc + "SM [na 1 kamień] (" + cenaKamiennegoGolema + "SM)");

                if (plus > 4) {

                    System.out.println("[+5] Zwój Charyzmy: " + cenaCharyzmy / ilosc + "SM [na 1 kamień] (" + cenaCharyzmy + "SM)");

                }
            }
        }


        System.out.print("\n\n");

        //koszt += (ilosc * cenaMeteor - (iloscMeteor * cenaMeteor)) + (ilosc * cenaUmZero - (iloscUmZero * cenaUmZero)) + (ilosc * (cenaMagii / 2) - (iloscZwojowMagii * cenaMagii)) + (ilosc * cenaUp);
        koszt += (ilosc * cenaTraumyDwa) - (iloscTraumyDwa * cenaTraumyDwa);

        if (plus > 2) {
            koszt += cenaZywiolakaZiemi - (iloscZbroi200 * cenaZbroi200);
        }

        if (plus > 3) {
            koszt += cenaKamiennegoGolema - (iloscZbroi210 * cenaZbroi210);
        }

        if (plus > 4) {
            koszt += cenaCharyzmy - (iloscZbroi220 * cenaZbroi220);
        }

        koszt += cenaUp * ilosc;

        zarobek = (ilosc * cenaSell) - koszt;

        return new float[] {koszt, zarobek};
    }
}
