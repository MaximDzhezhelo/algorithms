package com.algorithms.leetcode;

public class MinimumCommonValue {

    /**
     * Given two integer arrays nums1 and nums2, sorted in non-decreasing order,
     * return the minimum integer common to both arrays.
     * If there is no common integer amongst nums1 and nums2, return -1.
     *
     * Input: nums1 = [1,2,3], nums2 = [2,4]
     * Output: 2
     * Explanation: The smallest element common to both arrays is 2, so we return 2.
     *
     * Input: nums1 = [1,2,3,6], nums2 = [2,3,4,5]
     * Output: 2
     * Explanation: There are two common elements in the array 2 and 3 out of which 2 is the smallest, so 2 is returned.
     *
     * Time Complexity: O(n + m) where n = nums1.length, m = nums2.length
     * Space Complexity: O(1)
     *
     * @param nums1 first sorted array in non-decreasing order
     * @param nums2 second sorted array in non-decreasing order
     * @return minimum common integer or -1 if no common integer exists
     */
    public int getCommon(int[] nums1, int[] nums2) {
        int first = 0;
        int second = 0;

        while (true) {
            if (first >= nums1.length || second >= nums2.length) {
                return -1;
            }
            if (nums1[first] == nums2[second]) {
                return nums1[first];
            } else if (nums1[first] > nums2[second]) {
                second++;
            } else {
                first++;
            }
        }
    }
}
