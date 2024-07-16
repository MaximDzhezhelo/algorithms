package com.algorithms.codingbat.string2;

/**
 * Given a string and an int n, return a string made of n repetitions of the last n characters of the string. You may assume that n is between 0 and the length of the string, inclusive.
 */
public class RepeatEnd {

    public String repeatEnd(String str, int n) {
        if (str.length() < n) {
            return str;
        }
        String substring = str.substring(str.length() - n);
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            result.append(substring);
        }
        return result.toString();
    }

}
