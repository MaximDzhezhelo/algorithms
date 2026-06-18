package com.algorithms.codingbat.string1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloNameTest {

    @Test
    void testHelloName() {
        var mk = new HelloName();
        assertEquals("Hello Bob!", mk.helloName("Bob"));
        assertEquals("Hello Alice!", mk.helloName("Alice"));
        assertEquals("Hello X!", mk.helloName("X"));
    }

}