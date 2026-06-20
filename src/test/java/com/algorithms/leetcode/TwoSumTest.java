package com.algorithms.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class TwoSumTest {

    @Test
    public void testHasTwoSum() {
        var ts = new TwoSum();
        int[] nums1 = {2, 7, 11, 15};
        assertFalse(ts.hasTwoSum(nums1, 29));
        assertTrue(ts.hasTwoSum(nums1, 9));
        assertTrue(ts.hasTwoSum(nums1, 17));
    }

    @Test
    public void testHasTwoSumWithSortedArray() {
        var ts = new TwoSum();
        int[] nums1 = {2, 7, 11, 15};
        assertFalse(ts.hasTwoSumWithSortedArray(nums1, 29));
        assertTrue(ts.hasTwoSumWithSortedArray(nums1, 9));
        assertTrue(ts.hasTwoSumWithSortedArray(nums1, 17));
    }

}