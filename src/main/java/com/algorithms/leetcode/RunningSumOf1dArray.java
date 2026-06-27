package com.algorithms.leetcode;

public class RunningSumOf1dArray {

    /**
     * Given an array nums, return the running sum of the array.
     * We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
     *
     * Example 1:
     * Input: nums = [1,2,3,4]
     * Output: [1,3,6,10]
     * Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
     *
     * Example 2:
     * Input: nums = [1,1,1,1,1]
     * Output: [1,2,3,4,5]
     * Explanation: Running sum is obtained as follows: [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1].
     *
     * Example 3:
     * Input: nums = [3,1,2,10,1]
     * Output: [3,4,6,16,17]
     *
     * @param nums the input array
     * @return the running sum array
     */
    public int[] runningSum(int[] nums) {
        int[] res = nums.clone();
        for (int i = 1; i < nums.length; i++) {
            res[i] = nums[i] + res[i - 1];
        }
        return res;
    }

}
