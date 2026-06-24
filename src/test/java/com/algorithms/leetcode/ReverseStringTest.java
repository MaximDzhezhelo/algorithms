package com.algorithms.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ReverseStringTest {

    @Test
    public void testReverseString() {
        var reverseString = new ReverseString();
        char[] arr1 = {'h', 'e', 'l', 'l', 'v'};
        char[] expected = {'v', 'l', 'l', 'e', 'h'};
        assertArrayEquals(expected, reverseString.reverseString(arr1));
    }

}