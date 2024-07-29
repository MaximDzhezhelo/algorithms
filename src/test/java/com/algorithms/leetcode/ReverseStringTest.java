package com.algorithms.leetcode;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class ReverseStringTest {

    @Test
    public void testCountCode() {
        var rs = new ReverseString();
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        char[] o = {'o', 'l', 'l', 'e', 'h'};
        assertEquals(Arrays.toString(o), Arrays.toString(rs.reverse(s)));
    }

}