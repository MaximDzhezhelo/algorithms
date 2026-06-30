package com.algorithms.leetcode;

public class ReverseWordsInAStringIII {

    public String reverseWords(String s) {
        char[] chars = s.toCharArray();
        int start = 0;

        for (int i = 0; i <= chars.length; i++) {
            if (i == chars.length || chars[i] == ' ') {
                int left = start;
                int right = i - 1;
                while (left < right) {
                    char temp = chars[left];
                    chars[left] = chars[right];
                    chars[right] = temp;
                    left++;
                    right--;
                }
                start = i + 1;
            }
        }

        return new String(chars);
    }

}
