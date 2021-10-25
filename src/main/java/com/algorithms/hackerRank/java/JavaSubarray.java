package com.algorithms.hackerRank.java;

import java.util.Arrays;
import java.util.Scanner;

public class JavaSubarray {

    public static void main(String[] args) {
        final Scanner scan = new Scanner(System.in);
        final int n = scan.nextInt();

        final int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        scan.close();

        // Prints each sequential element in array a

        int negativeSubarrays = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += a[j];
                if(sum < 0) negativeSubarrays ++;
            }
        }

        System.out.println(negativeSubarrays);
    }

}
