package com.algorithms.leetcode;

import java.util.ArrayList;
import java.util.Collections;

/**
 * You are given an integer array nums consisting of n elements, and an integer k.
 * <p>
 * Find a contiguous subarray whose length is equal to k that has the maximum average value and return this value. Any answer with a calculation error less than 10-5 will be accepted.
 */
public class MaxAverage {

    /**
     * The time complexity of the findMaxAverage method is O(n×k). the space complexity is O(n)
     *
     * @param nums
     * @param k
     * @return
     */
    public double findMaxAverageMy(int[] nums, int k) {
        int left = 0;
        var arr = new ArrayList<Double>();
        int sum = 0;
        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];
            if (left + right >= k - 1) {
                arr.add((double) (sum / k));
                sum -= nums[left];
                left++;
            }
        }
        return Collections.max(arr);
    }

    /**
     * to determine the sum of elements from the index i+1 to the index i+k+1, all we need to do is to subtract the element nums[i] from x and to add the element nums[i+k+1] to x. We can carry out our process based on this idea and determine the maximum possible average.
     * <p>
     * Time complexity : O(n). We iterate over the given nums array of length n once only.
     * <p>
     * Space complexity : O(1). Constant extra space is used
     *
     * @param nums
     * @param k
     * @return
     */
    public double findMaxAverage(int[] nums, int k) {
        double sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        double res = sum;
        for (int i = k; i < nums.length; i++) {
            sum += nums[i] - nums[i - k];
            res = Math.max(res, sum);
        }
        return res / k;
    }

}
