package com.algorithms.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaximumNumberOfVowelsInSubstringTest {

    @Test
    public void testBasicMaxVowels() {
        var solution = new MaximumNumberOfVowelsInSubstring();
        String s = "abciiidef";
        int result = solution.maxVowels(s, 3);
        assertEquals(3, result);
    }

    @Test
    public void testAllVowels() {
        var solution = new MaximumNumberOfVowelsInSubstring();
        String s = "aeiou";
        int result = solution.maxVowels(s, 2);
        assertEquals(2, result);
    }

    @Test
    public void testLeetcodeExample() {
        var solution = new MaximumNumberOfVowelsInSubstring();
        String s = "leetcode";
        int result = solution.maxVowels(s, 3);
        assertEquals(2, result);
    }

    @Test
    public void testNoVowels() {
        var solution = new MaximumNumberOfVowelsInSubstring();
        String s = "rhythms";
        int result = solution.maxVowels(s, 4);
        assertEquals(0, result);
    }

    @Test
    public void testTryhardExample() {
        var solution = new MaximumNumberOfVowelsInSubstring();
        String s = "tryhard";
        int result = solution.maxVowels(s, 4);
        assertEquals(1, result);
    }

    @Test
    public void testSingleCharacterVowel() {
        var solution = new MaximumNumberOfVowelsInSubstring();
        String s = "a";
        int result = solution.maxVowels(s, 1);
        assertEquals(1, result);
    }

    @Test
    public void testSingleCharacterConsonant() {
        var solution = new MaximumNumberOfVowelsInSubstring();
        String s = "b";
        int result = solution.maxVowels(s, 1);
        assertEquals(0, result);
    }

    @Test
    public void testVowelsAtBeginning() {
        var solution = new MaximumNumberOfVowelsInSubstring();
        String s = "aeioubc";
        int result = solution.maxVowels(s, 5);
        assertEquals(5, result);
    }

    @Test
    public void testVowelsAtEnd() {
        var solution = new MaximumNumberOfVowelsInSubstring();
        String s = "bcaeiou";
        int result = solution.maxVowels(s, 5);
        assertEquals(5, result);
    }

    @Test
    public void testVowelsInMiddle() {
        var solution = new MaximumNumberOfVowelsInSubstring();
        String s = "bcaeioubcd";
        int result = solution.maxVowels(s, 5);
        assertEquals(5, result);
    }

    @Test
    public void testAlternatingVowelsConsonants() {
        var solution = new MaximumNumberOfVowelsInSubstring();
        String s = "ababab";
        int result = solution.maxVowels(s, 2);
        assertEquals(1, result);
    }

    @Test
    public void testLargeWindow() {
        var solution = new MaximumNumberOfVowelsInSubstring();
        String s = "novowelshere";
        int result = solution.maxVowels(s, 10);
        assertEquals(4, result);
    }

    @Test
    public void testAllConsonantsLargeString() {
        var solution = new MaximumNumberOfVowelsInSubstring();
        String s = "bcdfghjklmnpqrstvwxyz";
        int result = solution.maxVowels(s, 5);
        assertEquals(0, result);
    }

    @Test
    public void testMixedCase() {
        var solution = new MaximumNumberOfVowelsInSubstring();
        String s = "programming";
        int result = solution.maxVowels(s, 4);
        assertEquals(2, result);
    }
}
