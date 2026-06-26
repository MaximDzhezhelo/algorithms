package com.algorithms.leetcode;

public class CountSubarrays {

    /**
     * Given an array of integers, return the total number of contiguous subarrays.
     * A subarray is a contiguous part of an array.
     * For example, given nums = [1, 2, 3], the subarrays are:
     * [1], [2], [3], [1,2], [2,3], [1,2,3] = 6 total subarrays
     */
    public int countSubarrays(int[] nums) {
        int count = 0;

        for (int left = 0; left < nums.length; left++) {
            for (int right = left; right < nums.length; right++) {
                count++;
            }
        }

        return count;
    }

}
