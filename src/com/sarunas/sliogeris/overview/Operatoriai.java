package com.sarunas.sliogeris.overview;

import java.util.Scanner;

public class Operatoriai {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite jusu amziu: ");
        int amzius = sc.nextInt();

        if(amzius >= 18 && amzius <=100) {
            System.out.println("Jus galite balsuoti");
        } else if (amzius < 18 && amzius > 0) {
            System.out.println("Jus negalite balsuoti");
        } else {
            System.out.println("Tu durnas?");
        }

    }
}
