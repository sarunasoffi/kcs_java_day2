package com.sarunas.sliogeris.overview;

import java.util.Scanner;

public class UzduotisPirma {

    public static void main(String[] args) {

        //uzduotis1
        boolean Salyga = true;
        if (Salyga == true) {
            System.out.println("Tiesa");
        } else {
            System.out.println("Netiesa");
        }

        //uzduotis2 ir 3
        int numb = 120;

        if (numb > 100) {
            System.out.println("Didesne uz simta");
        } else {
            System.out.println("Ne didesne, tu durns?");
        }

        //uzduotis4
        Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite be koki skaiciu: ");
        int scannerNumber = sc.nextInt();


        if ((scannerNumber >= 0) && (scannerNumber <= 100)) {
            System.out.println("Ivestas skaicius yra tarp 0 ir 100");
        } else {
            System.out.println("Ivestas skaicius nera tarp 0 ir 100");
        }
    }
}
