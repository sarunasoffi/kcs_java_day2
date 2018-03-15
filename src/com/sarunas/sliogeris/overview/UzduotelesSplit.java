package com.sarunas.sliogeris.overview;

import java.util.Scanner;

public class UzduotelesSplit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite du skaicius");
        String line = sc.nextLine();

        String[] items = line.split(" ");
        int a = Integer.parseInt(items[0]);
        int b = Integer.parseInt(items[1]);

        System.out.println(a + b);


        System.out.println("Iveskite pirma sakyni: ");
        String pirmasLine = sc.nextLine();
        System.out.println("Iveskte antra sakyni: ");
        String anrasLine = sc.nextLine();

        System.out.println(pirmasLine + ' ' + anrasLine);
    }
}
