package com.algorithms.hackerRank.java;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Given an array of integers, find the sum of its elements.
 *
 * For example, if the array , , so return .
 *
 * Function Description
 *
 * Complete the simpleArraySum function in the editor below. It must return the sum of the array elements as an integer.
 *
 * simpleArraySum has the following parameter(s):
 *
 * ar: an array of integers
 * Input Format
 *
 * The first line contains an integer, , denoting the size of the array.
 * The second line contains  space-separated integers representing the array's elements.
 *
 * Constraints
 *
 *
 * Output Format
 *
 * Print the sum of the array's elements as a single integer.
 */
public class SimpleArraySum {

    /*
     * Complete the simpleArraySum function below.
     */
    static int simpleArraySum(final int[] ar) {
        if (ar == null) return 0;
        return Arrays.stream(ar).sum();
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        final BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        final int arCount = Integer.parseInt(scanner.nextLine().trim());

        final int[] ar = new int[arCount];

        final String[] arItems = scanner.nextLine().split(" ");

        for (int arItr = 0; arItr < arCount; arItr++) {
            final int arItem = Integer.parseInt(arItems[arItr].trim());
            ar[arItr] = arItem;
        }

        final int result = simpleArraySum(ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();
    }

}
