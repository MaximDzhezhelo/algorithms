package com.algorithms.codingbat.string2;

/**
 * We'll say that a String is xy-balanced if for all the 'x' chars in the string, there exists a 'y' char somewhere later in the string.
 * So "xxy" is balanced, but "xyx" is not. One 'y' can balance multiple 'x's. Return true if the given string is xy-balanced.
 */
public class XyBalance {

    public boolean xyBalance(String str) {
        boolean balanced = true;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'x') {
                balanced = false;
            } else if (str.charAt(i) == 'y') {
                balanced = true;
            }
        }
        return balanced;
    }

}
