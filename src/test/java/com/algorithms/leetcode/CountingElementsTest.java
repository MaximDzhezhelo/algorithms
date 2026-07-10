package com.algorithms.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CountingElementsTest {

    @Test
    public void testBasicExample1() {
        var solution = new CountingElements();
        int[] arr = {1, 2, 3};
        int result = solution.countElements(arr);
        assertEquals(2, result);
    }

    @Test
    public void testBasicExample2() {
        var solution = new CountingElements();
        int[] arr = {1, 1, 3, 3, 5, 5, 7, 7};
        int result = solution.countElements(arr);
        assertEquals(0, result);
    }

    @Test
    public void testBasicExample3() {
        var solution = new CountingElements();
        int[] arr = {1, 3, 2, 3, 5, 0};
        int result = solution.countElements(arr);
        assertEquals(3, result);
    }

    @Test
    public void testBasicExample4() {
        var solution = new CountingElements();
        int[] arr = {1, 1, 2, 2};
        int result = solution.countElements(arr);
        assertEquals(2, result);
    }

    @Test
    public void testSingleElement() {
        var solution = new CountingElements();
        int[] arr = {1};
        int result = solution.countElements(arr);
        assertEquals(0, result);
    }

    @Test
    public void testTwoConsecutive() {
        var solution = new CountingElements();
        int[] arr = {1, 2};
        int result = solution.countElements(arr);
        assertEquals(1, result);
    }

    @Test
    public void testTwoNonConsecutive() {
        var solution = new CountingElements();
        int[] arr = {1, 3};
        int result = solution.countElements(arr);
        assertEquals(0, result);
    }

    @Test
    public void testAllConsecutive() {
        var solution = new CountingElements();
        int[] arr = {1, 2, 3, 4, 5};
        int result = solution.countElements(arr);
        assertEquals(4, result);
    }

    @Test
    public void testDuplicatesWithConsecutive() {
        var solution = new CountingElements();
        int[] arr = {1, 1, 1, 2};
        int result = solution.countElements(arr);
        assertEquals(3, result);
    }

    @Test
    public void testDuplicatesNoConsecutive() {
        var solution = new CountingElements();
        int[] arr = {1, 1, 1, 1};
        int result = solution.countElements(arr);
        assertEquals(0, result);
    }

    @Test
    public void testMultipleDuplicates() {
        var solution = new CountingElements();
        int[] arr = {2, 2, 2, 3, 3, 3};
        int result = solution.countElements(arr);
        assertEquals(3, result);
    }

    @Test
    public void testZeroStart() {
        var solution = new CountingElements();
        int[] arr = {0, 1, 2};
        int result = solution.countElements(arr);
        assertEquals(2, result);
    }

    @Test
    public void testZeroWithoutOne() {
        var solution = new CountingElements();
        int[] arr = {0, 2, 3};
        int result = solution.countElements(arr);
        assertEquals(1, result);
    }

    @Test
    public void testLargeGaps() {
        var solution = new CountingElements();
        int[] arr = {1, 10, 100, 1000};
        int result = solution.countElements(arr);
        assertEquals(0, result);
    }

    @Test
    public void testUnorderedArray() {
        var solution = new CountingElements();
        int[] arr = {5, 3, 1, 4, 2};
        int result = solution.countElements(arr);
        assertEquals(4, result);
    }

    @Test
    public void testMixedDuplicatesAndGaps() {
        var solution = new CountingElements();
        int[] arr = {1, 1, 2, 5, 5, 6, 6};
        int result = solution.countElements(arr);
        assertEquals(4, result);
    }

    @Test
    public void testOnlyHighNumbers() {
        var solution = new CountingElements();
        int[] arr = {100, 101, 102};
        int result = solution.countElements(arr);
        assertEquals(2, result);
    }

    @Test
    public void testRepeatedPairs() {
        var solution = new CountingElements();
        int[] arr = {1, 2, 1, 2, 1, 2};
        int result = solution.countElements(arr);
        assertEquals(3, result);
    }

    @Test
    public void testLongSequenceWithDuplicates() {
        var solution = new CountingElements();
        int[] arr = {1, 1, 2, 2, 3, 3, 4, 4, 5};
        int result = solution.countElements(arr);
        assertEquals(8, result);
    }

    @Test
    public void testNoSuccessors() {
        var solution = new CountingElements();
        int[] arr = {10, 20, 30, 40};
        int result = solution.countElements(arr);
        assertEquals(0, result);
    }
}
