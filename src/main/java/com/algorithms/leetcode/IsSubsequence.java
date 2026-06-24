package com.algorithms.leetcode;

public class IsSubsequence {

    /**
     * Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
     * A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).
     */
    public boolean isSubsequence(String s, String t) {
        int sL = 0;
        int tL = 0;

        while (sL < s.length() && tL < t.length()) {
            char aC = s.charAt(sL);
            char bC = t.charAt(tL);

            if (aC == bC) {
                sL++;
            }

            tL++;
        }

        return sL == s.length();
    }

}
