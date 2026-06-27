package com.algorithms.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class RunningSumOf1dArrayTest {

    @Test
    public void testExample1() {
        var solution = new RunningSumOf1dArray();

        int[] nums = {1, 2, 3, 4};
        int[] expected = {1, 3, 6, 10};
        assertArrayEquals(expected, solution.runningSum(nums));
    }

    @Test
    public void testExample2() {
        var solution = new RunningSumOf1dArray();

        int[] nums = {1, 1, 1, 1, 1};
        int[] expected = {1, 2, 3, 4, 5};
        assertArrayEquals(expected, solution.runningSum(nums));
    }

    @Test
    public void testExample3() {
        var solution = new RunningSumOf1dArray();

        int[] nums = {3, 1, 2, 10, 1};
        int[] expected = {3, 4, 6, 16, 17};
        assertArrayEquals(expected, solution.runningSum(nums));
    }

    @Test
    public void testSingleElement() {
        var solution = new RunningSumOf1dArray();

        int[] nums = {5};
        int[] expected = {5};
        assertArrayEquals(expected, solution.runningSum(nums));
    }

    @Test
    public void testAllZeros() {
        var solution = new RunningSumOf1dArray();

        int[] nums = {0, 0, 0, 0};
        int[] expected = {0, 0, 0, 0};
        assertArrayEquals(expected, solution.runningSum(nums));
    }

    @Test
    public void testNegativeNumbers() {
        var solution = new RunningSumOf1dArray();

        int[] nums = {-1, -2, -3, -4};
        int[] expected = {-1, -3, -6, -10};
        assertArrayEquals(expected, solution.runningSum(nums));
    }

    @Test
    public void testMixedPositiveNegative() {
        var solution = new RunningSumOf1dArray();

        int[] nums = {5, -3, 2, -1, 4};
        int[] expected = {5, 2, 4, 3, 7};
        assertArrayEquals(expected, solution.runningSum(nums));
    }

    @Test
    public void testTwoElements() {
        var solution = new RunningSumOf1dArray();

        int[] nums = {10, 20};
        int[] expected = {10, 30};
        assertArrayEquals(expected, solution.runningSum(nums));
    }

    @Test
    public void testIncreasingSequence() {
        var solution = new RunningSumOf1dArray();

        int[] nums = {1, 2, 3, 4, 5, 6};
        int[] expected = {1, 3, 6, 10, 15, 21};
        assertArrayEquals(expected, solution.runningSum(nums));
    }

    @Test
    public void testDecreasingSequence() {
        var solution = new RunningSumOf1dArray();

        int[] nums = {10, 5, 3, 2, 1};
        int[] expected = {10, 15, 18, 20, 21};
        assertArrayEquals(expected, solution.runningSum(nums));
    }

    @Test
    public void testLargeNumbers() {
        var solution = new RunningSumOf1dArray();

        int[] nums = {1000, 2000, 3000};
        int[] expected = {1000, 3000, 6000};
        assertArrayEquals(expected, solution.runningSum(nums));
    }

    @Test
    public void testAlternatingSignsStartingPositive() {
        var solution = new RunningSumOf1dArray();

        int[] nums = {10, -5, 3, -2, 8};
        int[] expected = {10, 5, 8, 6, 14};
        assertArrayEquals(expected, solution.runningSum(nums));
    }

    @Test
    public void testAlternatingSignsStartingNegative() {
        var solution = new RunningSumOf1dArray();

        int[] nums = {-5, 10, -3, 8, -2};
        int[] expected = {-5, 5, 2, 10, 8};
        assertArrayEquals(expected, solution.runningSum(nums));
    }

}
