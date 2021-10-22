package com.algorithms.hackerRank.java;

import java.math.BigInteger;
import java.util.Scanner;

public class JavaBigInteger {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        final Scanner sc = new Scanner(System.in);

        final BigInteger first = sc.nextBigInteger();
        final BigInteger second = sc.nextBigInteger();

        sc.close();

        final BigInteger sum = first.add(second);
        final BigInteger multiply = first.multiply(second);

        System.out.println(sum);
        System.out.println(multiply);
    }

}
