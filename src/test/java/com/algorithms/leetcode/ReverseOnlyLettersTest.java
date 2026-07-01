package com.algorithms.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ReverseOnlyLettersTest {

    @Test
    public void testIsAscii() {
        var solution = new ReverseOnlyLetters();

        assertFalse(solution.isAscii('a'));
        assertFalse(solution.isAscii('b'));
        assertTrue(solution.isAscii('-'));
    }

    @Test
    public void testExample1() {
        var solution = new ReverseOnlyLetters();

        String s = "ab-cd";
        assertEquals("dc-ba", solution.reverseOnlyLetters(s));
    }

    @Test
    public void testExample2() {
        var solution = new ReverseOnlyLetters();

        String s = "a-bC-dEf-ghIj";
        assertEquals("j-Ih-gfE-dCba", solution.reverseOnlyLetters(s));
    }

    @Test
    public void testExample3() {
        var solution = new ReverseOnlyLetters();

        String s = "Test1ng-Leet=code-Q!";
        assertEquals("Qedo1ct-eeLg=ntse-T!", solution.reverseOnlyLetters(s));
    }

    @Test
    public void testOnlyLetters() {
        var solution = new ReverseOnlyLetters();

        String s = "abcdef";
        assertEquals("fedcba", solution.reverseOnlyLetters(s));
    }

    @Test
    public void testNoLetters() {
        var solution = new ReverseOnlyLetters();

        String s = "123-456!@#";
        assertEquals("123-456!@#", solution.reverseOnlyLetters(s));
    }

    @Test
    public void testSingleLetter() {
        var solution = new ReverseOnlyLetters();

        String s = "a";
        assertEquals("a", solution.reverseOnlyLetters(s));
    }

    @Test
    public void testSingleNonLetter() {
        var solution = new ReverseOnlyLetters();

        String s = "1";
        assertEquals("1", solution.reverseOnlyLetters(s));
    }

    @Test
    public void testMixedCase() {
        var solution = new ReverseOnlyLetters();

        String s = "AbC";
        assertEquals("CbA", solution.reverseOnlyLetters(s));
    }

    @Test
    public void testLettersAtEnds() {
        var solution = new ReverseOnlyLetters();

        String s = "a-1-b";
        assertEquals("b-1-a", solution.reverseOnlyLetters(s));
    }

    @Test
    public void testMultipleSpecialCharacters() {
        var solution = new ReverseOnlyLetters();

        String s = "a!!!b???c";
        assertEquals("c!!!b???a", solution.reverseOnlyLetters(s));
    }

    @Test
    public void testAllUppercase() {
        var solution = new ReverseOnlyLetters();

        String s = "ABC-DEF";
        assertEquals("FED-CBA", solution.reverseOnlyLetters(s));
    }

    @Test
    public void testAllLowercase() {
        var solution = new ReverseOnlyLetters();

        String s = "abc-def";
        assertEquals("fed-cba", solution.reverseOnlyLetters(s));
    }

    @Test
    public void testNumbersInBetween() {
        var solution = new ReverseOnlyLetters();

        String s = "a1b2c3";
        assertEquals("c1b2a3", solution.reverseOnlyLetters(s));
    }

    @Test
    public void testSpecialCharactersAtStart() {
        var solution = new ReverseOnlyLetters();

        String s = "!!!abc";
        assertEquals("!!!cba", solution.reverseOnlyLetters(s));
    }

    @Test
    public void testSpecialCharactersAtEnd() {
        var solution = new ReverseOnlyLetters();

        String s = "abc!!!";
        assertEquals("cba!!!", solution.reverseOnlyLetters(s));
    }

    @Test
    public void testAlternatingLettersAndSymbols() {
        var solution = new ReverseOnlyLetters();

        String s = "a-b-c-d";
        assertEquals("d-c-b-a", solution.reverseOnlyLetters(s));
    }

    @Test
    public void testConsecutiveSpecialCharacters() {
        var solution = new ReverseOnlyLetters();

        String s = "ab---cd";
        assertEquals("dc---ba", solution.reverseOnlyLetters(s));
    }

    @Test
    public void testEmptyString() {
        var solution = new ReverseOnlyLetters();

        String s = "";
        assertEquals("", solution.reverseOnlyLetters(s));
    }

    @Test
    public void testSpacesAsNonLetters() {
        var solution = new ReverseOnlyLetters();

        String s = "a b c";
        assertEquals("c b a", solution.reverseOnlyLetters(s));
    }

    @Test
    public void testLongString() {
        var solution = new ReverseOnlyLetters();

        String s = "Hello-World!123";
        assertEquals("dlroW-olleH!123", solution.reverseOnlyLetters(s));
    }

}
