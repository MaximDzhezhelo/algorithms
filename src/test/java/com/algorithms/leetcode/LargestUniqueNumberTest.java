package com.algorithms.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LargestUniqueNumberTest {

    @Test
    public void testExample1() {
        var solution = new LargestUniqueNumber();
        int[] nums = {5, 7, 3, 9, 4, 9, 8, 3, 1};
        int result = solution.largestUniqueNumber(nums);
        assertEquals(8, result);
    }

    @Test
    public void testExample2() {
        var solution = new LargestUniqueNumber();
        int[] nums = {9, 9, 8, 8};
        int result = solution.largestUniqueNumber(nums);
        assertEquals(-1, result);
    }

    @Test
    public void testSingleElement() {
        var solution = new LargestUniqueNumber();
        int[] nums = {5};
        int result = solution.largestUniqueNumber(nums);
        assertEquals(5, result);
    }

    @Test
    public void testAllUnique() {
        var solution = new LargestUniqueNumber();
        int[] nums = {1, 2, 3, 4, 5};
        int result = solution.largestUniqueNumber(nums);
        assertEquals(5, result);
    }

    @Test
    public void testAllDuplicates() {
        var solution = new LargestUniqueNumber();
        int[] nums = {2, 2, 3, 3, 4, 4};
        int result = solution.largestUniqueNumber(nums);
        assertEquals(-1, result);
    }

    @Test
    public void testLargestIsNotUnique() {
        var solution = new LargestUniqueNumber();
        int[] nums = {10, 10, 5, 7};
        int result = solution.largestUniqueNumber(nums);
        assertEquals(7, result);
    }

    @Test
    public void testWithZero() {
        var solution = new LargestUniqueNumber();
        int[] nums = {0, 1, 1};
        int result = solution.largestUniqueNumber(nums);
        assertEquals(0, result);
    }

    @Test
    public void testNegativeNumbers() {
        var solution = new LargestUniqueNumber();
        int[] nums = {-1, -2, -3, -2};
        int result = solution.largestUniqueNumber(nums);
        assertEquals(-1, result);
    }

    @Test
    public void testMixedUniqueAndDuplicates() {
        var solution = new LargestUniqueNumber();
        int[] nums = {1, 2, 2, 3, 3, 4};
        int result = solution.largestUniqueNumber(nums);
        assertEquals(4, result);
    }

    @Test
    public void testUniqueAtBeginning() {
        var solution = new LargestUniqueNumber();
        int[] nums = {7, 5, 5, 4, 4};
        int result = solution.largestUniqueNumber(nums);
        assertEquals(7, result);
    }

}
