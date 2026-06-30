package com.algorithms.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseWordsInAStringIIITest {

    @Test
    public void testExample() {
        var solution = new ReverseWordsInAStringIII();
        assertEquals("s'teL ekat edoCteeL tsetnoc", solution.reverseWords("Let's take LeetCode contest"));
        assertEquals("rM gniD", solution.reverseWords("Mr Ding"));
    }
}