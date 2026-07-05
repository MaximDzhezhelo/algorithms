package com.algorithms.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MinimumSizeSubarraySumTest {

    @Test
    public void testBasicMinimumSubarray() {
        var solution = new MinimumSizeSubarraySum();
        int[] nums = {2, 3, 1, 2, 4, 3};
        int result = solution.minSubArrayLen(7, nums);
        assertEquals(2, result);
    }

    @Test
    public void testSingleElementMatch() {
        var solution = new MinimumSizeSubarraySum();
        int[] nums = {1, 4, 4};
        int result = solution.minSubArrayLen(4, nums);
        assertEquals(1, result);
    }

    @Test
    public void testNoSolutionExists() {
        var solution = new MinimumSizeSubarraySum();
        int[] nums = {1, 1, 1, 1, 1, 1, 1, 1};
        int result = solution.minSubArrayLen(11, nums);
        assertEquals(0, result);
    }

    @Test
    public void testEntireArrayIsMinimum() {
        var solution = new MinimumSizeSubarraySum();
        int[] nums = {1, 2, 3, 4};
        int result = solution.minSubArrayLen(10, nums);
        assertEquals(4, result);
    }

    @Test
    public void testSingleElementArray() {
        var solution = new MinimumSizeSubarraySum();
        int[] nums = {5};
        int result = solution.minSubArrayLen(5, nums);
        assertEquals(1, result);
    }

    @Test
    public void testSingleElementArrayNoMatch() {
        var solution = new MinimumSizeSubarraySum();
        int[] nums = {3};
        int result = solution.minSubArrayLen(10, nums);
        assertEquals(0, result);
    }

    @Test
    public void testTargetIsOne() {
        var solution = new MinimumSizeSubarraySum();
        int[] nums = {1, 2, 3, 4, 5};
        int result = solution.minSubArrayLen(1, nums);
        assertEquals(1, result);
    }

    @Test
    public void testAllElementsSame() {
        var solution = new MinimumSizeSubarraySum();
        int[] nums = {5, 5, 5, 5, 5};
        int result = solution.minSubArrayLen(15, nums);
        assertEquals(3, result);
    }

    @Test
    public void testLargeNumbersAtEnd() {
        var solution = new MinimumSizeSubarraySum();
        int[] nums = {1, 1, 1, 1, 100};
        int result = solution.minSubArrayLen(100, nums);
        assertEquals(1, result);
    }

    @Test
    public void testTwoElementsSum() {
        var solution = new MinimumSizeSubarraySum();
        int[] nums = {5, 1, 3, 5, 10, 7, 4, 9, 2, 8};
        int result = solution.minSubArrayLen(15, nums);
        assertEquals(2, result);
    }

    @Test
    public void testConsecutiveElementsNeeded() {
        var solution = new MinimumSizeSubarraySum();
        int[] nums = {1, 2, 3, 4, 5};
        int result = solution.minSubArrayLen(11, nums);
        assertEquals(3, result);
    }

    @Test
    public void testTargetEqualsSum() {
        var solution = new MinimumSizeSubarraySum();
        int[] nums = {2, 3, 1, 2, 4, 3};
        int result = solution.minSubArrayLen(15, nums);
        assertEquals(6, result);
    }

    @Test
    public void testLargeArray() {
        var solution = new MinimumSizeSubarraySum();
        int[] nums = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 100};
        int result = solution.minSubArrayLen(100, nums);
        assertEquals(1, result);
    }

    @Test
    public void testMinimalLengthAtBeginning() {
        var solution = new MinimumSizeSubarraySum();
        int[] nums = {10, 2, 3};
        int result = solution.minSubArrayLen(10, nums);
        assertEquals(1, result);
    }

    @Test
    public void testTargetExceedsTotal() {
        var solution = new MinimumSizeSubarraySum();
        int[] nums = {1, 2, 3, 4, 5};
        int result = solution.minSubArrayLen(100, nums);
        assertEquals(0, result);
    }
}
