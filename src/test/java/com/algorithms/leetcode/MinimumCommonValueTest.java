package com.algorithms.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MinimumCommonValueTest {

    @Test
    public void testBasicCommonValue() {
        var solution = new MinimumCommonValue();
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {2, 4};
        assertEquals(2, solution.getCommon(nums1, nums2));
    }

    @Test
    public void testMultipleCommonValues() {
        var solution = new MinimumCommonValue();
        int[] nums1 = {1, 2, 3, 6};
        int[] nums2 = {2, 3, 4, 5};
        assertEquals(2, solution.getCommon(nums1, nums2));
    }

    @Test
    public void testNoCommonValue() {
        var solution = new MinimumCommonValue();
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {4, 5, 6};
        assertEquals(-1, solution.getCommon(nums1, nums2));
    }

    @Test
    public void testSingleElementArraysWithCommon() {
        var solution = new MinimumCommonValue();
        int[] nums1 = {5};
        int[] nums2 = {5};
        assertEquals(5, solution.getCommon(nums1, nums2));
    }

    @Test
    public void testSingleElementArraysWithoutCommon() {
        var solution = new MinimumCommonValue();
        int[] nums1 = {3};
        int[] nums2 = {7};
        assertEquals(-1, solution.getCommon(nums1, nums2));
    }

    @Test
    public void testFirstArraySmaller() {
        var solution = new MinimumCommonValue();
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {10, 20, 30, 40, 50};
        assertEquals(-1, solution.getCommon(nums1, nums2));
    }

    @Test
    public void testSecondArraySmaller() {
        var solution = new MinimumCommonValue();
        int[] nums1 = {10, 20, 30, 40, 50};
        int[] nums2 = {1, 2, 3};
        assertEquals(-1, solution.getCommon(nums1, nums2));
    }

    @Test
    public void testCommonAtEnd() {
        var solution = new MinimumCommonValue();
        int[] nums1 = {1, 3, 5, 7, 9};
        int[] nums2 = {2, 4, 6, 8, 9};
        assertEquals(9, solution.getCommon(nums1, nums2));
    }

    @Test
    public void testCommonAtStart() {
        var solution = new MinimumCommonValue();
        int[] nums1 = {1, 5, 10, 15};
        int[] nums2 = {1, 6, 11, 16};
        assertEquals(1, solution.getCommon(nums1, nums2));
    }

    @Test
    public void testIdenticalArrays() {
        var solution = new MinimumCommonValue();
        int[] nums1 = {1, 2, 3, 4, 5};
        int[] nums2 = {1, 2, 3, 4, 5};
        assertEquals(1, solution.getCommon(nums1, nums2));
    }

    @Test
    public void testLargeNumbers() {
        var solution = new MinimumCommonValue();
        int[] nums1 = {100, 200, 300, 400};
        int[] nums2 = {150, 250, 300, 350};
        assertEquals(300, solution.getCommon(nums1, nums2));
    }

    @Test
    public void testDifferentLengths() {
        var solution = new MinimumCommonValue();
        int[] nums1 = {1, 5, 10, 15, 20, 25};
        int[] nums2 = {3, 10};
        assertEquals(10, solution.getCommon(nums1, nums2));
    }
}
