package com.algorithms.codingbat.string2;

import org.junit.Test;

import static org.junit.Assert.*;

public class OneTwoTest {

    @Test
    public void oneTwo() {
        var mk = new OneTwo();
        assertEquals("bca", mk.oneTwo("abc"));
        assertEquals("cat", mk.oneTwo("tca"));
        assertEquals("catdog", mk.oneTwo("tcagdo"));
    }
}