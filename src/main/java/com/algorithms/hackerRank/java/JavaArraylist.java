package com.algorithms.hackerRank.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JavaArraylist {

    public static void main(String[] args) {

        final Scanner scan = new Scanner(System.in);

        final int nArrays = Integer.parseInt(scan.nextLine());

        // init arrays
        final Map<Integer, ArrayList<Integer>> arrays = new HashMap<>();
        for (int i = 0; i < nArrays; i++) {
            final String line = scan.nextLine();
            final String[] numbers = line.split(" ");
            final int countInArray = Integer.parseInt(numbers[0]);

            final ArrayList<Integer> list = new ArrayList<>(countInArray);
            for (int j = 1; j <= countInArray; j++) {
                list.add(Integer.parseInt(numbers[j]));
            }

            arrays.put(i, list);
        }
        // find wish numbers
        final int nFind = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < nFind; i++) {
            final String line = scan.nextLine();
            final String[] numbers = line.split(" ");
            final String mapIndex = numbers[0];
            final String arrayIndex = numbers[1];
            final ArrayList<Integer> list = arrays.get(Integer.parseInt(mapIndex) - 1);
            try {
                final Integer integer = list.get(Integer.parseInt(arrayIndex) - 1);
                System.out.println(integer);
            } catch (Exception e) {
                System.out.println("ERROR!");
            }
        }

        scan.close();


    }

}
