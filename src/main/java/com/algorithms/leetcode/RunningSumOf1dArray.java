package com.algorithms.leetcode;

public class RunningSumOf1dArray {

    /**
     * Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
     *
     * @param nums
     * @return
     */
    public int[] runningSum(int[] nums) {
        if (nums.length == 0) {
            return nums;
        }
        int[] res = new int[nums.length];
        res[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            res[i] = res[i - 1] + nums[i];
        }

        return res;
    }

}
