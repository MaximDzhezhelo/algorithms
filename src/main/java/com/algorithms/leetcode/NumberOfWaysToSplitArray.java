package com.algorithms.leetcode;

public class NumberOfWaysToSplitArray {

    /**
     * Given a 0-indexed integer array nums of length n, find the number of valid splits.
     *
     * A valid split at index i must satisfy:
     * 1. The sum of the first i + 1 elements is greater than or equal to the sum of the last n - i - 1 elements
     * 2. There is at least one element to the right of i (0 <= i < n - 1)
     *
     * Example 1:
     * Input: nums = [10,4,-8,7]
     * Output: 2
     * Explanation:
     * - Split at index 0: [10] vs [4,-8,7]: 10 >= 3 (valid)
     * - Split at index 1: [10,4] vs [-8,7]: 14 >= -1 (valid)
     * - Split at index 2: [10,4,-8] vs [7]: 6 < 7 (invalid)
     *
     * Example 2:
     * Input: nums = [2,3,1,0]
     * Output: 2
     * Explanation:
     * - Split at index 1: [2,3] vs [1,0]: 5 >= 1 (valid)
     * - Split at index 2: [2,3,1] vs [0]: 6 >= 0 (valid)
     *
     * @param nums the input array
     * @return the number of valid splits
     */
    public int waysToSplitArray(int[] nums) {
        long[] sums = new long[nums.length];
        sums[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            sums[i] = nums[i] + sums[i - 1];
        }

        int res = 0;

        for (int i = 0; i < sums.length - 1; i++) {

            if (sums[i] >= sums[sums.length - 1] - sums[i]) {
                res++;
            }
        }

        return res;
    }

}
