package com.sarunas.sliogeris.overview;

public class IfElseExamples {

    public static void main(String[] args) {
        int a = 12;
        int b = 54;

        if (a == b) {
            System.out.println("Sie skaiciai yra lygus");
        } else {
            System.out.println("Sie skaiciai nera lygus");
        }

        if (a > 8) {
            System.out.println(a);
        } else if (a < 8) {
            System.out.println(a + 10);
        } else {
            System.out.println("Nieko negauna");
        }
    }

    private static String getMessage(int numb) {
        if(numb > 50) {
            return "uzdirbai neblogai";
        } else {
            return "pasistenk";
        }

    }
}
