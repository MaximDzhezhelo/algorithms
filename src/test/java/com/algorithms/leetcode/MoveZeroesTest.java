package com.algorithms.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MoveZeroesTest {

    @Test
    public void testBasicMoveZeroes() {
        var solution = new MoveZeroes();
        int[] nums = {0, 1, 0, 3, 12};
        int[] expected = {1, 3, 12, 0, 0};
        solution.moveZeroes(nums);
        assertArrayEquals(expected, nums);
    }

    @Test
    public void testBasicMoveZeroes1() {
        var solution = new MoveZeroes();
        int[] nums = {1, 0, 1};
        int[] expected = {1, 1, 0};
        solution.moveZeroes(nums);
        assertArrayEquals(expected, nums);
    }

    @Test
    public void testSingleZero() {
        var solution = new MoveZeroes();
        int[] nums = {0};
        int[] expected = {0};
        solution.moveZeroes(nums);
        assertArrayEquals(expected, nums);
    }

    @Test
    public void testSingleNonZero() {
        var solution = new MoveZeroes();
        int[] nums = {1};
        int[] expected = {1};
        solution.moveZeroes(nums);
        assertArrayEquals(expected, nums);
    }

    @Test
    public void testNoZeroes() {
        var solution = new MoveZeroes();
        int[] nums = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};
        solution.moveZeroes(nums);
        assertArrayEquals(expected, nums);
    }

    @Test
    public void testAllZeroes() {
        var solution = new MoveZeroes();
        int[] nums = {0, 0, 0, 0};
        int[] expected = {0, 0, 0, 0};
        solution.moveZeroes(nums);
        assertArrayEquals(expected, nums);
    }

    @Test
    public void testZeroesAtBeginning() {
        var solution = new MoveZeroes();
        int[] nums = {0, 0, 0, 1, 2, 3};
        int[] expected = {1, 2, 3, 0, 0, 0};
        solution.moveZeroes(nums);
        assertArrayEquals(expected, nums);
    }

    @Test
    public void testZeroesAtEnd() {
        var solution = new MoveZeroes();
        int[] nums = {1, 2, 3, 0, 0, 0};
        int[] expected = {1, 2, 3, 0, 0, 0};
        solution.moveZeroes(nums);
        assertArrayEquals(expected, nums);
    }

    @Test
    public void testAlternatingZeroes() {
        var solution = new MoveZeroes();
        int[] nums = {0, 1, 0, 2, 0, 3};
        int[] expected = {1, 2, 3, 0, 0, 0};
        solution.moveZeroes(nums);
        assertArrayEquals(expected, nums);
    }

    @Test
    public void testMixedPositiveNegative() {
        var solution = new MoveZeroes();
        int[] nums = {-1, 0, 2, 0, -3, 0, 4};
        int[] expected = {-1, 2, -3, 4, 0, 0, 0};
        solution.moveZeroes(nums);
        assertArrayEquals(expected, nums);
    }

    @Test
    public void testTwoElements() {
        var solution = new MoveZeroes();
        int[] nums = {0, 1};
        int[] expected = {1, 0};
        solution.moveZeroes(nums);
        assertArrayEquals(expected, nums);
    }

    @Test
    public void testTwoElementsBothZero() {
        var solution = new MoveZeroes();
        int[] nums = {0, 0};
        int[] expected = {0, 0};
        solution.moveZeroes(nums);
        assertArrayEquals(expected, nums);
    }

    @Test
    public void testTwoElementsNoZero() {
        var solution = new MoveZeroes();
        int[] nums = {2, 1};
        int[] expected = {2, 1};
        solution.moveZeroes(nums);
        assertArrayEquals(expected, nums);
    }
}
