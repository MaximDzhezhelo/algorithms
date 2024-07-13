package com.algorithms.codingbat.string1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HelloNameTest {

    @Test
    public void testHelloName() {
        var mk = new HelloName();
        assertEquals("Hello Bob!", mk.helloName("Bob"));
        assertEquals("Hello Alice!", mk.helloName("Alice"));
        assertEquals("Hello X!", mk.helloName("X"));
    }

}