package com.algorithms.hackerRank.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaList {

    public static void main(String[] args) {

        final Scanner scan = new Scanner(System.in);
        final int n = scan.nextInt();
        final List<Integer> list = new ArrayList<>(n);

        for (int i = 0; i < n; i++) {
            final int number = scan.nextInt();
            list.add(number);
        }

        final int q = scan.nextInt();
        for (int i = 0; i < q; i++) {
            final String command = scan.next();
            if ("Insert".equals(command)) {
                final int index = scan.nextInt();
                final int value = scan.nextInt();
                list.add(index, value);
            } else if ("Delete".equals(command)) {
                final int index = scan.nextInt();
                list.remove(index);
            }
        }

        scan.close();

        // Prints each sequential element in array a
        list.forEach(v -> System.out.println(v+ " "));
    }

}
