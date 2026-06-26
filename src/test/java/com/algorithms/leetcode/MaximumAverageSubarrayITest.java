package com.algorithms.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaximumAverageSubarrayITest {

    @Test
    public void testFindMaxAverage() {
        var solution = new MaximumAverageSubarrayI();

        int[] nums1 = {1, 12, -5, -6, 50, 3};
        assertEquals(12.75, solution.findMaxAverage(nums1, 4), 0.00001);

        int[] nums2 = {5};
        assertEquals(5.0, solution.findMaxAverage(nums2, 1), 0.00001);

        int[] nums3 = {0, 4, 0, 3, 2};
        assertEquals(4.0, solution.findMaxAverage(nums3, 1), 0.00001);

        int[] nums4 = {-1};
        assertEquals(-1.0, solution.findMaxAverage(nums4, 1), 0.00001);

        int[] nums5 = {1, 2, 3, 4, 5};
        assertEquals(4.5, solution.findMaxAverage(nums5, 2), 0.00001);
    }

}
