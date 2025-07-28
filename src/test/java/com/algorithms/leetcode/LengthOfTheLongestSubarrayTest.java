package com.algorithms.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LengthOfTheLongestSubarrayTest {

    @Test
    public void find() {
        LengthOfTheLongestSubarray longestSubarray = new LengthOfTheLongestSubarray();

        int[] nums = {3, 1, 2, 7, 4, 2, 1, 1, 5};
        assertEquals(4, longestSubarray.lengthOfTheLongestSubarray(nums, 8));

//        int[] nums2 = {5};
//        assertEquals(5.00000, maxAverage.findMaxAverageMy(nums2, 1), 4);
    }

}