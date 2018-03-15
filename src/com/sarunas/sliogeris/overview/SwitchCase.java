package com.sarunas.sliogeris.overview;

import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite raide nuo a iki d");
        String letter = sc.nextLine();

        switch(letter) {
            case "a":
                System.out.println("Gautas vardas bus Andrius");
                break;
            case "b":
                System.out.println("Gautas vardas bus Benas");
                break;
            case "c":
                System.out.println("Gautas vardas bus Cicinas");
                break;
            case "d":
                System.out.println("Darius");
                break;
            default:
                System.out.println("Neavyko rasti ivestos raides");
                break;
        }

    }
}
