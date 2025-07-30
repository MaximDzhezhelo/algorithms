package com.algorithms.leetcode;

/**
 * Given an integer array nums, an array queries where queries[i] = [x, y] and an integer limit, return a boolean array that represents the answer to each query. A query is true if the sum of the subarray from x to y is less than limit, or false otherwise.
 */
public class PrefixSumSubarraySumLimitChecker {

    public boolean[] answerQueries(int[] nums, int[][] queries, int limit) {
        int[] sumArr = new int[nums.length];
        for (int i = 1; i < nums.length; i++) {
            sumArr[i] = sumArr[i - 1] + nums[i];
        }

        boolean[] ans = new boolean[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int x = queries[i][0], y = queries[i][1];
            int curr = sumArr[y] - sumArr[x] + nums[x];
            ans[i] = curr < limit;
        }
        return ans;
    }

}
