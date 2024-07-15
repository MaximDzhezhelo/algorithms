package com.algorithms.codingbat.string2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DoubleCharTest {
    @Test
    public void testDoubleChar() {
        var mk = new DoubleChar();
        assertEquals("TThhee", mk.doubleChar("The"));
        assertEquals("AAAAbbbb", mk.doubleChar("AAbb"));
        assertEquals("HHii--TThheerree", mk.doubleChar("Hi-There"));
    }
}