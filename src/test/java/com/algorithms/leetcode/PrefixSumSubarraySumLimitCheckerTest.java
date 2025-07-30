package com.algorithms.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PrefixSumSubarraySumLimitCheckerTest {

    @Test
    public void checkSubarraySums() {
        int[] nums = {1, 6, 3, 2, 7, 2};
        int[][] queries = {{0, 3}, {2, 5}, {2, 4}};
        int limit = 13;

        var checker = new PrefixSumSubarraySumLimitChecker();
        boolean[] booleans = checker.answerQueries(nums, queries, limit);
        assertTrue(booleans[0]);
        assertFalse(booleans[1]);
        assertTrue(booleans[2]);
    }

}