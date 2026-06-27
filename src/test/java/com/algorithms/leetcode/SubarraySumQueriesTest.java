package com.algorithms.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SubarraySumQueriesTest {

    @Test
    public void testBasicExample() {
        var solution = new SubarraySumQueries();

        int[] nums = {1, 6, 3, 2, 7, 2};
        int[][] queries = {{0, 3}, {2, 5}, {2, 4}};
        int limit = 13;

        boolean[] expected = {true, false, true};
        assertArrayEquals(expected, solution.answerQueries(nums, queries, limit));
    }

    @Test
    public void testSingleElementQueries() {
        var solution = new SubarraySumQueries();

        int[] nums = {5, 10, 15, 20};
        int[][] queries = {{0, 0}, {1, 1}, {2, 2}, {3, 3}};
        int limit = 12;

        boolean[] expected = {true, true, false, false};
        assertArrayEquals(expected, solution.answerQueries(nums, queries, limit));
    }

    @Test
    public void testFullArrayQuery() {
        var solution = new SubarraySumQueries();

        int[] nums = {1, 2, 3, 4};
        int[][] queries = {{0, 3}};
        int limit = 11;

        boolean[] expected = {true};
        assertArrayEquals(expected, solution.answerQueries(nums, queries, limit));
    }

    @Test
    public void testAllQueriesExceedLimit() {
        var solution = new SubarraySumQueries();

        int[] nums = {10, 20, 30};
        int[][] queries = {{0, 1}, {1, 2}, {0, 2}};
        int limit = 25;

        boolean[] expected = {false, false, false};
        assertArrayEquals(expected, solution.answerQueries(nums, queries, limit));
    }

    @Test
    public void testAllQueriesBelowLimit() {
        var solution = new SubarraySumQueries();

        int[] nums = {1, 2, 3, 4};
        int[][] queries = {{0, 1}, {1, 2}, {2, 3}};
        int limit = 100;

        boolean[] expected = {true, true, true};
        assertArrayEquals(expected, solution.answerQueries(nums, queries, limit));
    }

    @Test
    public void testEdgeCaseEqualToLimit() {
        var solution = new SubarraySumQueries();

        int[] nums = {5, 5, 5};
        int[][] queries = {{0, 1}, {0, 2}};
        int limit = 10;

        boolean[] expected = {false, false};
        assertArrayEquals(expected, solution.answerQueries(nums, queries, limit));
    }

    @Test
    public void testNegativeNumbers() {
        var solution = new SubarraySumQueries();

        int[] nums = {-5, 10, -3, 8};
        int[][] queries = {{0, 1}, {1, 2}, {0, 3}};
        int limit = 5;

        boolean[] expected = {false, false, false};
        assertArrayEquals(expected, solution.answerQueries(nums, queries, limit));
    }

    @Test
    public void testMultipleQueriesSameRange() {
        var solution = new SubarraySumQueries();

        int[] nums = {1, 2, 3, 4, 5};
        int[][] queries = {{1, 3}, {1, 3}, {0, 4}};
        int limit = 10;

        boolean[] expected = {true, true, false};
        assertArrayEquals(expected, solution.answerQueries(nums, queries, limit));
    }

    @Test
    public void testBugExposingCase() {
        var solution = new SubarraySumQueries();

        int[] nums = {100, 1, 1, 1};
        int[][] queries = {{1, 3}};
        int limit = 5;

        boolean[] expected = {true};
        assertArrayEquals(expected, solution.answerQueries(nums, queries, limit));
    }

}
