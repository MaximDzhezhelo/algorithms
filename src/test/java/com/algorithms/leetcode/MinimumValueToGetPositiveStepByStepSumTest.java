package com.algorithms.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MinimumValueToGetPositiveStepByStepSumTest {

    @Test
    public void testExample1() {
        var solution = new MinimumValueToGetPositiveStepByStepSum();

        int[] nums = {-3, 2, -3, 4, 2};
        assertEquals(5, solution.minStartValue(nums));
    }

    @Test
    public void testExample2() {
        var solution = new MinimumValueToGetPositiveStepByStepSum();

        int[] nums = {1, 2};
        assertEquals(1, solution.minStartValue(nums));
    }

    @Test
    public void testExample3() {
        var solution = new MinimumValueToGetPositiveStepByStepSum();

        int[] nums = {1, -2, -3};
        assertEquals(5, solution.minStartValue(nums));
    }

    @Test
    public void testAllPositive() {
        var solution = new MinimumValueToGetPositiveStepByStepSum();

        int[] nums = {5, 10, 15, 20};
        assertEquals(1, solution.minStartValue(nums));
    }

    @Test
    public void testAllNegative() {
        var solution = new MinimumValueToGetPositiveStepByStepSum();

        int[] nums = {-5, -10, -3};
        assertEquals(19, solution.minStartValue(nums));
    }

    @Test
    public void testSinglePositive() {
        var solution = new MinimumValueToGetPositiveStepByStepSum();

        int[] nums = {100};
        assertEquals(1, solution.minStartValue(nums));
    }

    @Test
    public void testSingleNegative() {
        var solution = new MinimumValueToGetPositiveStepByStepSum();

        int[] nums = {-10};
        assertEquals(11, solution.minStartValue(nums));
    }

    @Test
    public void testSingleZero() {
        var solution = new MinimumValueToGetPositiveStepByStepSum();

        int[] nums = {0};
        assertEquals(1, solution.minStartValue(nums));
    }

    @Test
    public void testNegativeThenPositive() {
        var solution = new MinimumValueToGetPositiveStepByStepSum();

        int[] nums = {-10, 20, -5, 30};
        assertEquals(11, solution.minStartValue(nums));
    }

    @Test
    public void testPositiveThenNegative() {
        var solution = new MinimumValueToGetPositiveStepByStepSum();

        int[] nums = {10, -20, 5};
        assertEquals(11, solution.minStartValue(nums));
    }

    @Test
    public void testZeroSum() {
        var solution = new MinimumValueToGetPositiveStepByStepSum();

        int[] nums = {5, -5};
        assertEquals(1, solution.minStartValue(nums));
    }

    @Test
    public void testDeepNegative() {
        var solution = new MinimumValueToGetPositiveStepByStepSum();

        int[] nums = {-100, 50, -50, 100};
        assertEquals(101, solution.minStartValue(nums));
    }

    @Test
    public void testMultipleZeros() {
        var solution = new MinimumValueToGetPositiveStepByStepSum();

        int[] nums = {0, 0, 0, 0};
        assertEquals(1, solution.minStartValue(nums));
    }

    @Test
    public void testNegativeFollowedByRecovery() {
        var solution = new MinimumValueToGetPositiveStepByStepSum();

        int[] nums = {-5, 1, 1, 1, 1, 1};
        assertEquals(6, solution.minStartValue(nums));
    }

    @Test
    public void testMinimumAtBeginning() {
        var solution = new MinimumValueToGetPositiveStepByStepSum();

        int[] nums = {-10, 1, 2, 3};
        assertEquals(11, solution.minStartValue(nums));
    }

    @Test
    public void testMinimumInMiddle() {
        var solution = new MinimumValueToGetPositiveStepByStepSum();

        int[] nums = {1, -5, 3};
        assertEquals(5, solution.minStartValue(nums));
    }

}
