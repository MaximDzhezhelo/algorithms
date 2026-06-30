package com.algorithms;

import com.algorithms.leetcode.SubarrayProductLessThanK;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RomanizerTest {

    @Test
    public void testIsSubsequence() {
        var romanizer = new Romanizer();
        var input = List.of(5, 1, 2, 3, 4, 5);
        var romanizer1 = romanizer.romanizer(input);
        System.out.println(romanizer1); //[I, II, III, IV, V]
    }


}