package com.algorithms.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SubarraySumEqualsKTest {

    @Test
    public void testBasicExample1() {
        var solution = new SubarraySumEqualsK();
        int[] nums = {1, 1, 1};
        int result = solution.subarraySum(nums, 2);
        assertEquals(2, result);
    }

    @Test
    public void testBasicExample2() {
        var solution = new SubarraySumEqualsK();
        int[] nums = {1, 2, 3};
        int result = solution.subarraySum(nums, 3);
        assertEquals(2, result);
    }

    @Test
    public void testSingleElement() {
        var solution = new SubarraySumEqualsK();
        int[] nums = {5};
        int result = solution.subarraySum(nums, 5);
        assertEquals(1, result);
    }

    @Test
    public void testSingleElementNoMatch() {
        var solution = new SubarraySumEqualsK();
        int[] nums = {5};
        int result = solution.subarraySum(nums, 3);
        assertEquals(0, result);
    }

    @Test
    public void testNoSubarrays() {
        var solution = new SubarraySumEqualsK();
        int[] nums = {1, 2, 3};
        int result = solution.subarraySum(nums, 10);
        assertEquals(0, result);
    }

    @Test
    public void testAllNegativeNumbers() {
        var solution = new SubarraySumEqualsK();
        int[] nums = {-1, -2, -3};
        int result = solution.subarraySum(nums, -3);
        assertEquals(2, result);
    }

    @Test
    public void testMixedPositiveNegative() {
        var solution = new SubarraySumEqualsK();
        int[] nums = {1, -1, 0};
        int result = solution.subarraySum(nums, 0);
        assertEquals(3, result);
    }

    @Test
    public void testZeroSum() {
        var solution = new SubarraySumEqualsK();
        int[] nums = {0, 0, 0};
        int result = solution.subarraySum(nums, 0);
        assertEquals(6, result);
    }

    @Test
    public void testEntireArraySum() {
        var solution = new SubarraySumEqualsK();
        int[] nums = {1, 2, 3, 4};
        int result = solution.subarraySum(nums, 10);
        assertEquals(1, result);
    }

    @Test
    public void testMultipleSubarrays() {
        var solution = new SubarraySumEqualsK();
        int[] nums = {1, 2, 1, 2, 1};
        int result = solution.subarraySum(nums, 3);
        assertEquals(4, result);
    }

    @Test
    public void testNegativeTarget() {
        var solution = new SubarraySumEqualsK();
        int[] nums = {1, -1, -2, 3};
        int result = solution.subarraySum(nums, -2);
        assertEquals(2, result);
    }

    @Test
    public void testDuplicateElements() {
        var solution = new SubarraySumEqualsK();
        int[] nums = {2, 2, 2, 2};
        int result = solution.subarraySum(nums, 4);
        assertEquals(3, result);
    }

    @Test
    public void testLargerArray() {
        var solution = new SubarraySumEqualsK();
        int[] nums = {3, 4, 7, 2, -3, 1, 4, 2};
        int result = solution.subarraySum(nums, 7);
        assertEquals(4, result);
    }

    @Test
    public void testTwoElements() {
        var solution = new SubarraySumEqualsK();
        int[] nums = {3, 4};
        int result = solution.subarraySum(nums, 7);
        assertEquals(1, result);
    }

    @Test
    public void testNegativeSumNegativeArray() {
        var solution = new SubarraySumEqualsK();
        int[] nums = {-5, -3, -2};
        int result = solution.subarraySum(nums, -5);
        assertEquals(2, result);
    }

    @Test
    public void testZeroInArray() {
        var solution = new SubarraySumEqualsK();
        int[] nums = {1, 0, 1};
        int result = solution.subarraySum(nums, 1);
        assertEquals(4, result);
    }

    @Test
    public void testLargePositiveK() {
        var solution = new SubarraySumEqualsK();
        int[] nums = {100, 200, 300};
        int result = solution.subarraySum(nums, 600);
        assertEquals(1, result);
    }
}
