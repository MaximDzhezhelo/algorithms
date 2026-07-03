package com.algorithms.leetcode;

public class MoveZeroes {

    /**
     * Given an integer array nums, move all 0's to the end of it while maintaining
     * the relative order of the non-zero elements.
     * Must be done in-place without making a copy of the array.
     *
     * Input: nums = [0,1,0,3,12]
     * Output: [1,3,12,0,0]
     *
     * Input: nums = [1,0,1]
     * Output: [1,1,0]
     *
     * Input: nums = [0]
     * Output: [0]
     *
     * Time Complexity: O(n) where n = nums.length
     * Space Complexity: O(1)
     *
     * @param nums integer array to modify in-place
     */
    public void moveZeroes(int[] nums) {
        int left = 0;

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] != 0) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
            }
        }
    }
}
