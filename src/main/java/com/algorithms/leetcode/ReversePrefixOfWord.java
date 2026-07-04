package com.algorithms.leetcode;

public class ReversePrefixOfWord {

    /**
     * Given a 0-indexed string word and a character ch, reverse the segment of word
     * that starts at index 0 and ends at the index of the first occurrence of ch (inclusive).
     * If the character ch does not exist in word, do nothing.
     *
     * Input: word = "abcdefd", ch = "d"
     * Output: "dcbaefd"
     * Explanation: The first occurrence of "d" is at index 3.
     * Reverse the part of word from 0 to 3 (inclusive), the resulting string is "dcbaefd".
     *
     * Input: word = "xyxzxe", ch = "z"
     * Output: "zxyxxe"
     * Explanation: The first and only occurrence of "z" is at index 3.
     * Reverse the part of word from 0 to 3 (inclusive), the resulting string is "zxyxxe".
     *
     * Input: word = "abcd", ch = "z"
     * Output: "abcd"
     * Explanation: "z" does not exist in word.
     * You should not do any reverse operation, the resulting string is "abcd".
     *
     * Time Complexity: O(n) where n = word.length
     * Space Complexity: O(n) for the result string
     *
     * @param word the input string
     * @param ch the character to find
     * @return the modified string with reversed prefix
     */
    public String reversePrefix(String word, char ch) {
        char[] charArray = word.toCharArray();
        int left = 0;
        for (int right = 0; right < charArray.length; right++) {
            if (charArray[right] == ch) {
                while (left < right) {
                    char temp = charArray[right];
                    charArray[right] = charArray[left];
                    charArray[left] = temp;
                    right--;
                    left++;
                }
                break;
            }
        }

        return new String(charArray);
    }

}
