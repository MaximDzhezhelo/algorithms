package com.algorithms.leetcode;

public class GetEqualSubstringsWithinBudget {

    /**
     * You are given two strings s and t of the same length and an integer maxCost.
     * You want to change s to t. Changing the ith character of s to ith character of t costs |s[i] - t[i]|
     * (i.e., the absolute difference between the ASCII values of the characters).
     *
     * Return the maximum length of a substring of s that can be changed to be the same as
     * the corresponding substring of t with a cost less than or equal to maxCost.
     * If there is no substring from s that can be changed to its corresponding substring from t, return 0.
     *
     * Input: s = "abcd", t = "bcdf", maxCost = 3
     * Output: 3
     * Explanation: "abc" of s can change to "bcd". That costs 3, so the maximum length is 3.
     *
     * Input: s = "abcd", t = "cdef", maxCost = 3
     * Output: 1
     * Explanation: Each character in s costs 2 to change to character in t, so the maximum length is 1.
     *
     * Input: s = "abcd", t = "acde", maxCost = 0
     * Output: 1
     * Explanation: You cannot make any change, so the maximum length is 1.
     *
     * Constraints:
     * - 1 <= s.length <= 10^5
     * - t.length == s.length
     * - 0 <= maxCost <= 10^6
     * - s and t consist of only lowercase English letters
     *
     * Time Complexity: O(n) where n = s.length()
     * Space Complexity: O(1)
     *
     * @param s the source string
     * @param t the target string
     * @param maxCost the maximum cost allowed
     * @return the maximum length of substring that can be changed within budget
     */
    public int equalSubstring(String s, String t, int maxCost) {
        int res = 0;
        int sum = 0;
        int temp = 0;
        int left = 0;

        for (int right = 0; right < s.length(); right++) {
            sum += Math.abs(s.charAt(right) - t.charAt(right));
            temp++;

            if (sum <= maxCost) {
                res = Math.max(res, temp);
            }

            while (sum > maxCost) {
                sum -= Math.abs(s.charAt(left) - t.charAt(left));
                left++;
                temp--;
            }
        }

        return res;
    }
}
