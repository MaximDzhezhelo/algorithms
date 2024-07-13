package com.algorithms.codingbat.string1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Left2Test {

    @Test
    public void testLeft() {
        var mk = new Left2();
        assertEquals("lloHe", mk.left2("Hello"));
        assertEquals("vaja", mk.left2("java"));
        assertEquals("Hi", mk.left2("Hi"));
    }

}