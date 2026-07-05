package com.algorithms.leetcode;

public class MinimumSizeSubarraySum {

    /**
     * Given an array of positive integers nums and a positive integer target,
     * return the minimal length of a contiguous subarray of which the sum is greater than or equal to target.
     * If there is no such subarray, return 0 instead.
     *
     * Input: target = 7, nums = [2,3,1,2,4,3]
     * Output: 2
     * Explanation: The subarray [4,3] has the minimal length under the problem constraint.
     *
     * Input: target = 4, nums = [1,4,4]
     * Output: 1
     *
     * Input: target = 11, nums = [1,1,1,1,1,1,1,1]
     * Output: 0
     *
     * Time Complexity: O(n) where n = nums.length
     * Space Complexity: O(1)
     *
     * @param target the target sum
     * @param nums the array of positive integers
     * @return the minimal length of subarray with sum >= target, or 0 if none exists
     */
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int minLength = Integer.MAX_VALUE;
        int sum = 0;

        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];

            while (sum >= target && left <= right) {
                    minLength = Math.min(minLength, right - left + 1);
                sum -= nums[left];
                left++;
            }
        }

        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
}
