package com.algorithms.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NumberOfWaysToSplitArrayTest {

    @Test
    public void testExample1() {
        var solution = new NumberOfWaysToSplitArray();

        int[] nums = {10, 4, -8, 7};
        assertEquals(2, solution.waysToSplitArray(nums));
    }

    @Test
    public void testExample2() {
        var solution = new NumberOfWaysToSplitArray();

        int[] nums = {2, 3, 1, 0};
        assertEquals(2, solution.waysToSplitArray(nums));
    }

    @Test
    public void testMinimumArraySize() {
        var solution = new NumberOfWaysToSplitArray();

        int[] nums = {5, 3};
        assertEquals(1, solution.waysToSplitArray(nums));
    }

    @Test
    public void testNoValidSplits() {
        var solution = new NumberOfWaysToSplitArray();

        int[] nums = {1, 2, 3, 4, 5};
        assertEquals(1, solution.waysToSplitArray(nums));
    }

    @Test
    public void testAllValidSplits() {
        var solution = new NumberOfWaysToSplitArray();

        int[] nums = {10, 1, 1, 1};
        assertEquals(3, solution.waysToSplitArray(nums));
    }

    @Test
    public void testNegativeNumbers() {
        var solution = new NumberOfWaysToSplitArray();

        int[] nums = {-5, -10, 3, 2};
        assertEquals(1, solution.waysToSplitArray(nums));
    }

    @Test
    public void testAllZeros() {
        var solution = new NumberOfWaysToSplitArray();

        int[] nums = {0, 0, 0, 0};
        assertEquals(3, solution.waysToSplitArray(nums));
    }

    @Test
    public void testSingleValidSplit() {
        var solution = new NumberOfWaysToSplitArray();

        int[] nums = {100, 1, 1, 1, 1};
        assertEquals(4, solution.waysToSplitArray(nums));
    }

    @Test
    public void testLargePositiveSum() {
        var solution = new NumberOfWaysToSplitArray();

        int[] nums = {1000, -1, -1, -1};
        assertEquals(3, solution.waysToSplitArray(nums));
    }

    @Test
    public void testMixedPositiveNegative() {
        var solution = new NumberOfWaysToSplitArray();

        int[] nums = {5, -5, 10, -10, 3};
        assertEquals(2, solution.waysToSplitArray(nums));
    }

    @Test
    public void testEqualSumsAtSplit() {
        var solution = new NumberOfWaysToSplitArray();

        int[] nums = {3, 3, 3, 3};
        assertEquals(2, solution.waysToSplitArray(nums));
    }

    @Test
    public void testIncreasingArray() {
        var solution = new NumberOfWaysToSplitArray();

        int[] nums = {1, 3, 5, 7, 9};
        assertEquals(1, solution.waysToSplitArray(nums));
    }

    @Test
    public void testDecreasingArray() {
        var solution = new NumberOfWaysToSplitArray();

        int[] nums = {9, 7, 5, 3, 1};
        assertEquals(3, solution.waysToSplitArray(nums));
    }

}
