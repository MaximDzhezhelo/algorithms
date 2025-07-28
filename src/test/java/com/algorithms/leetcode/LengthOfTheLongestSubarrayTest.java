package com.algorithms.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LengthOfTheLongestSubarrayTest {

    @Test
    public void findBySum() {
        var longestSubarray = new LengthOfTheLongestSubarray();

        int[] nums = {3, 1, 2, 7, 4, 2, 1, 1, 5};
        assertEquals(4, longestSubarray.bySum(nums, 8));
    }

    @Test
    public void findByContainedSymbol() {
        var longestSubarray = new LengthOfTheLongestSubarray();

        var arr = "1101100111";
        assertEquals(5, longestSubarray.byContainedSymbol(arr, 1));
    }

}