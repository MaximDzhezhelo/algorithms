package com.stepic.lesson_4;

import java.util.Scanner;

public class NOD {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        final int result_rec = nodRecAcrossScaner();
        System.out.println("Result " + result_rec + " Executed time " + (System.currentTimeMillis() - startTime) + " ms");

        startTime = System.currentTimeMillis();
        final int result_for = nodFor(1111111132, 1111111135);
        System.out.println("Result " + result_for + " Executed time " + (System.currentTimeMillis() - startTime) + " ms");

    }

    private static int nodRecAcrossScaner() {
        final Scanner scanner = new Scanner(System.in);

        int a;
        int b;

        do {
            a = scanner.nextInt();
            b = scanner.nextInt();
        } while (a < 1 && b > 2 * 10e+9);

        scanner.close();
        return nodRec(a,b);
    }

    public static int nodRec(int a, int b) {
        if (a == 0) return b;
        if (b == 0) return a;

        if (a >= b) { return nodRec(a % b, b); }
        if (a <= b) { return nodRec(a, b % a); }

        return 0;
    }

    public static int nodFor(int a, int b) {
        int result = 0;

        for (int i = 1; i <= Math.max(a, b); i++) {
            if (a % i == 0 && b % i == 0) {
                result = i;
            }
        }
        return result;
    }

}