package com.algorithms.leetcode;

public class SubarraySumQueries {

    /**
     * Given an integer array nums, an array queries where queries[i] = [x, y]
     * and an integer limit, return a boolean array that represents the answer to each query.
     * A query is true if the sum of the subarray from x to y is less than limit, or false otherwise.
     * For example, given nums = [1, 6, 3, 2, 7, 2], queries = [[0, 3], [2, 5], [2, 4]],
     * and limit = 13, the answer is [true, false, true].
     * For each query, the subarray sums are [12, 14, 12].
     *
     * @param nums the input array
     * @param queries array of queries where each query is [x, y] representing subarray indices
     * @param limit the threshold for comparison
     * @return boolean array where each element is true if sum of subarray[x..y] < limit
     */
    public boolean[] answerQueries(int[] nums, int[][] queries, int limit) {
        int[] sums = nums.clone();

        for (int i = 1; i < nums.length; i++) {
            sums[i] = nums[i] + sums[i - 1];
        }

        boolean[] results = new boolean[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int[] row = queries[i];
            results[i] = (sums[row[1]] - sums[row[0]] + nums[row[0]]) < limit;
        }

        return results;
    }

}
