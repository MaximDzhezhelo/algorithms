package com.algorithms.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SubarrayProductLessThanKTest {

    @Test
    public void testIsSubsequence() {
        var subarrayProductLessThanK = new SubarrayProductLessThanK();
        int[] nums = {10, 5, 2, 6};
        int k = 100;
        assertEquals(8, subarrayProductLessThanK.numSubarrayProductLessThanK(nums, k));
    }

}