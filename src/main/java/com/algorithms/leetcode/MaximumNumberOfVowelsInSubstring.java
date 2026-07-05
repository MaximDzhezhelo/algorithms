package com.algorithms.leetcode;

public class MaximumNumberOfVowelsInSubstring {

    /**
     * Given a string s and an integer k, return the maximum number of vowel letters
     * in any substring of s with length k.
     *
     * Vowel letters in English are 'a', 'e', 'i', 'o', and 'u'.
     *
     * Input: s = "abciiidef", k = 3
     * Output: 3
     * Explanation: The substring "iii" contains 3 vowel letters.
     *
     * Input: s = "aeiou", k = 2
     * Output: 2
     * Explanation: Any substring of length 2 contains 2 vowels.
     *
     * Input: s = "leetcode", k = 3
     * Output: 2
     * Explanation: "lee", "eet" and "ode" contain 2 vowels.
     *
     * Input: s = "rhythms", k = 4
     * Output: 0
     * Explanation: We can see that s doesn't have any vowel letters.
     *
     * Input: s = "tryhard", k = 4
     * Output: 1
     *
     * Time Complexity: O(n) where n = s.length()
     * Space Complexity: O(1)
     *
     * @param s the input string
     * @param k the length of the substring
     * @return the maximum number of vowel letters in any substring of length k
     */
    public int maxVowels(String s, int k) {
        int cur = 0;
        for (int i = 0; i < k; i++) {
            if (isVowel(s.charAt(i))) {
                cur++;
            }
        }

        int left = 0;
        int res = cur;
        for (int right = k; right < s.length(); right++) {
            if (isVowel(s.charAt(right))) {
                cur++;
            }

            if (isVowel(s.charAt(left++))) {
                cur--;
            }

            res = Math.max(res, cur);

            if (res == k) {
                return k;
            }
        }

        return res;
    }

    private boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
