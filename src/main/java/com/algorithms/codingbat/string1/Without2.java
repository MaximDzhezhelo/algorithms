package com.algorithms.codingbat.string1;

/**
 * Given a string, if a length 2 substring appears at both its beginning and end, return a string without the substring at the beginning, so "HelloHe" yields "lloHe". The substring may overlap with itself, so "Hi" yields "". Otherwise, return the original string unchanged.
 */
public class Without2 {

    public String without2(String str) {
        if (str.length() < 2) {
            return str;
        }
        var substring = str.substring(0, 2);
        if (str.startsWith(substring) && str.endsWith(substring)) {
            return str.replaceFirst(substring, "");
        }
        return str;
    }

}
