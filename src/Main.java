import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        final String ANSI_YELLOW = "\u001B[33m";
        final String ANSI_RED = "\u001B[31m";
        final String ANSI_GREEN = "\u001B[32m";

        float koszt = 0;
        float zarobek;
        int cenaUp = 0;

        // ILOŚĆ KAMIENI

        System.out.println(ANSI_YELLOW + "Ile kamieni chcesz wytworzyć?");
        int ilosc = scanner.nextInt();

        // KOSZT ULEPSZANIA

        System.out.println(ANSI_YELLOW + "Plus ile kamienie chcesz wytworzyć?");
        int plus = scanner.nextInt();

        if (plus > 5) {
            plus = 5;
            System.out.println("Maksymalne ulepszenie kamienia to +5, podana wartość jest większa, zmniejszono do 5");
        }

        for (int i = 1; i <= plus; i++) {
            cenaUp += i * 2;
        }

        // CENA SPRZEDARZY

        System.out.println(ANSI_YELLOW + "Cena jednego Kamienia Duszy Um +" + plus + "?");
        float cenaSell = scanner.nextInt();

        // UM +0

        System.out.println(ANSI_YELLOW + "Ile Kamieni Duszy Um +0 posiadasz?");
        int iloscUmZero = scanner.nextInt();

        System.out.println(ANSI_YELLOW + "Koszt zakupu jednego Kamienia Duszy Um +0?");
        float cenaUmZero = scanner.nextInt();

        // ZMIENNE ULEPSZACZY

        // +1
        int iloscMeteor = 0;
        float cenaMeteor = 0;
        // +2
        int iloscBroni190 = 0;
        int cenaBroni190 = 0;
        float cenaMagii = 0;
        // +3
        int iloscBroni200 = 0;
        int cenaBroni200 = 0;
        float cenaZakletejMagii = 0;
        // +4
        int iloscBroni210 = 0;
        int cenaBroni210 = 0;
        float cenaPrzeblysku = 0;
        // +5
        int iloscBroni220 = 0;
        int cenaBroni220 = 0;
        float cenaMagicznychSidel = 0;

        // ULEPSZACZE

        if (plus > 0) {

            // METEORY (+1)

            System.out.println(ANSI_YELLOW + "Ile zwojów meteoru posiadasz?");
            iloscMeteor = scanner.nextInt();

            System.out.println(ANSI_YELLOW + "Koszt zakupu jednego Zwoju Meteoru?");
            cenaMeteor = scanner.nextInt();

            //

            if (plus > 1) {

                // MAGII (+2)

                System.out.println(ANSI_YELLOW + "Ile broni 190lvl posiadasz?");
                iloscBroni190 = scanner.nextInt();

                System.out.println(ANSI_YELLOW + "Koszt zakupu jednej broni 190lvl?");
                cenaBroni190 = scanner.nextInt();

                if (iloscBroni190 % 2 == 1) {
                    cenaMagii = (int) Math.ceil(iloscBroni190 / 2) * cenaBroni190;
                } else {
                    if (iloscBroni190 == 0) {
                        cenaMagii = ((int) Math.ceil(ilosc / 2) * cenaBroni190) * 2;
                    } else {
                        cenaMagii = ilosc * cenaBroni190;
                    }
                }

                System.out.println(cenaMagii);

                //

                if (plus > 2) {

                    // ZAKLĘTEJ MAGII (+3)

                    System.out.println(ANSI_YELLOW + "Ile broni 200lvl posiadasz?");
                    iloscBroni200 = scanner.nextInt();

                    System.out.println(ANSI_YELLOW + "Koszt zakupu jednej broni 200lvl?");
                    cenaZakletejMagii = scanner.nextInt();

                    //

                    if (plus > 3) {

                        // PRZEBŁYSKU (+4)

                        System.out.println(ANSI_YELLOW + "Ile broni 210lvl posiadasz?");
                        iloscBroni210 = scanner.nextInt();

                        System.out.println(ANSI_YELLOW + "Koszt zakupu jednej broni 210lvl?");
                        cenaPrzeblysku = scanner.nextInt();

                        //

                        if (plus > 4) {

                            // MAGICZNYCH SIDEŁ (+5)

                            System.out.println(ANSI_YELLOW + "Ile broni 220lvl posiadasz?");
                            iloscBroni220 = scanner.nextInt();

                            System.out.println(ANSI_YELLOW + "Koszt zakupu jednej broni 220lvl?");
                            cenaMagicznychSidel = scanner.nextInt();
                        }
                    }
                }
            }
        }

        System.out.println(ANSI_YELLOW + "Ceny składników:");
        System.out.println(ANSI_RED + "Koszt ulepszania: " + ANSI_GREEN + cenaUp + "SM (" + ilosc * cenaUp + "SM)");
        System.out.println(ANSI_RED + "Kamień Duszy UM +0: " + ANSI_GREEN + cenaUmZero + "SM (" + ilosc * cenaUmZero + "SM)");

        if (plus > 0) {

            System.out.println(ANSI_RED + "[+1] Zwój Meteorów: " + ANSI_GREEN + cenaMeteor + "SM (" + ilosc * cenaMeteor + "SM)");

            if (plus > 1) {

                System.out.println(ANSI_RED + "[+2] Zwój Magii: " + ANSI_GREEN + cenaMagii / ilosc + "SM [na 1 szt] (" + cenaMagii+ "SM)");

                if (plus > 2) {

                    System.out.println(ANSI_RED + "[+3] Zwój Zaklętej Magii: " + ANSI_GREEN + cenaZakletejMagii / ilosc + "SM [na 1 szt] (" + cenaZakletejMagii + "SM)");

                    if (plus > 3) {

                        System.out.println(ANSI_RED + "[+4] Zwój Magii: " + ANSI_GREEN + cenaPrzeblysku / ilosc + "SM [na 1 szt] (" + cenaPrzeblysku + "SM)");

                        if (plus > 4) {

                            System.out.println(ANSI_RED + "[+5] Zwój Magii: " + ANSI_GREEN + cenaMagicznychSidel / ilosc + "SM [na 1 szt] (" + cenaMagicznychSidel + "SM)");

                        }
                    }
                }
            }
        }

        System.out.print("\n\n");

        int iloscZwojowMagii = 0;
        int iloscZwojowZakletejMagii = 0;
        int iloscZwojowPrzeblysku = 0;
        int iloscZwojowMagicznychSidel = 0;

        if (plus > 1) {
            if (iloscBroni190 > 0) {
                if (iloscBroni190 % 2 == 1) {
                    iloscZwojowMagii = (int) Math.floor(iloscBroni190 / 2);
                    koszt += cenaMagii;
                } else {
                    iloscZwojowMagii = iloscBroni190;
                }
            }
        }

        if (plus > 2) {
            if (iloscBroni200 > 0) {
                if (iloscBroni200 % 2 == 1) {
                    iloscZwojowZakletejMagii = (int) Math.floor(iloscBroni200 / 2);
                    koszt += cenaZakletejMagii;
                } else {
                    iloscZwojowZakletejMagii = iloscBroni200;
                }
            }
        }

        if (plus > 3) {
            if (iloscBroni210 > 0) {
                if (iloscBroni210 % 2 == 1) {
                    iloscZwojowPrzeblysku = (int) Math.floor(iloscBroni210 / 2);
                    koszt += cenaPrzeblysku;
                } else {
                    iloscZwojowPrzeblysku = iloscBroni210;
                }
            }
        }

        if (plus > 4) {
            if (iloscBroni220 > 0) {
                if (iloscBroni220 % 2 == 1) {
                    iloscZwojowMagicznychSidel = (int) Math.floor(iloscBroni220 / 2);
                    koszt += cenaMagicznychSidel;
                } else {
                    iloscZwojowMagicznychSidel = iloscBroni220;
                }
            }
        }

        //koszt += (ilosc * cenaMeteor - (iloscMeteor * cenaMeteor)) + (ilosc * cenaUmZero - (iloscUmZero * cenaUmZero)) + (ilosc * (cenaMagii / 2) - (iloscZwojowMagii * cenaMagii)) + (ilosc * cenaUp);
        koszt += (ilosc * cenaUmZero) - (iloscUmZero * cenaUmZero);

        if (plus > 0) {
            koszt += (ilosc * cenaMeteor) - (iloscMeteor * cenaMeteor);
        }

        if (plus > 1) {
            koszt += (ilosc * cenaMagii) - (iloscZwojowMagii * cenaMagii);
        }

        if (plus > 2) {
            koszt += (ilosc * cenaZakletejMagii) - (iloscZwojowZakletejMagii * cenaZakletejMagii);
        }

        if (plus > 3) {
            koszt += (ilosc * cenaPrzeblysku) - (iloscZwojowPrzeblysku * cenaPrzeblysku);
        }

        if (plus > 4) {
            koszt += (ilosc * cenaMagicznychSidel) - (iloscZwojowMagicznychSidel * cenaMagicznychSidel);
        }

        koszt += cenaUp * ilosc;

        System.out.println(ANSI_RED + "Koszt wytworzenia: " + ANSI_GREEN + koszt + "SM");

        zarobek = (ilosc * cenaSell) - koszt;

        System.out.println(ANSI_RED + "Zarobek: " + ANSI_GREEN + zarobek + "SM, " + zarobek / ilosc + "/sztuka, " + (zarobek + koszt) + " całkowicie");
    }
}
