package com.algorithms.codingbat.string1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Left2Test {

    @Test
    void testLeft() {
        var mk = new Left2();
        assertEquals("lloHe", mk.left2("Hello"));
        assertEquals("vaja", mk.left2("java"));
        assertEquals("Hi", mk.left2("Hi"));
    }

}