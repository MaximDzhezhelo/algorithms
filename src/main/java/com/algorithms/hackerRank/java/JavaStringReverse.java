package com.algorithms.hackerRank.java;

import java.util.Scanner;

/**
 * Given a string , print Yes if it is a palindrome, print No otherwise.
 * <p>
 * Constraints
 * <p>
 * will consist at most  lower case english letters.
 */
public class JavaStringReverse {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        final String palindrome = sc.next();

        final StringBuilder builder = new StringBuilder();
        builder.append(palindrome);

        final StringBuilder reverse = builder.reverse();

        if(palindrome.equals(reverse.toString())) System.out.println("Yes");
        else System.out.println("No");
    }

}
