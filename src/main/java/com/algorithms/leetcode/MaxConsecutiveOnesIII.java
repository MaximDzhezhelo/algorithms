package com.algorithms.leetcode;

public class MaxConsecutiveOnesIII {

    /**
     * Given a binary array nums and an integer k, return the maximum number of consecutive 1's in the array if you can flip at most k 0's.
     * Input: nums = [1,1,1,0,0,0,1,1,1,1,0], k = 2
     * Output: 6
     * Explanation: [1,1,1,0,0,1,1,1,1,1,1]
     * Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.
     */
    public int longestOnes(int[] nums, int k) {
        int left = 0;
        int zeros = 0;
        int result = 0;

        for (int right = 0; right < nums.length; right++) {
            if (0 == nums[right]) {
                zeros++;
            }


            while (zeros > k) {
                if (0 == nums[left]) {
                    zeros--;
                }
                left++;
            }


            result = Math.max(result, right - left + 1);
        }

        return result;
    }

}
