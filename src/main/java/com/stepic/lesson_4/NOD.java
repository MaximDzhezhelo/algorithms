package com.stepic.lesson_4;

import java.util.Scanner;

public class NOD {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        int a;
        int b;

        do {
            a = scanner.nextInt();
            b = scanner.nextInt();
        } while (a < 1 && b > 2 * 10e+9);

        scanner.close();
        System.out.println(nod(a, b));
    }

    public static int nod(int a, int b) {
        if (a == 0) return b;
        if (b == 0) return a;

        if (a >= b) { return nod(a % b, b); }
        if (a <= b) { return nod(a, b % a); }

        return 0;
    }

}