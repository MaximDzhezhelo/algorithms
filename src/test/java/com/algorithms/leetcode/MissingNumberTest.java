package com.algorithms.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MissingNumberTest {

    @Test
    public void testBasicExample1() {
        var solution = new MissingNumber();
        int[] nums = {3, 0, 1};
        int result = solution.missingNumber(nums);
        assertEquals(2, result);
    }

    @Test
    public void testBasicExample2() {
        var solution = new MissingNumber();
        int[] nums = {0, 1};
        int result = solution.missingNumber(nums);
        assertEquals(2, result);
    }

    @Test
    public void testBasicExample3() {
        var solution = new MissingNumber();
        int[] nums = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        int result = solution.missingNumber(nums);
        assertEquals(8, result);
    }

    @Test
    public void testMissingZero() {
        var solution = new MissingNumber();
        int[] nums = {1, 2, 3};
        int result = solution.missingNumber(nums);
        assertEquals(0, result);
    }

    @Test
    public void testMissingLastNumber() {
        var solution = new MissingNumber();
        int[] nums = {0, 1, 2, 3};
        int result = solution.missingNumber(nums);
        assertEquals(4, result);
    }

    @Test
    public void testSingleElementMissingZero() {
        var solution = new MissingNumber();
        int[] nums = {1};
        int result = solution.missingNumber(nums);
        assertEquals(0, result);
    }

    @Test
    public void testSingleElementMissingOne() {
        var solution = new MissingNumber();
        int[] nums = {0};
        int result = solution.missingNumber(nums);
        assertEquals(1, result);
    }

    @Test
    public void testTwoElementsMissingMiddle() {
        var solution = new MissingNumber();
        int[] nums = {0, 2};
        int result = solution.missingNumber(nums);
        assertEquals(1, result);
    }

    @Test
    public void testSequentialMissingFirst() {
        var solution = new MissingNumber();
        int[] nums = {1, 2, 3, 4, 5};
        int result = solution.missingNumber(nums);
        assertEquals(0, result);
    }

    @Test
    public void testSequentialMissingLast() {
        var solution = new MissingNumber();
        int[] nums = {0, 1, 2, 3, 4};
        int result = solution.missingNumber(nums);
        assertEquals(5, result);
    }

    @Test
    public void testUnorderedMissingMiddle() {
        var solution = new MissingNumber();
        int[] nums = {4, 2, 0, 1};
        int result = solution.missingNumber(nums);
        assertEquals(3, result);
    }

    @Test
    public void testLargeArrayMissingMiddle() {
        var solution = new MissingNumber();
        int[] nums = {0, 1, 2, 3, 4, 6, 7, 8, 9, 10};
        int result = solution.missingNumber(nums);
        assertEquals(5, result);
    }

    @Test
    public void testReverseOrderMissingMiddle() {
        var solution = new MissingNumber();
        int[] nums = {5, 4, 2, 1, 0};
        int result = solution.missingNumber(nums);
        assertEquals(3, result);
    }

    @Test
    public void testSmallRangeMissing() {
        var solution = new MissingNumber();
        int[] nums = {0, 1, 3, 4};
        int result = solution.missingNumber(nums);
        assertEquals(2, result);
    }

    @Test
    public void testMediumArray() {
        var solution = new MissingNumber();
        int[] nums = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int result = solution.missingNumber(nums);
        assertEquals(0, result);
    }

    @Test
    public void testRandomOrderSmallArray() {
        var solution = new MissingNumber();
        int[] nums = {2, 0};
        int result = solution.missingNumber(nums);
        assertEquals(1, result);
    }

    @Test
    public void testConsecutiveExceptOne() {
        var solution = new MissingNumber();
        int[] nums = {0, 1, 2, 3, 5, 6, 7};
        int result = solution.missingNumber(nums);
        assertEquals(4, result);
    }

    @Test
    public void testShuffledLargeRange() {
        var solution = new MissingNumber();
        int[] nums = {15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        int result = solution.missingNumber(nums);
        assertEquals(16, result);
    }
}
