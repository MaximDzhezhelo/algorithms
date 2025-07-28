package com.algorithms.leetcode;

/**
 * Given an array of positive integers nums and an integer k, find the length of the longest subarray whose sum is less than or equal to k.
 */
public class LengthOfTheLongestSubarray {

    public int lengthOfTheLongestSubarray(int[] nums, int k) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        if (k == 0) {
            return 0;
        }

        int leftB = 0;
        int curr = 0; // curr is the current sum of the window
        int answer = 0;

        for (int rightB = 0; rightB < nums.length; rightB++) {
            curr += nums[rightB];
            while (curr > k) {
                curr -= nums[leftB];
                leftB++;
            }
            answer = Math.max(answer, rightB - leftB + 1);
        }

        return answer;
    }

}
