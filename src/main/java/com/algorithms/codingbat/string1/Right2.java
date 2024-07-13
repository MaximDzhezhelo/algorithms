package com.algorithms.codingbat.string1;

import java.util.Optional;

/**
 * Given a string, return a "rotated right 2" version where the last 2 chars are moved to the start. The string length will be at least 2.
 */
public class Right2 {

    public String right2(String str) {
        if (Optional.ofNullable(str).filter(s -> s.length() > 2).isEmpty()) {
            return str;
        }
        return str.substring(str.length() - 2) + str.substring(0, str.length() - 2);
    }

}
