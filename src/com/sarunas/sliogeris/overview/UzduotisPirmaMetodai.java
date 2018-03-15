package com.sarunas.sliogeris.overview;


import java.util.Scanner;

public class UzduotisPirmaMetodai {

    public static void main(String[] args) {

        //uzduotis 1
        System.out.println(patikrinimas(-2));

        //uzduotis 2
        System.out.println(arTrizenklis());
    }

    //uzduotis 1
    private static boolean patikrinimas(int numb) {
       boolean checkIfNumberIsNegative = false;
        if(numb < 0) {
             checkIfNumberIsNegative = true;
        }
        return checkIfNumberIsNegative;
    }


    //uzduotis 2
    private static boolean arTrizenklis() {
        boolean taipTrizenklis = false;

        Scanner sc = new Scanner(System.in);
        System.out.println("iveskite skaiciu ir ziuresime ar jis yra trizenklis: ");
        int ivestis = sc.nextInt();

        if ((ivestis >= 100) && (ivestis < 1000)) {
            taipTrizenklis = true;
        }
        return taipTrizenklis;

    }
}
