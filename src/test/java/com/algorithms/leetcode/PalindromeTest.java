package com.algorithms.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PalindromeTest {

    @Test
    void isIsPalindrome() {
        var palindrome = new Palindrome();
        assertFalse(palindrome.isPalindrome(null));
        assertFalse(palindrome.isPalindrome("abcdefghijklmnopqrstuvwxyz"));
        assertTrue(palindrome.isPalindrome("A"));
        assertTrue(palindrome.isPalindrome("AA"));
        assertTrue(palindrome.isPalindrome("ABA"));
        assertTrue(palindrome.isPalindrome("abcdcba"));
    }

}