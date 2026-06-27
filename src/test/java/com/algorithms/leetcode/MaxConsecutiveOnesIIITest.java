package com.algorithms.leetcode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MaxConsecutiveOnesIIITest {

    private final MaxConsecutiveOnesIII solution = new MaxConsecutiveOnesIII();

    @Test
    void testExample1() {
        int[] nums = {1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0};
        int k = 2;
        assertEquals(6, solution.longestOnes(nums, k));
    }

    @Test
    void testExample2() {
        int[] nums = {0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1};
        int k = 3;
        assertEquals(10, solution.longestOnes(nums, k));
    }

    @Test
    void testNoFlipsAllowed() {
        int[] nums = {1, 1, 0, 1, 1, 1, 0, 1, 1};
        int k = 0;
        assertEquals(3, solution.longestOnes(nums, k));
    }

    @Test
    void testAllOnes() {
        int[] nums = {1, 1, 1, 1, 1};
        int k = 2;
        assertEquals(5, solution.longestOnes(nums, k));
    }

    @Test
    void testAllZeros() {
        int[] nums = {0, 0, 0, 0};
        int k = 2;
        assertEquals(2, solution.longestOnes(nums, k));
    }

    @Test
    void testAllZerosWithKEqualsLength() {
        int[] nums = {0, 0, 0, 0};
        int k = 4;
        assertEquals(4, solution.longestOnes(nums, k));
    }

    @Test
    void testKLargerThanZerosCount() {
        int[] nums = {0, 1, 0, 1, 0};
        int k = 5;
        assertEquals(5, solution.longestOnes(nums, k));
    }

    @Test
    void testSingleElementOne() {
        int[] nums = {1};
        int k = 0;
        assertEquals(1, solution.longestOnes(nums, k));
    }

    @Test
    void testSingleElementZero() {
        int[] nums = {0};
        int k = 1;
        assertEquals(1, solution.longestOnes(nums, k));
    }

    @Test
    void testSingleElementZeroNoFlips() {
        int[] nums = {0};
        int k = 0;
        assertEquals(0, solution.longestOnes(nums, k));
    }

    @Test
    void testAlternating() {
        int[] nums = {1, 0, 1, 0, 1};
        int k = 1;
        assertEquals(3, solution.longestOnes(nums, k));
    }

    @Test
    void testZerosAtStart() {
        int[] nums = {0, 0, 0, 1, 1, 1, 1};
        int k = 2;
        assertEquals(6, solution.longestOnes(nums, k));
    }

    @Test
    void testZerosAtEnd() {
        int[] nums = {1, 1, 1, 1, 0, 0, 0};
        int k = 2;
        assertEquals(6, solution.longestOnes(nums, k));
    }
}