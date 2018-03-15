package com.sarunas.sliogeris.overview;

import java.util.Scanner;

public class GreitasSwitchas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite skaiciu");
        int numb = sc.nextInt();

        switch (numb) {
            case 1:
                System.out.println("ivestas skaicius 1");
                break;
            case 2:
                System.out.println("ivestas skaicius 2");
                break;
            case 3:
                System.out.println("ivestas skaicius 3");
                break;
            case 5:
                System.out.println("ivestas skaicius 5");
                break;
            default:
                System.out.println("Ivestas nezinomas skaicius");
                break;
        }
    }
}
