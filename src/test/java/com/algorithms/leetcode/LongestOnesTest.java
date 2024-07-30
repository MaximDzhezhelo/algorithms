package com.algorithms.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LongestOnesTest {

    @Test
    public void longestOnes() {
        var longestOnes = new LongestOnes();

        int[] numsA = {1, 1, 1, 1};
        assertEquals(4, longestOnes.longestOnes(numsA, 2));

        int[] numsB = {0, 0, 0, 0, 0, 0, 0, 0};
        assertEquals(0, longestOnes.longestOnes(numsB, 0));

        int[] numsC = {1, 1, 1, 0, 1, 1};
        assertEquals(6, longestOnes.longestOnes(numsC, 1));

        int[] numsD = {1, 1, 0, 0, 1, 1};
        assertEquals(6, longestOnes.longestOnes(numsD, 2));

        int[] numsE = {1, 1, 1, 1, 0, 0};
        assertEquals(6, longestOnes.longestOnes(numsE, 2));

        int[] numsF = {0, 1, 1, 1, 0, 0};
        assertEquals(5, longestOnes.longestOnes(numsF, 2));

        int[] numsG = {1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0};
        assertEquals(6, longestOnes.longestOnes(numsG, 2));

        int[] numsH = {0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1};
        assertEquals(10, longestOnes.longestOnes(numsH, 3));

        int[] numsI = {0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 0, 1, 1, 1, 1};
        assertEquals(10, longestOnes.longestOnes(numsI, 3));

        int[] numsK = {0, 0, 1, 0, 0, 0, 1, 1, 1, 1, 0};
        assertEquals(6, longestOnes.longestOnes(numsK, 2));

        int[] numsL = {0, 0, 1, 1, 1, 0, 0, 0};
        assertEquals(3, longestOnes.longestOnes(numsL, 0));

        int[] numsM = {1, 1, 1, 1, 1, 1, 0, 0};
        assertEquals(6, longestOnes.longestOnes(numsM, 0));

        int[] numsN = {0, 0, 0, 0, 0, 0, 0, 0};
        assertEquals(0, longestOnes.longestOnes(numsN, 0));

        int[] numsO = {1, 1, 1, 0, 0, 0, 1, 1, 1, 1};
        assertEquals(4, longestOnes.longestOnes(numsO, 0));
    }

}