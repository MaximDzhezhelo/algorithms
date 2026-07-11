package com.algorithms.leetcode;

import java.util.HashMap;
import java.util.Map;

public class SubarraySumEqualsK {

    /**
     * Given an array of integers nums and an integer k, return the total number of
     * subarrays whose sum equals to k.
     *
     * A subarray is a contiguous non-empty sequence of elements within an array.
     *
     * Input: nums = [1,1,1], k = 2
     * Output: 2
     * Explanation: There are two subarrays with sum 2: [1,1] and [1,1]
     *
     * Input: nums = [1,2,3], k = 3
     * Output: 2
     * Explanation: There are two subarrays with sum 3: [1,2] and [3]
     *
     * Constraints:
     * - 1 <= nums.length <= 2 * 10^4
     * - -1000 <= nums[i] <= 1000
     * - -10^7 <= k <= 10^7
     *
     * Time Complexity: O(n) where n = nums.length
     * Space Complexity: O(n)
     *
     * @param nums the array of integers
     * @param k the target sum
     * @return the total number of subarrays whose sum equals k
     */
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> counts = new HashMap<>();
        counts.put(0, 1);

        int ans = 0;
        int curr = 0;

        for (int num: nums) {
            curr += num;
            ans += counts.getOrDefault(curr - k, 0);
            counts.put(curr, counts.getOrDefault(curr, 0) + 1);
        }

        return ans;
    }
}
