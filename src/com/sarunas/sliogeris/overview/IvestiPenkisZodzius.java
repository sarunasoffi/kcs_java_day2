package com.sarunas.sliogeris.overview;

import com.sun.deploy.util.StringUtils;

import java.util.Arrays;
import java.util.Scanner;

public class IvestiPenkisZodzius {

    public static void main(String[] args) {

        String[] zodziai = new String[5];

        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < zodziai.length; i++) {
            System.out.println("Iveskite zodi " + i);
            zodziai[i] = sc.nextLine();
        }

        for(String item : zodziai) {
            System.out.println("Zodziu ivestis " + item);
        }
        System.out.println(Arrays.toString(zodziai));
    }
}
