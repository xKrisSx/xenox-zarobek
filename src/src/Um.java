package src;

import java.util.Scanner;

public class Um {
    public static float[] cena(int plus, int ilosc) {
        
        Scanner scanner = new Scanner(System.in);
        int cenaUp = 0;
        float koszt = 0;
        float zarobek;

        for (int i = 1; i <= plus; i++) {
            cenaUp += i * 2;
        }

        System.out.println("Cena jednego Kamienia Duszy Um +" + plus + "?");
        float cenaSell = scanner.nextInt();

        // UM +0

        System.out.println("Ile Kamieni Duszy Um +0 posiadasz?");
        int iloscUmZero = scanner.nextInt();

        System.out.println("Koszt zakupu jednego Kamienia Duszy Um +0?");
        float cenaUmZero = scanner.nextFloat();

        // ZMIENNE ULEPSZACZY

        // +1
        int iloscMeteor = 0;
        float cenaMeteor = 0;
        // +2
        int iloscBroni190 = 0;
        float cenaBroni190 = 0;
        float cenaMagii = 0;
        // +3
        int iloscBroni200 = 0;
        float cenaBroni200 = 0;
        float cenaZakletejMagii = 0;
        // +4
        int iloscBroni210 = 0;
        float cenaBroni210 = 0;
        float cenaPrzeblysku = 0;
        // +5
        int iloscBroni220 = 0;
        float cenaBroni220 = 0;
        float cenaMagicznychSidel = 0;

        // ULEPSZACZE

        if (plus > 0) {

            // METEORY (+1)

            System.out.println("Ile zwojów meteoru posiadasz?");
            iloscMeteor = scanner.nextInt();

            System.out.println("Koszt zakupu jednego Zwoju Meteoru?");
            cenaMeteor = scanner.nextFloat();

            //

            if (plus > 1) {

                // MAGII (+2)

                System.out.println("Ile broni 190lvl posiadasz?");
                iloscBroni190 = scanner.nextInt();

                System.out.println("Koszt zakupu jednej broni 190lvl?");
                cenaBroni190 = scanner.nextFloat();

                if (ilosc == 1) {
                    cenaMagii = (2 * cenaBroni190) - (iloscBroni190 * cenaBroni190);
                } else {
                    cenaMagii = (((int) Math.ceil(ilosc / 2.0) * 2) * cenaBroni190) - (iloscBroni190 * cenaBroni190);
                }

                //

                if (plus > 2) {

                    // ZAKLĘTEJ MAGII (+3)

                    System.out.println("Ile broni 200lvl posiadasz?");
                    iloscBroni200 = scanner.nextInt();

                    System.out.println("Koszt zakupu jednej broni 200lvl?");
                    cenaBroni200 = scanner.nextFloat();

                    if (ilosc == 1) {
                        cenaZakletejMagii = (2 * cenaBroni200) - (iloscBroni200 * cenaBroni200);
                    } else {
                        cenaZakletejMagii = (((int) Math.ceil(ilosc / 2.0) * 2) * cenaBroni200) - (iloscBroni200 * cenaBroni200);
                    }

                    //

                    if (plus > 3) {

                        // PRZEBŁYSKU (+4)

                        System.out.println("Ile broni 210lvl posiadasz?");
                        iloscBroni210 = scanner.nextInt();

                        System.out.println("Koszt zakupu jednej broni 210lvl?");
                        cenaBroni210 = scanner.nextFloat();

                        if (ilosc == 1) {
                            cenaPrzeblysku = (2 * cenaBroni210) - (iloscBroni210 * cenaBroni210);
                        } else {
                            cenaPrzeblysku = (((int) Math.ceil(ilosc / 2.0) * 2) * cenaBroni210) - (iloscBroni210 * cenaBroni210);
                        }

                        //

                        if (plus > 4) {

                            // MAGICZNYCH SIDEŁ (+5)

                            System.out.println("Ile broni 220lvl posiadasz?");
                            iloscBroni220 = scanner.nextInt();

                            System.out.println("Koszt zakupu jednej broni 220lvl?");
                            System.out.println("~ broń 210 + 140SM (" + (cenaBroni210 + 140) + "SM/szt)");
                            cenaBroni220 = scanner.nextFloat();

                            if (ilosc == 1) {
                                cenaMagicznychSidel = (2 * cenaBroni220) - (iloscBroni220 * cenaBroni220);
                            } else {
                                cenaMagicznychSidel = (((int) Math.ceil(ilosc / 2.0) * 2) * cenaBroni220) - (iloscBroni220 * cenaBroni220);
                            }
                        }
                    }
                }
            }
        }

        System.out.println("Ceny składników:");
        System.out.println("Koszt ulepszania: " + cenaUp + "SM (" + ilosc * cenaUp + "SM)");
        System.out.println("Kamień Duszy UM +0: " + cenaUmZero + "SM (" + ilosc * cenaUmZero + "SM)");

        if (plus > 0) {

            System.out.println("[+1] Zwój Meteorów: " + cenaMeteor + "SM (" + ilosc * cenaMeteor + "SM)");

            if (plus > 1) {

                System.out.println("[+2] Zwój Magii: " + cenaMagii / ilosc + "SM [na 1 kamień] (" + cenaMagii+ "SM)");

                if (plus > 2) {

                    System.out.println("[+3] Zwój Zaklętej Magii: " + cenaZakletejMagii / ilosc + "SM [na 1 kamień] (" + cenaZakletejMagii + "SM)");

                    if (plus > 3) {

                        System.out.println("[+4] Zwój Przebłysku: " + cenaPrzeblysku / ilosc + "SM [na 1 kamień] (" + cenaPrzeblysku + "SM)");

                        if (plus > 4) {

                            System.out.println("[+5] Zwój Magicznych Sideł: " + cenaMagicznychSidel / ilosc + "SM [na 1 kamień] (" + cenaMagicznychSidel + "SM)");

                        }
                    }
                }
            }
        }

        System.out.print("\n\n");

        //koszt += (ilosc * cenaMeteor - (iloscMeteor * cenaMeteor)) + (ilosc * cenaUmZero - (iloscUmZero * cenaUmZero)) + (ilosc * (cenaMagii / 2) - (iloscZwojowMagii * cenaMagii)) + (ilosc * cenaUp);
        koszt += (ilosc * cenaUmZero) - (iloscUmZero * cenaUmZero);

        if (plus > 0) {
            koszt += (ilosc * cenaMeteor) - (iloscMeteor * cenaMeteor);
        }

        if (plus > 1) {
            koszt += cenaMagii - (iloscBroni190 * cenaBroni190);
        }

        if (plus > 2) {
            koszt += cenaZakletejMagii - (iloscBroni200 * cenaBroni200);
        }

        if (plus > 3) {
            koszt += cenaPrzeblysku - (iloscBroni210 * cenaBroni210);
        }

        if (plus > 4) {
            koszt += cenaMagicznychSidel - (iloscBroni220 * cenaBroni220);
        }

        koszt += cenaUp * ilosc;

        zarobek = (ilosc * cenaSell) - koszt;

        return new float[] {koszt, zarobek};
    }
}
