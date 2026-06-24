package com.algorithms.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class IsSubsequenceTest {

    @Test
    public void testIsSubsequence() {
        var subsequence = new IsSubsequence();
        var a = "abc";
        var b = "ahbgdc";
        assertTrue(subsequence.isSubsequence(a, b));
    }

    @Test
    public void testIsNotSubsequence() {
        var subsequence = new IsSubsequence();
        var a = "axc";
        var b = "ahbgdc";
        assertFalse(subsequence.isSubsequence(a, b));
    }

}