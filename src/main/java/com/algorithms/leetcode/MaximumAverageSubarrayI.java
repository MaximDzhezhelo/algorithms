package com.algorithms.leetcode;

public class MaximumAverageSubarrayI {

    /**
     * Given an integer array nums and an integer k, find a contiguous subarray
     * whose length is equal to k that has the maximum average value and return this value.
     * Example: nums = [1,12,-5,-6,50,3], k = 4
     * Output: 12.75000
     * Explanation: Maximum average is (12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75
     */
    public double findMaxAverage(int[] nums, int k) {

        double sum = 0;
        for (int right = 0; right < k; right++) {
            sum += nums[right];
        }

        double average = sum / k;

        int left = 0;
        for (int right = k; right < nums.length; right++) {
            sum += nums[right];
            sum -= nums[left];
            left++;

            double tempAverage = sum / k;
            if (tempAverage > average) {
                average = tempAverage;
            }
        }

        return average;
    }

}
