package com.sarunas.sliogeris.overview;

import java.util.Scanner;
import java.util.stream.IntStream;

public class KetvirtaUzduotis {

    public static void main(String[] args) {

        int[] numbers = new int[5];

        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < numbers.length; i++) {
            System.out.println("Iveskite kita elementa " + i);
            numbers[i] = sc.nextInt();
        }
        for(int item : numbers) {
            System.out.println("Skaiciu ivestis: " + item);
        }
        int sum = IntStream.of(numbers).sum();
        System.out.println("Jusu suma yra: " + sum);
    }
}
