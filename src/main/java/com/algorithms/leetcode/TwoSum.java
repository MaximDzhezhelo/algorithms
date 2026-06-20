package com.algorithms.leetcode;

public class TwoSum {

    /**
     * Given a array of unique integers and a target integer, return true if there exists a pair of numbers that sum to target, false otherwise.
     * This problem is similar to Two Sum. (In Two Sum, the input is not sorted).
     * For example, given nums = [1, 2, 4, 6, 8, 9, 14, 15] and target = 13, return true because 4 + 9 = 13.
     - Time Complexity: O(n²) - correct, due to nested loops
     - Space Complexity: O(1) - you're only using a few variables, no data structures that grow with input size
     */
    public boolean hasTwoSum(int[] nums, int target) {
        int left = 0;

        while (left < nums.length) {
            for (int i = 0; i < nums.length; i++) {
                if (left == i) {
                    continue;
                }
                var valLeft = nums[left];
                var valI = nums[i];
                if ((valLeft + valI) == target) {
                    return true;
                }
            }
            left++;
        }
        return false;
    }

    /**
     * Given a sorted array of unique integers and a target integer, return true if there exists a pair of numbers that sum to target, false otherwise.
     * This problem is similar to Two Sum. (In Two Sum, the input is not sorted).
     * For example, given nums = [1, 2, 4, 6, 8, 9, 14, 15] and target = 13, return true because 4 + 9 = 13.
     *   - Time Complexity: O(n) - massive improvement! Each pointer moves at most once through the array
     *   - Space Complexity: O(1) - only using a few variables
     */
    public boolean hasTwoSumWithSortedArray(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            var valLeft = nums[left];
            var valRight = nums[right];
            var sum = valLeft + valRight;
            if (sum == target) {
                return true;
            } else if (sum > target) {
                right--;
            } else {
                left++;
            }
        }
        return false;
    }

}
