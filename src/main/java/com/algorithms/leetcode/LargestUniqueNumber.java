package com.algorithms.leetcode;

import java.util.HashMap;
import java.util.Map;

public class LargestUniqueNumber {

    /**
     * Given an integer array nums, return the largest integer that only occurs once.
     * If no integer occurs once, return -1.
     *
     * Example 1:
     *
     * Input: nums = [5,7,3,9,4,9,8,3,1]
     *
     * Output: 8
     *
     * Explanation: The maximum integer in the array is 9 but it is repeated.
     * The number 8 occurs only once, so it is the answer.
     *
     * Example 2:
     *
     * Input: nums = [9,9,8,8]
     *
     * Output: -1
     *
     * Explanation: There is no number that occurs only once.
     */
    public int largestUniqueNumber(int[] nums) {
        Map<Integer, Integer> counts = new HashMap<>(nums.length);

        for (int num : nums) {
            counts.merge(num, 1, Integer::sum);
        }

        return counts.entrySet()
                .stream()
                .filter(e -> e.getValue() == 1)
                .map(Map.Entry::getKey)
                .max(Integer::compareTo)
                .orElse(-1);
    }

}
