package com.algorithms.hackerRank.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class JavaPrimalityTest {

    public static void main(String[] args) throws IOException {
        final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        final String n = bufferedReader.readLine();

        bufferedReader.close();

        final BigInteger number = new BigInteger(n);
        final boolean prime = number.isProbablePrime(10);
        if(prime) System.out.println("prime");
        else System.out.println("not prime");

    }

}
