package com.algorithms.leetcode;

import java.util.HashSet;

public class CountingElements {

    /**
     * Given an integer array arr, count how many elements x there are, such that x + 1 is also in arr.
     * If there are duplicates in arr, count them separately.
     *
     * Input: arr = [1,2,3]
     * Output: 2
     * Explanation: 1 and 2 are counted cause 2 and 3 are in arr.
     *
     * Input: arr = [1,1,3,3,5,5,7,7]
     * Output: 0
     * Explanation: No numbers are counted, cause there is no 2, 4, 6, or 8 in arr.
     *
     * Input: arr = [1,3,2,3,5,0]
     * Output: 3
     * Explanation: 0 and 1 are counted cause 1 and 2 are in arr.
     * 2 is counted cause 3 is in arr.
     *
     * Input: arr = [1,1,2,2]
     * Output: 2
     * Explanation: Two 1s are counted because 2 is in arr.
     *
     * Constraints:
     * - 1 <= arr.length <= 1000
     * - 0 <= arr[i] <= 1000
     *
     * Time Complexity: O(n) where n = arr.length
     * Space Complexity: O(n)
     *
     * @param arr the integer array
     * @return the count of elements x where x + 1 is also in arr
     */
    public int countElements(int[] arr) {
        var numbers = new HashSet<Integer>(arr.length);
        for (int i : arr) {
            numbers.add(i);
        }

        int count = 0;
        for (int j : arr) {
            if (numbers.contains(j + 1)) {
                count++;
            }
        }

        return count;
    }
}
