package com.algorithms.leetcode;

/**
 * Given a binary array nums and an integer k, return the maximum number of consecutive 1's in the array if you can flip at most k 0's.
 */
public class LongestOnes {

    public int longestOnes(int[] nums, int k) {

        int left = 0;
        int skiped = 0;
        int res = 0;
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0) {
                skiped++;
            }

            while (skiped > k && skiped != 0) {
                if (nums[left] == 0) {
                    skiped--;
                }
                left++;
            }

            res = Math.max(res, (right - left) + 1);
        }

        return res;
    }
}
