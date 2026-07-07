package com.algorithms.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NumArrayTest {

    @Test
    public void testBasicExample() {
        int[] nums = {-2, 0, 3, -5, 2, -1};
        NumArray numArray = new NumArray(nums);
        assertEquals(1, numArray.sumRange(0, 2));
        assertEquals(-1, numArray.sumRange(2, 5));
        assertEquals(-3, numArray.sumRange(0, 5));
    }

    @Test
    public void testSingleElement() {
        int[] nums = {5};
        NumArray numArray = new NumArray(nums);
        assertEquals(5, numArray.sumRange(0, 0));
    }

    @Test
    public void testAllPositive() {
        int[] nums = {1, 2, 3, 4, 5};
        NumArray numArray = new NumArray(nums);
        assertEquals(15, numArray.sumRange(0, 4));
        assertEquals(9, numArray.sumRange(1, 3));
        assertEquals(3, numArray.sumRange(2, 2));
    }

    @Test
    public void testAllNegative() {
        int[] nums = {-1, -2, -3, -4, -5};
        NumArray numArray = new NumArray(nums);
        assertEquals(-15, numArray.sumRange(0, 4));
        assertEquals(-9, numArray.sumRange(1, 3));
        assertEquals(-3, numArray.sumRange(2, 2));
    }

    @Test
    public void testMixedValues() {
        int[] nums = {-5, 10, -3, 7, -8};
        NumArray numArray = new NumArray(nums);
        assertEquals(5, numArray.sumRange(0, 1));
        assertEquals(14, numArray.sumRange(1, 3));
        assertEquals(1, numArray.sumRange(0, 4));
    }

    @Test
    public void testAllZeros() {
        int[] nums = {0, 0, 0, 0};
        NumArray numArray = new NumArray(nums);
        assertEquals(0, numArray.sumRange(0, 3));
        assertEquals(0, numArray.sumRange(1, 2));
    }

    @Test
    public void testTwoElements() {
        int[] nums = {3, 7};
        NumArray numArray = new NumArray(nums);
        assertEquals(3, numArray.sumRange(0, 0));
        assertEquals(7, numArray.sumRange(1, 1));
        assertEquals(10, numArray.sumRange(0, 1));
    }

    @Test
    public void testFirstElement() {
        int[] nums = {1, 2, 3, 4, 5};
        NumArray numArray = new NumArray(nums);
        assertEquals(1, numArray.sumRange(0, 0));
    }

    @Test
    public void testLastElement() {
        int[] nums = {1, 2, 3, 4, 5};
        NumArray numArray = new NumArray(nums);
        assertEquals(5, numArray.sumRange(4, 4));
    }

    @Test
    public void testMiddleRange() {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        NumArray numArray = new NumArray(nums);
        assertEquals(12, numArray.sumRange(2, 4));
    }

    @Test
    public void testMultipleQueries() {
        int[] nums = {-2, 0, 3, -5, 2, -1};
        NumArray numArray = new NumArray(nums);
        assertEquals(1, numArray.sumRange(0, 2));
        assertEquals(-1, numArray.sumRange(2, 5));
        assertEquals(-2, numArray.sumRange(0, 0));
        assertEquals(-1, numArray.sumRange(5, 5));
        assertEquals(3, numArray.sumRange(2, 2));
    }

    @Test
    public void testLargePositiveNumbers() {
        int[] nums = {100, 200, 300, 400, 500};
        NumArray numArray = new NumArray(nums);
        assertEquals(1500, numArray.sumRange(0, 4));
        assertEquals(900, numArray.sumRange(1, 3));
    }

    @Test
    public void testLargeNegativeNumbers() {
        int[] nums = {-100, -200, -300, -400, -500};
        NumArray numArray = new NumArray(nums);
        assertEquals(-1500, numArray.sumRange(0, 4));
        assertEquals(-900, numArray.sumRange(1, 3));
    }

    @Test
    public void testConsecutivePairs() {
        int[] nums = {1, 2, 3, 4, 5};
        NumArray numArray = new NumArray(nums);
        assertEquals(3, numArray.sumRange(0, 1));
        assertEquals(5, numArray.sumRange(1, 2));
        assertEquals(7, numArray.sumRange(2, 3));
        assertEquals(9, numArray.sumRange(3, 4));
    }

    @Test
    public void testOverlappingRanges() {
        int[] nums = {5, -3, 8, 2, -1};
        NumArray numArray = new NumArray(nums);
        assertEquals(2, numArray.sumRange(0, 1));
        assertEquals(10, numArray.sumRange(0, 2));
        assertEquals(16, numArray.sumRange(0, 4));
        assertEquals(5, numArray.sumRange(1, 2));
    }

    @Test
    public void testAlternatingPositiveNegative() {
        int[] nums = {1, -1, 2, -2, 3, -3};
        NumArray numArray = new NumArray(nums);
        assertEquals(0, numArray.sumRange(0, 1));
        assertEquals(0, numArray.sumRange(2, 3));
        assertEquals(0, numArray.sumRange(4, 5));
        assertEquals(0, numArray.sumRange(0, 5));
    }

    @Test
    public void testLargeRange() {
        int[] nums = new int[100];
        for (int i = 0; i < 100; i++) {
            nums[i] = i + 1;
        }
        NumArray numArray = new NumArray(nums);
        assertEquals(5050, numArray.sumRange(0, 99));
        assertEquals(55, numArray.sumRange(0, 9));
    }

    @Test
    public void testRangeWithZeros() {
        int[] nums = {5, 0, 0, 0, 10};
        NumArray numArray = new NumArray(nums);
        assertEquals(5, numArray.sumRange(0, 3));
        assertEquals(10, numArray.sumRange(1, 4));
        assertEquals(15, numArray.sumRange(0, 4));
    }
}
