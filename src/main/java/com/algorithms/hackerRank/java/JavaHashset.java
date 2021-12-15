package com.algorithms.hackerRank.java;

import java.util.*;

public class JavaHashset {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];

        for (int i = 0; i < t; i++) {
            pair_left[i] = scan.next();
            pair_right[i] = scan.next();
        }
        HashSet<String> pairs = new HashSet<>(t);

        for (int i = 0; i < t; i++) {
            pairs.add("(" + pair_left[i] + ", " + pair_right[i] + ")");
            System.out.println(pairs.size());
        }

        scan.close();


    }

}
