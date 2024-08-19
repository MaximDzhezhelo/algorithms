package com.algorithms.leetcode;

import java.util.Arrays;

/**
 * Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.
 */
public class SquaresOfASortedArray {

    public int[] sortedSquares(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            var value = nums[i];
            nums[i] = value * value;
        }

        Arrays.sort(nums);

        return nums;
    }

}
