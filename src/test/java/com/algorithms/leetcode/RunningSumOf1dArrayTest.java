package com.algorithms.leetcode;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class RunningSumOf1dArrayTest {

    @Test
    public void testCountCode() {
        var rs = new RunningSumOf1dArray();
        int[] input = {1, 2, 3, 4};
        int[] res = {1, 3, 6, 10};
        assertEquals(Arrays.toString(res), Arrays.toString(rs.runningSum(input)));

        int[] input2 = {1, 1, 1, 1, 1};
        int[] res2 = {1, 2, 3, 4, 5};
        assertEquals(Arrays.toString(res2), Arrays.toString(rs.runningSum(input2)));

        int[] input3 = {3, 1, 2, 10, 1};
        int[] res3 = {3, 4, 6, 16, 17};
        assertEquals(Arrays.toString(res3), Arrays.toString(rs.runningSum(input3)));
    }

}