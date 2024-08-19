package com.algorithms.leetcode;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class SquaresOfASortedArrayTest {

    @Test
    public void sortedSquares() {
        var sortedSquares = new SquaresOfASortedArray();
        int[] nums = {-4, -1, 0, 3, 10};
        int[] res = {0, 1, 9, 16, 100};

        assertEquals(Arrays.toString(res), Arrays.toString(sortedSquares.sortedSquares(nums)));
    }
}