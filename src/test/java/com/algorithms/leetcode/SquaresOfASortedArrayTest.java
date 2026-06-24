package com.algorithms.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SquaresOfASortedArrayTest {

    @Test
    public void testBasicMergeA() {
        var squares = new SquaresOfASortedArray();
        int[] arr1 = {4, -1, 0, 3, 10};
        int[] expected = {0, 1, 9, 16, 100};
        assertArrayEquals(expected, squares.sortedSquares(arr1));
    }

}