package com.algorithms.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MergeSortedArraysTest {

    @Test
    public void testBasicMergeA() {
        var merger = new MergeSortedArrays();
        int[] arr1 = {1};
        int[] arr2 = {2};
        int[] expected = {1, 2};
        assertArrayEquals(expected, merger.mergeSortedArrays(arr1, arr2));
    }

    @Test
    public void testBasicMerge() {
        var merger = new MergeSortedArrays();
        int[] arr1 = {1, 3, 5};
        int[] arr2 = {2, 4, 6};
        int[] expected = {1, 2, 3, 4, 5, 6};
        assertArrayEquals(expected, merger.mergeSortedArrays(arr1, arr2));
    }

    @Test
    public void testFirstArrayEmpty() {
        var merger = new MergeSortedArrays();
        int[] arr1 = {};
        int[] arr2 = {1, 2, 3};
        int[] expected = {1, 2, 3};
        assertArrayEquals(expected, merger.mergeSortedArrays(arr1, arr2));
    }

    @Test
    public void testSecondArrayEmpty() {
        var merger = new MergeSortedArrays();
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {};
        int[] expected = {1, 2, 3};
        assertArrayEquals(expected, merger.mergeSortedArrays(arr1, arr2));
    }

    @Test
    public void testBothArraysEmpty() {
        var merger = new MergeSortedArrays();
        int[] arr1 = {};
        int[] arr2 = {};
        int[] expected = {};
        assertArrayEquals(expected, merger.mergeSortedArrays(arr1, arr2));
    }

    @Test
    public void testSingleElementArrays() {
        var merger = new MergeSortedArrays();
        int[] arr1 = {1};
        int[] arr2 = {2};
        int[] expected = {1, 2};
        assertArrayEquals(expected, merger.mergeSortedArrays(arr1, arr2));
    }

    @Test
    public void testDifferentLengths() {
        var merger = new MergeSortedArrays();
        int[] arr1 = {1, 5, 9, 10, 15, 20};
        int[] arr2 = {2, 3, 8, 13};
        int[] expected = {1, 2, 3, 5, 8, 9, 10, 13, 15, 20};
        assertArrayEquals(expected, merger.mergeSortedArrays(arr1, arr2));
    }

    @Test
    public void testOverlappingValues() {
        var merger = new MergeSortedArrays();
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {3, 5, 9};
        int[] expected = {1, 3, 3, 5, 5, 7, 9};
        assertArrayEquals(expected, merger.mergeSortedArrays(arr1, arr2));
    }

    @Test
    public void testNoOverlap() {
        var merger = new MergeSortedArrays();
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};
        int[] expected = {1, 2, 3, 4, 5, 6};
        assertArrayEquals(expected, merger.mergeSortedArrays(arr1, arr2));
    }

    @Test
    public void testFirstArrayAllSmaller() {
        var merger = new MergeSortedArrays();
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {10, 20, 30};
        int[] expected = {1, 2, 3, 10, 20, 30};
        assertArrayEquals(expected, merger.mergeSortedArrays(arr1, arr2));
    }

    @Test
    public void testNegativeNumbers() {
        var merger = new MergeSortedArrays();
        int[] arr1 = {-5, -2, 0, 3};
        int[] arr2 = {-3, -1, 2, 4};
        int[] expected = {-5, -3, -2, -1, 0, 2, 3, 4};
        assertArrayEquals(expected, merger.mergeSortedArrays(arr1, arr2));
    }
}
