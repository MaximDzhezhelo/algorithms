package com.algorithms.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CheckIfAllCharactersHaveEqualOccurrencesTest {

    @Test
    public void testBasicExample1() {
        var solution = new CheckIfAllCharactersHaveEqualOccurrences();
        String s = "abacbc";
        boolean result = solution.areOccurrencesEqual(s);
        assertTrue(result);
    }

    @Test
    public void testBasicExample2() {
        var solution = new CheckIfAllCharactersHaveEqualOccurrences();
        String s = "aaabb";
        boolean result = solution.areOccurrencesEqual(s);
        assertFalse(result);
    }

    @Test
    public void testSingleCharacter() {
        var solution = new CheckIfAllCharactersHaveEqualOccurrences();
        String s = "a";
        boolean result = solution.areOccurrencesEqual(s);
        assertTrue(result);
    }

    @Test
    public void testAllSameCharacter() {
        var solution = new CheckIfAllCharactersHaveEqualOccurrences();
        String s = "aaaa";
        boolean result = solution.areOccurrencesEqual(s);
        assertTrue(result);
    }

    @Test
    public void testTwoCharactersEqualFrequency() {
        var solution = new CheckIfAllCharactersHaveEqualOccurrences();
        String s = "aabb";
        boolean result = solution.areOccurrencesEqual(s);
        assertTrue(result);
    }

    @Test
    public void testTwoCharactersUnequalFrequency() {
        var solution = new CheckIfAllCharactersHaveEqualOccurrences();
        String s = "aaab";
        boolean result = solution.areOccurrencesEqual(s);
        assertFalse(result);
    }

    @Test
    public void testThreeCharactersEqualFrequency() {
        var solution = new CheckIfAllCharactersHaveEqualOccurrences();
        String s = "aabbcc";
        boolean result = solution.areOccurrencesEqual(s);
        assertTrue(result);
    }

    @Test
    public void testThreeCharactersUnequalFrequency() {
        var solution = new CheckIfAllCharactersHaveEqualOccurrences();
        String s = "aabbc";
        boolean result = solution.areOccurrencesEqual(s);
        assertFalse(result);
    }

    @Test
    public void testAllDifferentCharactersOnce() {
        var solution = new CheckIfAllCharactersHaveEqualOccurrences();
        String s = "abcdefg";
        boolean result = solution.areOccurrencesEqual(s);
        assertTrue(result);
    }

    @Test
    public void test() {
        var solution = new CheckIfAllCharactersHaveEqualOccurrences();
        String s = "vvvvvvvvvvvvvvvvvvv";
        boolean result = solution.areOccurrencesEqual(s);
        assertTrue(result);
    }

    @Test
    public void testComplexEqualFrequency() {
        var solution = new CheckIfAllCharactersHaveEqualOccurrences();
        String s = "abcabcabc";
        boolean result = solution.areOccurrencesEqual(s);
        assertTrue(result);
    }

    @Test
    public void testComplexUnequalFrequency() {
        var solution = new CheckIfAllCharactersHaveEqualOccurrences();
        String s = "abcabcab";
        boolean result = solution.areOccurrencesEqual(s);
        assertFalse(result);
    }

    @Test
    public void testManyCharactersEqualFrequency() {
        var solution = new CheckIfAllCharactersHaveEqualOccurrences();
        String s = "aabbccddee";
        boolean result = solution.areOccurrencesEqual(s);
        assertTrue(result);
    }

    @Test
    public void testManyCharactersOneOff() {
        var solution = new CheckIfAllCharactersHaveEqualOccurrences();
        String s = "aabbccdde";
        boolean result = solution.areOccurrencesEqual(s);
        assertFalse(result);
    }

    @Test
    public void testAlternatingPattern() {
        var solution = new CheckIfAllCharactersHaveEqualOccurrences();
        String s = "ababab";
        boolean result = solution.areOccurrencesEqual(s);
        assertTrue(result);
    }

    @Test
    public void testLongStringEqualFrequency() {
        var solution = new CheckIfAllCharactersHaveEqualOccurrences();
        String s = "aaaaabbbbbcccccdddddeeeee";
        boolean result = solution.areOccurrencesEqual(s);
        assertTrue(result);
    }

    @Test
    public void testLongStringUnequalFrequency() {
        var solution = new CheckIfAllCharactersHaveEqualOccurrences();
        String s = "aaaaabbbbbcccccdddddeeee";
        boolean result = solution.areOccurrencesEqual(s);
        assertFalse(result);
    }

    @Test
    public void testTwoCharactersFrequencyThree() {
        var solution = new CheckIfAllCharactersHaveEqualOccurrences();
        String s = "aaabbb";
        boolean result = solution.areOccurrencesEqual(s);
        assertTrue(result);
    }

    @Test
    public void testRandomOrder() {
        var solution = new CheckIfAllCharactersHaveEqualOccurrences();
        String s = "abcacb";
        boolean result = solution.areOccurrencesEqual(s);
        assertTrue(result);
    }

    @Test
    public void testAlphabetAllOnce() {
        var solution = new CheckIfAllCharactersHaveEqualOccurrences();
        String s = "abcdefghijklmnopqrstuvwxyz";
        boolean result = solution.areOccurrencesEqual(s);
        assertTrue(result);
    }

    @Test
    public void testMultipleOccurrencesUnordered() {
        var solution = new CheckIfAllCharactersHaveEqualOccurrences();
        String s = "aabbccaabbcc";
        boolean result = solution.areOccurrencesEqual(s);
        assertTrue(result);
    }
}
