package com.algorithms.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaxAverageTest {

    @Test
    public void findMaxAverageMy() {
        MaxAverage maxAverage = new MaxAverage();

        int[] nums = {1, 12, -5, -6, 50, 3};
        assertEquals(12.75000, maxAverage.findMaxAverageMy(nums, 4), 4);

        int[] nums2 = {5};
        assertEquals(5.00000, maxAverage.findMaxAverageMy(nums2, 1), 4);
    }
}