package com.algorithms.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class KRadiusSubarrayAveragesTest {

    @Test
    public void testExample1() {
        var solution = new KRadiusSubarrayAverages();

        int[] nums = {7, 4, 3, 9, 1, 8, 5, 2, 6};
        int k = 3;
        int[] expected = {-1, -1, -1, 5, 4, 4, -1, -1, -1};
        assertArrayEquals(expected, solution.getAverages(nums, k));
    }

    @Test
    public void testExample2() {
        var solution = new KRadiusSubarrayAverages();

        int[] nums = {100000};
        int k = 0;
        int[] expected = {100000};
        assertArrayEquals(expected, solution.getAverages(nums, k));
    }

    @Test
    public void testExample3() {
        var solution = new KRadiusSubarrayAverages();

        int[] nums = {8};
        int k = 100000;
        int[] expected = {-1};
        assertArrayEquals(expected, solution.getAverages(nums, k));
    }

    @Test
    public void testRadiusZero() {
        var solution = new KRadiusSubarrayAverages();

        int[] nums = {1, 2, 3, 4, 5};
        int k = 0;
        int[] expected = {1, 2, 3, 4, 5};
        assertArrayEquals(expected, solution.getAverages(nums, k));
    }

    @Test
    public void testRadiusOne() {
        var solution = new KRadiusSubarrayAverages();

        int[] nums = {9, 6, 3, 12};
        int k = 1;
        int[] expected = {-1, 6, 7, -1};
        assertArrayEquals(expected, solution.getAverages(nums, k));
    }

    @Test
    public void testRadiusTooLarge() {
        var solution = new KRadiusSubarrayAverages();

        int[] nums = {1, 2, 3};
        int k = 5;
        int[] expected = {-1, -1, -1};
        assertArrayEquals(expected, solution.getAverages(nums, k));
    }

    @Test
    public void testAllElementsSame() {
        var solution = new KRadiusSubarrayAverages();

        int[] nums = {5, 5, 5, 5, 5};
        int k = 1;
        int[] expected = {-1, 5, 5, 5, -1};
        assertArrayEquals(expected, solution.getAverages(nums, k));
    }

    @Test
    public void testMinimumValidRadius() {
        var solution = new KRadiusSubarrayAverages();

        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        int[] expected = {-1, -1, -1, 4, -1, -1, -1};
        assertArrayEquals(expected, solution.getAverages(nums, k));
    }

    @Test
    public void testTwoValidAverages() {
        var solution = new KRadiusSubarrayAverages();

        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8};
        int k = 3;
        int[] expected = {-1, -1, -1, 4, 5, -1, -1, -1};
        assertArrayEquals(expected, solution.getAverages(nums, k));
    }

    @Test
    public void testSmallRadiusLargeArray() {
        var solution = new KRadiusSubarrayAverages();

        int[] nums = {10, 20, 30, 40, 50};
        int k = 2;
        int[] expected = {-1, -1, 30, -1, -1};
        assertArrayEquals(expected, solution.getAverages(nums, k));
    }

    @Test
    public void testIntegerDivisionTruncation() {
        var solution = new KRadiusSubarrayAverages();

        int[] nums = {2, 3, 1, 5, 7};
        int k = 2;
        int[] expected = {-1, -1, 3, -1, -1};
        assertArrayEquals(expected, solution.getAverages(nums, k));
    }

    @Test
    public void testAllNegativeOnes() {
        var solution = new KRadiusSubarrayAverages();

        int[] nums = {1, 2};
        int k = 2;
        int[] expected = {-1, -1};
        assertArrayEquals(expected, solution.getAverages(nums, k));
    }

    @Test
    public void testLargeNumbers() {
        var solution = new KRadiusSubarrayAverages();

        int[] nums = {10000, 20000, 30000, 40000, 50000};
        int k = 1;
        int[] expected = {-1, 20000, 30000, 40000, -1};
        assertArrayEquals(expected, solution.getAverages(nums, k));
    }

    @Test
    public void testExactlyEnoughElements() {
        var solution = new KRadiusSubarrayAverages();

        int[] nums = {1, 2, 3, 4, 5};
        int k = 2;
        int[] expected = {-1, -1, 3, -1, -1};
        assertArrayEquals(expected, solution.getAverages(nums, k));
    }

    @Test
    public void testMultipleValidCenters() {
        var solution = new KRadiusSubarrayAverages();

        int[] nums = {1, 3, 5, 7, 9, 11, 13};
        int k = 2;
        int[] expected = {-1, -1, 5, 7, 9, -1, -1};
        assertArrayEquals(expected, solution.getAverages(nums, k));
    }

    @Test
    public void testSingleValidCenter() {
        var solution = new KRadiusSubarrayAverages();

        int[] nums = {10, 10, 10, 10, 10};
        int k = 2;
        int[] expected = {-1, -1, 10, -1, -1};
        assertArrayEquals(expected, solution.getAverages(nums, k));
    }

    @Test
    public void testLargeRadiusSmallArray() {
        var solution = new KRadiusSubarrayAverages();

        int[] nums = {5, 10};
        int k = 1;
        int[] expected = {-1, -1};
        assertArrayEquals(expected, solution.getAverages(nums, k));
    }

    @Test
    public void testConsecutiveNumbers() {
        var solution = new KRadiusSubarrayAverages();

        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int k = 2;
        int[] expected = {-1, -1, 3, 4, 5, 6, 7, -1, -1};
        assertArrayEquals(expected, solution.getAverages(nums, k));
    }

    @Test
    public void testRadiusEqualsHalfLength() {
        var solution = new KRadiusSubarrayAverages();

        int[] nums = {2, 4, 6, 8, 10};
        int k = 2;
        int[] expected = {-1, -1, 6, -1, -1};
        assertArrayEquals(expected, solution.getAverages(nums, k));
    }

}
