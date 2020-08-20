package com.algorithms.hackerRank.java;

import java.util.Scanner;

/**
 * We define the following terms:
 * <p>
 * Lexicographical Order, also known as alphabetic or dictionary order, orders characters as follows:
 * For example, ball < cat, dog < dorm, Happy < happy, Zoo < ball.
 * <p>
 * A substring of a string is a contiguous block of characters in the string. For example, the substrings of abc are a, b, c, ab, bc, and abc.
 * Given a string, , and an integer, , complete the function so that it finds the lexicographically smallest and largest substrings of length .
 * <p>
 * Input Format
 * <p>
 * The first line contains a string denoting .
 * The second line contains an integer denoting .
 * <p>
 * Constraints
 * <p>
 * consists of English alphabetic letters only (i.e., [a-zA-Z]).
 * Output Format
 * <p>
 * Return the respective lexicographically smallest and largest substrings as a single newline-separated string.
 */
public class JavaSubstringComparisons {

    public static String getSmallestAndLargest(String a, int k) {
        String largest = a.substring(0, k);
        String smallest = a.substring(0, k);

        for (int i = 0; i + k <= a.length(); i++) {
            final String substring = a.substring(i, i + k);
            if (substring.compareTo(smallest) < 0) smallest = substring;
            if (substring.compareTo(largest) > 0) largest = substring;
        }

        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        final Scanner scan = new Scanner(System.in);
        final String s = scan.next();
        final int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }

}
