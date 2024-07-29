package com.algorithms.leetcode;

public class ReverseString {

    public char[] reverse(char[] s) {
        int left = 0;
        int right = s.length - 1;

        while (left < right) {
            var leftChar = s[left];
            var rightChar = s[right];
            s[left] = rightChar;
            s[right] = leftChar;
            left++;
            right--;
        }

        return s;
    }

}
