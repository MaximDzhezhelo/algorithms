package com.algorithms.leetcode;

public class SubarrayProductLessThanK {

    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k <= 1) {
            return 0;
        }

        int curr = 1, count = 0, left = 0;

        for (int right = 0; right < nums.length; right++) {
            curr *= nums[right];
            while (curr >= k) {
                curr /= nums[left];
                left++;
            }

            count += right - left + 1;
        }

        return count;
    }

}
