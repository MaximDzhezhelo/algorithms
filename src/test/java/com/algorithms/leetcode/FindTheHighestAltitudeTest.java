package com.algorithms.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindTheHighestAltitudeTest {

    @Test
    public void testBasicExample1() {
        var solution = new FindTheHighestAltitude();
        int[] gain = {-5, 1, 5, 0, -7};
        int result = solution.largestAltitude(gain);
        assertEquals(1, result);
    }

    @Test
    public void testBasicExample2() {
        var solution = new FindTheHighestAltitude();
        int[] gain = {-4, -3, -2, -1, 4, 3, 2};
        int result = solution.largestAltitude(gain);
        assertEquals(0, result);
    }

    @Test
    public void testAllPositiveGains() {
        var solution = new FindTheHighestAltitude();
        int[] gain = {1, 2, 3, 4, 5};
        int result = solution.largestAltitude(gain);
        assertEquals(15, result);
    }

    @Test
    public void testAllNegativeGains() {
        var solution = new FindTheHighestAltitude();
        int[] gain = {-1, -2, -3, -4, -5};
        int result = solution.largestAltitude(gain);
        assertEquals(0, result);
    }

    @Test
    public void testSinglePositiveGain() {
        var solution = new FindTheHighestAltitude();
        int[] gain = {5};
        int result = solution.largestAltitude(gain);
        assertEquals(5, result);
    }

    @Test
    public void testSingleNegativeGain() {
        var solution = new FindTheHighestAltitude();
        int[] gain = {-5};
        int result = solution.largestAltitude(gain);
        assertEquals(0, result);
    }

    @Test
    public void testSingleZeroGain() {
        var solution = new FindTheHighestAltitude();
        int[] gain = {0};
        int result = solution.largestAltitude(gain);
        assertEquals(0, result);
    }

    @Test
    public void testHighestAtStart() {
        var solution = new FindTheHighestAltitude();
        int[] gain = {0, -1, -2, -3};
        int result = solution.largestAltitude(gain);
        assertEquals(0, result);
    }

    @Test
    public void testHighestAtEnd() {
        var solution = new FindTheHighestAltitude();
        int[] gain = {1, 2, 3, 4};
        int result = solution.largestAltitude(gain);
        assertEquals(10, result);
    }

    @Test
    public void testHighestInMiddle() {
        var solution = new FindTheHighestAltitude();
        int[] gain = {5, -3, -2, -1};
        int result = solution.largestAltitude(gain);
        assertEquals(5, result);
    }

    @Test
    public void testAlternatingGains() {
        var solution = new FindTheHighestAltitude();
        int[] gain = {10, -10, 10, -10};
        int result = solution.largestAltitude(gain);
        assertEquals(10, result);
    }

    @Test
    public void testAllZeros() {
        var solution = new FindTheHighestAltitude();
        int[] gain = {0, 0, 0, 0};
        int result = solution.largestAltitude(gain);
        assertEquals(0, result);
    }

    @Test
    public void testLargePositiveThenNegative() {
        var solution = new FindTheHighestAltitude();
        int[] gain = {100, -50, -30, -20};
        int result = solution.largestAltitude(gain);
        assertEquals(100, result);
    }

    @Test
    public void testMultiplePeaks() {
        var solution = new FindTheHighestAltitude();
        int[] gain = {5, -2, 4, -3, 6};
        int result = solution.largestAltitude(gain);
        assertEquals(10, result);
    }

    @Test
    public void testGradualIncrease() {
        var solution = new FindTheHighestAltitude();
        int[] gain = {1, 1, 1, 1, 1};
        int result = solution.largestAltitude(gain);
        assertEquals(5, result);
    }

    @Test
    public void testGradualDecrease() {
        var solution = new FindTheHighestAltitude();
        int[] gain = {-1, -1, -1, -1, -1};
        int result = solution.largestAltitude(gain);
        assertEquals(0, result);
    }

    @Test
    public void testPeakThenValley() {
        var solution = new FindTheHighestAltitude();
        int[] gain = {10, 5, -20, 10};
        int result = solution.largestAltitude(gain);
        assertEquals(15, result);
    }

    @Test
    public void testMinMaxValues() {
        var solution = new FindTheHighestAltitude();
        int[] gain = {100, -100, 50};
        int result = solution.largestAltitude(gain);
        assertEquals(100, result);
    }
}
