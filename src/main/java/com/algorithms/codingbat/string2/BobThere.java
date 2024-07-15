package com.algorithms.codingbat.string2;

/**
 * Return true if the given string contains a "bob" string, but where the middle 'o' char can be any char.
 */
public class BobThere {

    public boolean bobThere(String str) {
        if (str == null || str.length() < 3) {
            return false;
        }

        for (int i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i) == 'b' && str.charAt(i + 2) == 'b') {
                return true;
            }
        }

        return false;
    }

}
