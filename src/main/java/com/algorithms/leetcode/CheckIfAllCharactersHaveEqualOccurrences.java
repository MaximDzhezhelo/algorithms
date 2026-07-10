package com.algorithms.leetcode;

import java.util.HashMap;

public class CheckIfAllCharactersHaveEqualOccurrences {

    /**
     * Given a string s, return true if s is a good string, or false otherwise.
     *
     * A string s is good if all the characters that appear in s have the same number
     * of occurrences (i.e., the same frequency).
     *
     * Input: s = "abacbc"
     * Output: true
     * Explanation: The characters that appear in s are 'a', 'b', and 'c'.
     * All characters occur 2 times in s.
     *
     * Input: s = "aaabb"
     * Output: false
     * Explanation: The characters that appear in s are 'a' and 'b'.
     * 'a' occurs 3 times while 'b' occurs 2 times, which is not the same number of times.
     *
     * Constraints:
     * - 1 <= s.length <= 1000
     * - s consists of lowercase English letters
     *
     * Time Complexity: O(n) where n = s.length()
     * Space Complexity: O(1) - at most 26 lowercase English letters
     *
     * @param s the input string
     * @return true if all characters have equal occurrences, false otherwise
     */
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character, Integer> occurrences = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            occurrences.put(s.charAt(i), occurrences.getOrDefault(s.charAt(i), 0) + 1);
        }

        Integer firstFreq = occurrences.get(s.charAt(0));
        return occurrences.entrySet()
                .stream()
                .allMatch(freq -> freq.getValue().equals(firstFreq));
    }
}
