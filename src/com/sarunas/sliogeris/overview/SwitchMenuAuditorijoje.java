package com.sarunas.sliogeris.overview;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SwitchMenuAuditorijoje {

    public static void main(String[] args) {

        System.out.println("1 - Suma \n2 - Skirtumas \n3 - Sandauga");

        Scanner sc = new Scanner(System.in);
        System.out.println(" ");

        int inputas = gautiGeraSkaiciu(sc);



        switch (inputas) {
            case 1:
                suma(sc);
                break;
            case 2:
                skitumas(sc);
                break;
            case 3:
                sandauga(sc);
                break;
            default:
                System.out.println("Nesamone kazkokia gavosi");
                break;
        }

    }
    private static int gautiGeraSkaiciu(Scanner sk) {

        int a;
        while (true) {
            try {
                a = sk.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Man rodos tai ne skaicius, bandyk vel: ");
                sk.nextLine();
            }
        }
        return a;
    }

    private static void suma(Scanner sc) {
        System.out.println("Iveskite pirma skaiciu ");
        int a = gautiGeraSkaiciu(sc);

        System.out.println("Iveskite antra skaiciu ");
        int b = gautiGeraSkaiciu(sc);

        System.out.println("Suma = " + (a + b));
    }
    private static void skitumas(Scanner sc) {
        System.out.println("Iveskite pirma skaiciu ");
        int a = gautiGeraSkaiciu(sc);

        System.out.println("Iveskite antra skaiciu ");
        int b = gautiGeraSkaiciu(sc);

        System.out.println("Suma = " + (a - b));
    }
    private static void sandauga(Scanner sc) {
        System.out.println("Iveskite pirma skaiciu ");
        int a = gautiGeraSkaiciu(sc);

        System.out.println("Iveskite antra skaiciu ");
        int b = gautiGeraSkaiciu(sc);

        System.out.println("Suma = " + (a * b));
    }

}
