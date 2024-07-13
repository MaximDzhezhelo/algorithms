package com.algorithms.codingbat.string1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Right2Test {

    @Test
    public void testLeft() {
        var mk = new Right2();
        assertEquals("loHel", mk.right2("Hello"));
        assertEquals("vaja", mk.right2("java"));
        assertEquals("Hi", mk.right2("Hi"));
    }

}