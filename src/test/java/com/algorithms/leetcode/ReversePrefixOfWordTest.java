package com.algorithms.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReversePrefixOfWordTest {

    @Test
    public void testBasicReversePrefix() {
        var solution = new ReversePrefixOfWord();
        String result = solution.reversePrefix("abcdefd", 'd');
        assertEquals("dcbaefd", result);
    }

    @Test
    public void testReversePrefixExample2() {
        var solution = new ReversePrefixOfWord();
        String result = solution.reversePrefix("xyxzxe", 'z');
        assertEquals("zxyxxe", result);
    }

    @Test
    public void testCharacterNotFound() {
        var solution = new ReversePrefixOfWord();
        String result = solution.reversePrefix("abcd", 'z');
        assertEquals("abcd", result);
    }

    @Test
    public void testFirstCharacterMatch() {
        var solution = new ReversePrefixOfWord();
        String result = solution.reversePrefix("abcdef", 'a');
        assertEquals("abcdef", result);
    }

    @Test
    public void testLastCharacterMatch() {
        var solution = new ReversePrefixOfWord();
        String result = solution.reversePrefix("abcdef", 'f');
        assertEquals("fedcba", result);
    }

    @Test
    public void testSingleCharacterWordMatch() {
        var solution = new ReversePrefixOfWord();
        String result = solution.reversePrefix("a", 'a');
        assertEquals("a", result);
    }

    @Test
    public void testSingleCharacterWordNoMatch() {
        var solution = new ReversePrefixOfWord();
        String result = solution.reversePrefix("a", 'b');
        assertEquals("a", result);
    }

    @Test
    public void testTwoCharactersMatch() {
        var solution = new ReversePrefixOfWord();
        String result = solution.reversePrefix("ab", 'b');
        assertEquals("ba", result);
    }

    @Test
    public void testReversePrefixAtMiddle() {
        var solution = new ReversePrefixOfWord();
        String result = solution.reversePrefix("hello", 'l');
        assertEquals("lehlo", result);
    }

    @Test
    public void testAllSameCharacters() {
        var solution = new ReversePrefixOfWord();
        String result = solution.reversePrefix("aaaa", 'a');
        assertEquals("aaaa", result);
    }

    @Test
    public void testReversePrefixWithNumbers() {
        var solution = new ReversePrefixOfWord();
        String result = solution.reversePrefix("abc123def", '3');
        assertEquals("321cbadef", result);
    }

    @Test
    public void testReversePrefixWithSpecialCharacters() {
        var solution = new ReversePrefixOfWord();
        String result = solution.reversePrefix("abc@def", '@');
        assertEquals("@cbadef", result);
    }

    @Test
    public void testLongString() {
        var solution = new ReversePrefixOfWord();
        String result = solution.reversePrefix("abcdefghijklmnop", 'h');
        assertEquals("hgfedcbaijklmnop", result);
    }

    @Test
    public void testCharacterAtSecondPosition() {
        var solution = new ReversePrefixOfWord();
        String result = solution.reversePrefix("programming", 'r');
        assertEquals("rpogramming", result);
    }
}
