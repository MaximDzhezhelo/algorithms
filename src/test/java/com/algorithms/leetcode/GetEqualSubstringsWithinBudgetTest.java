package com.algorithms.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GetEqualSubstringsWithinBudgetTest {

    @Test
    public void testBasicExample() {
        var solution = new GetEqualSubstringsWithinBudget();
        String s = "abcd";
        String t = "bcdf";
        int result = solution.equalSubstring(s, t, 3);
        assertEquals(3, result);
    }

    @Test
    public void testExpensiveChanges() {
        var solution = new GetEqualSubstringsWithinBudget();
        String s = "abcd";
        String t = "cdef";
        int result = solution.equalSubstring(s, t, 3);
        assertEquals(1, result);
    }

    @Test
    public void testZeroBudget() {
        var solution = new GetEqualSubstringsWithinBudget();
        String s = "abcd";
        String t = "acde";
        int result = solution.equalSubstring(s, t, 0);
        assertEquals(1, result);
    }

    @Test
    public void testIdenticalStrings() {
        var solution = new GetEqualSubstringsWithinBudget();
        String s = "abcd";
        String t = "abcd";
        int result = solution.equalSubstring(s, t, 0);
        assertEquals(4, result);
    }

    @Test
    public void testIdenticalStringsWithBudget() {
        var solution = new GetEqualSubstringsWithinBudget();
        String s = "abcd";
        String t = "abcd";
        int result = solution.equalSubstring(s, t, 10);
        assertEquals(4, result);
    }

    @Test
    public void testSingleCharacterMatch() {
        var solution = new GetEqualSubstringsWithinBudget();
        String s = "a";
        String t = "a";
        int result = solution.equalSubstring(s, t, 0);
        assertEquals(1, result);
    }

    @Test
    public void testSingleCharacterNoMatch() {
        var solution = new GetEqualSubstringsWithinBudget();
        String s = "a";
        String t = "z";
        int result = solution.equalSubstring(s, t, 10);
        assertEquals(0, result);
    }

    @Test
    public void testSingleCharacterExactBudget() {
        var solution = new GetEqualSubstringsWithinBudget();
        String s = "a";
        String t = "d";
        int result = solution.equalSubstring(s, t, 3);
        assertEquals(1, result);
    }

    @Test
    public void testLargeBudget() {
        var solution = new GetEqualSubstringsWithinBudget();
        String s = "abcd";
        String t = "wxyz";
        int result = solution.equalSubstring(s, t, 1000);
        assertEquals(4, result);
    }

    @Test
    public void testAlternatingCosts() {
        var solution = new GetEqualSubstringsWithinBudget();
        String s = "aaaa";
        String t = "bbbb";
        int result = solution.equalSubstring(s, t, 2);
        assertEquals(2, result);
    }

    @Test
    public void testVaryingCosts() {
        var solution = new GetEqualSubstringsWithinBudget();
        String s = "abcde";
        String t = "abcde";
        int result = solution.equalSubstring(s, t, 5);
        assertEquals(5, result);
    }

    @Test
    public void testHighCostAtStart() {
        var solution = new GetEqualSubstringsWithinBudget();
        String s = "azzzz";
        String t = "zzzzz";
        int result = solution.equalSubstring(s, t, 10);
        assertEquals(4, result);
    }

    @Test
    public void testHighCostAtEnd() {
        var solution = new GetEqualSubstringsWithinBudget();
        String s = "zzzzc";
        String t = "zzzzz";
        int result = solution.equalSubstring(s, t, 10);
        assertEquals(4, result);
    }

    @Test
    public void testMixedCosts() {
        var solution = new GetEqualSubstringsWithinBudget();
        String s = "krrgw";
        String t = "zjxss";
        int result = solution.equalSubstring(s, t, 19);
        assertEquals(2, result);
    }

    @Test
    public void testNoBudget() {
        var solution = new GetEqualSubstringsWithinBudget();
        String s = "abcd";
        String t = "efgh";
        int result = solution.equalSubstring(s, t, 0);
        assertEquals(0, result);
    }

    @Test
    public void testLongStringIdentical() {
        var solution = new GetEqualSubstringsWithinBudget();
        String s = "aaaaaaaaaa";
        String t = "aaaaaaaaaa";
        int result = solution.equalSubstring(s, t, 0);
        assertEquals(10, result);
    }

    @Test
    public void testLongStringWithSmallBudget() {
        var solution = new GetEqualSubstringsWithinBudget();
        String s = "aaaaaaaaaa";
        String t = "bbbbbbbbbb";
        int result = solution.equalSubstring(s, t, 5);
        assertEquals(5, result);
    }

    @Test
    public void testPartialMatchInMiddle() {
        var solution = new GetEqualSubstringsWithinBudget();
        String s = "jzmhzdq";
        String t = "rymuemg";
        int result = solution.equalSubstring(s, t, 17);
        assertEquals(3, result);
    }
}
