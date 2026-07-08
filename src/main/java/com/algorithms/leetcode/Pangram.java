package com.algorithms.leetcode;

import java.util.HashSet;
import java.util.Set;

public class Pangram {

    /**
     * A pangram is a sentence where every letter of the English alphabet appears at least once.
     *
     * Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.
     * Example 1:
     *
     * Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
     * Output: true
     * Explanation: sentence contains at least one of every letter of the English alphabet.
     * Example 2:
     *
     * Input: sentence = "leetcode"
     * Output: false
     */
    public boolean checkIfPangram(String sentence) {
        Set<Character> letters = new HashSet<>();
        for (int i = 0; i < sentence.length(); i++) {
            letters.add(sentence.charAt(i));

            if (letters.size() == 26) {
                return true;
            }
        }

        return false;
    }

}
