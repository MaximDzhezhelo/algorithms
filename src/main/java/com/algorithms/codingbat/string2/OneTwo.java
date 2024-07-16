package com.algorithms.codingbat.string2;

/**
 * Given a string, compute a new string by moving the first char to come after the next two chars, so "abc" yields "bca". Repeat this process for each subsequent group of 3 chars, so "abcdef" yields "bcaefd". Ignore any group of fewer than 3 chars at the end.
 */
public class OneTwo {

    public String oneTwo(String str) {
        if (str.length() < 2) {
            return "";
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length() - 2; i = i + 3) {
            var substring = str.substring(i, i + 3);
            result.append(substring, 1, substring.length());
            result.append(substring, 0, 1);
        }
        return result.toString();
    }

}
