package com.algorithms.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CountSubarraysTest {

    @Test
    public void testCountSubarrays() {
        var cs = new CountSubarrays();

        int[] nums1 = {1, 2, 3};
        assertEquals(6, cs.countSubarrays(nums1));

        int[] nums2 = {1};
        assertEquals(1, cs.countSubarrays(nums2));

        int[] nums3 = {1, 2, 3, 4};
        assertEquals(10, cs.countSubarrays(nums3));

        int[] nums4 = {};
        assertEquals(0, cs.countSubarrays(nums4));
    }

}
