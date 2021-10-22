package com.algorithms.hackerRank.java;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a string, , matching the regular expression [A-Za-z !,?._'@]+, split the string into tokens. We define a token to be one or more consecutive English alphabetic letters. Then, print the number of tokens, followed by each token on a new line.
 * <p>
 * Note: You may find the String.split method helpful in completing this challenge.
 * <p>
 * Input Format
 * <p>
 * A single string, .
 * <p>
 * Constraints
 * <p>
 * is composed of any of the following: English alphabetic letters, blank spaces, exclamation points (!), commas (,), question marks (?), periods (.), underscores (_), apostrophes ('), and at symbols (@).
 * Output Format
 * <p>
 * On the first line, print an integer, , denoting the number of tokens in string  (they do not need to be unique). Next, print each of the  tokens on a new line in the same order as they appear in input string .
 */
public class JavaStringTokens {

    public static void main(String[] args) {
//        final Scanner scan = new Scanner(System.in);
//        final String s = scan.nextLine();
//        final String s = "He is a very very good boy, isn't he?";
        final String s = "           YES      leading spaces        are valid,    problemsetters are         evillllll";

        final List<String> tokens = new ArrayList<>();
        StringBuilder token = new StringBuilder();

        int count = 0;
        for (final char symbol : s.toCharArray()) {
            count = count + 1;
            final boolean letter = Character.isLetter(symbol);
            if (letter) {
                token.append(symbol);
            } else {
                if (token.length() > 0) {
                    tokens.add(token.toString());
                    token = new StringBuilder();
                }
            }
        }

        if (token.length() > 0) tokens.add(token.toString());

        System.out.println(tokens.size());
        tokens.forEach(System.out::println);

//        scan.close();
    }

}
