package com.algorithms.leetcode;

public class Palindrome {

    /**
     * A string is a palindrome if it reads the same forward as backward. That means, after reversing it, it is still the same string. For example: "abcdcba", or "racecar
     */
    public boolean isPalindrome(String value) {
        if (value == null) {
            return false;
        }

        int left = 0;
        int right = value.length() - 1;

        while (left < right) {
            char rightChar = value.charAt(right);
            char leftChar = value.charAt(left);

            if (leftChar != rightChar) {
                return false;
            }

            left++;
            right--;

        }

        return true;
    }
}
