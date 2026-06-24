package com.algorithms.leetcode;

public class ReverseString {

    public char[] reverseString(char[] s) {
        if (s.length == 0) {
            return s;
        }

        int left = 0;
        int right = s.length - 1;
        while (left < right) {
            var sValue = s[left];
            var rValue = s[right];
            s[left] = rValue;
            s[right] = sValue;
            left++;
            right--;
        }

        return s;
    }

}
