package com.algorithms.leetcode;

public class NumArray {

    private final int[] nums;
    private final int[] sums;

    /**
     * Given an integer array nums, handle multiple queries of the following type:
     * Calculate the sum of the elements of nums between indices left and right inclusive
     * where left <= right.
     *
     * Implement the NumArray class:
     * - NumArray(int[] nums) Initializes the object with the integer array nums.
     * - int sumRange(int left, int right) Returns the sum of the elements of nums between
     *   indices left and right inclusive (i.e. nums[left] + nums[left + 1] + ... + nums[right]).
     *
     * Example:
     * NumArray numArray = new NumArray([-2, 0, 3, -5, 2, -1]);
     * numArray.sumRange(0, 2); // return (-2) + 0 + 3 = 1
     * numArray.sumRange(2, 5); // return 3 + (-5) + 2 + (-1) = -1
     * numArray.sumRange(0, 5); // return (-2) + 0 + 3 + (-5) + 2 + (-1) = -3
     *
     * Constraints:
     * - 1 <= nums.length <= 10^4
     * - -10^5 <= nums[i] <= 10^5
     * - 0 <= left <= right < nums.length
     * - At most 10^4 calls will be made to sumRange
     *
     * Time Complexity:
     * - Constructor: O(n) where n = nums.length
     * - sumRange: O(1)
     *
     * Space Complexity: O(n)
     *
     * @param nums the integer array
     */
    public NumArray(int[] nums) {
        this.nums = nums;
        sums = new int[nums.length];
        sums[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            sums[i] = nums[i] + sums[i - 1];
        }
    }

    /**
     * Returns the sum of the elements between indices left and right inclusive.
     *
     * @param left the left index (inclusive)
     * @param right the right index (inclusive)
     * @return the sum of elements from left to right
     */
    public int sumRange(int left, int right) {
        return sums[right] - sums[left] + nums[left];
    }
}
