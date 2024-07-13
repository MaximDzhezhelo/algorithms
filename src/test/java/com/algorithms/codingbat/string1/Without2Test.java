package com.algorithms.codingbat.string1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Without2Test {

    @Test
    public void testLeft() {
        var mk = new Without2();
        assertEquals("lloHe", mk.without2("HelloHe"));
        assertEquals("HelloHi", mk.without2("HelloHi"));
        assertEquals("", mk.without2("Hi"));
    }

}