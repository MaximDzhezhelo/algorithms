package com.algorithms.codingbat.string2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DoubleCharTest {
    @Test
    void testDoubleChar() {
        var mk = new DoubleChar();
        assertEquals("TThhee", mk.doubleChar("The"));
        assertEquals("AAAAbbbb", mk.doubleChar("AAbb"));
        assertEquals("HHii--TThheerree", mk.doubleChar("Hi-There"));
    }
}