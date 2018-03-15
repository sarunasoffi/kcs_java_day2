package com.sarunas.sliogeris.overview;

import java.util.Scanner;

public class DevintaUzduotele {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite skaiciu; ");
        int numb = sc.nextInt();
        int x = 0;

        if (numb >= 0) {
            x = 2 * numb + 8;
        } else {
            x = 21 - 7 * numb;
        }
        System.out.println(x);
    }
}
