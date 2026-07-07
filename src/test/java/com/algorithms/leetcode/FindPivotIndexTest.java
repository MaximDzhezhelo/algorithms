package com.algorithms.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindPivotIndexTest {

    @Test
    public void testBasicExample1() {
        var solution = new FindPivotIndex();
        int[] nums = {1, 7, 3, 6, 5, 6};
        int result = solution.pivotIndex(nums);
        assertEquals(3, result);
    }

    @Test
    public void testBasicExample2() {
        var solution = new FindPivotIndex();
        int[] nums = {1, 2, 3};
        int result = solution.pivotIndex(nums);
        assertEquals(-1, result);
    }

    @Test
    public void testBasicExample3() {
        var solution = new FindPivotIndex();
        int[] nums = {2, 1, -1};
        int result = solution.pivotIndex(nums);
        assertEquals(0, result);
    }

    @Test
    public void testSingleElement() {
        var solution = new FindPivotIndex();
        int[] nums = {1};
        int result = solution.pivotIndex(nums);
        assertEquals(0, result);
    }

    @Test
    public void testTwoElementsNoPivot() {
        var solution = new FindPivotIndex();
        int[] nums = {1, 2};
        int result = solution.pivotIndex(nums);
        assertEquals(-1, result);
    }

    @Test
    public void testPivotAtStart() {
        var solution = new FindPivotIndex();
        int[] nums = {0, 1, -1};
        int result = solution.pivotIndex(nums);
        assertEquals(0, result);
    }

    @Test
    public void testPivotAtEnd() {
        var solution = new FindPivotIndex();
        int[] nums = {1, -1, 0};
        int result = solution.pivotIndex(nums);
        assertEquals(2, result);
    }

    @Test
    public void testAllZeros() {
        var solution = new FindPivotIndex();
        int[] nums = {0, 0, 0, 0};
        int result = solution.pivotIndex(nums);
        assertEquals(0, result);
    }

    @Test
    public void testAllSamePositive() {
        var solution = new FindPivotIndex();
        int[] nums = {5, 5, 5};
        int result = solution.pivotIndex(nums);
        assertEquals(1, result);
    }

    @Test
    public void testAllNegative() {
        var solution = new FindPivotIndex();
        int[] nums = {-1, -1, -1, -1, -1, -1};
        int result = solution.pivotIndex(nums);
        assertEquals(-1, result);
    }

    @Test
    public void testMixedPositiveNegative() {
        var solution = new FindPivotIndex();
        int[] nums = {-1, -1, 0, 1, 1, 0};
        int result = solution.pivotIndex(nums);
        assertEquals(5, result);
    }

    @Test
    public void testLeftmostPivot() {
        var solution = new FindPivotIndex();
        int[] nums = {0, 0, 0};
        int result = solution.pivotIndex(nums);
        assertEquals(0, result);
    }

    @Test
    public void testPivotInMiddle() {
        var solution = new FindPivotIndex();
        int[] nums = {1, 2, 3, 4, 3, 2, 1};
        int result = solution.pivotIndex(nums);
        assertEquals(3, result);
    }

    @Test
    public void testLargePositiveNumbers() {
        var solution = new FindPivotIndex();
        int[] nums = {100, 50, 50, 100};
        int result = solution.pivotIndex(nums);
        assertEquals(-1, result);
    }

    @Test
    public void testLargeNegativeNumbers() {
        var solution = new FindPivotIndex();
        int[] nums = {-100, -50, -50, -100};
        int result = solution.pivotIndex(nums);
        assertEquals(-1, result);
    }

    @Test
    public void testZeroInMiddle() {
        var solution = new FindPivotIndex();
        int[] nums = {1, 2, 0, 2, 1};
        int result = solution.pivotIndex(nums);
        assertEquals(2, result);
    }

    @Test
    public void testSymmetricArray() {
        var solution = new FindPivotIndex();
        int[] nums = {1, 2, 3, 2, 1};
        int result = solution.pivotIndex(nums);
        assertEquals(2, result);
    }

    @Test
    public void testNoPivotLargeArray() {
        var solution = new FindPivotIndex();
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int result = solution.pivotIndex(nums);
        assertEquals(-1, result);
    }

    @Test
    public void testMultiplePotentialPivots() {
        var solution = new FindPivotIndex();
        int[] nums = {0, 1, -1, 0};
        int result = solution.pivotIndex(nums);
        assertEquals(0, result);
    }

    @Test
    public void testPivotWithNegativeBalance() {
        var solution = new FindPivotIndex();
        int[] nums = {-1, 1, 2};
        int result = solution.pivotIndex(nums);
        assertEquals(2, result);
    }
}
