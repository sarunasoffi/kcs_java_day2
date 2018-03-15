package com.sarunas.sliogeris.overview;

import java.util.Scanner;

public class SwitchMenu {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Pasirinkite meniu punktus (iveskite 1, 2, 3 arba 4) \nIveskite 4 jei norite baigti programa");
        int pasirinkimas = sc.nextInt();

        switch(pasirinkimas) {
            case 1:
                Scanner scaneris = new Scanner(System.in);
                System.out.println("Iveskite du skaicius kuriuos sudesime ");
                String line = scaneris.nextLine();
                String[] items = line.split(" ");
                int a = Integer.parseInt(items[0]);
                int b = Integer.parseInt(items[1]);
                System.out.println(a + b);
                break;
            case 2:
                Scanner scaneris2 = new Scanner(System.in);
                System.out.println("Iveskite du skaicius kuriuos sudauginsime");
                String linija = scaneris2.nextLine();
                String[] itemai = linija.split(" ");
                int c = Integer.parseInt(itemai[0]);
                int d = Integer.parseInt(itemai[1]);
                System.out.println(c * d);
                break;
            case 3:
                int e = 256;
                System.out.println(e * 256);
                break;
            case 4:
                System.out.println("Programa baigiama...");
                break;
            default:
                System.out.println("Nesuprantama ivestis, programa baigiama...");
                break;
        }

    }
}
