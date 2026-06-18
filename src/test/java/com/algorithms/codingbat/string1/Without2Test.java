package com.algorithms.codingbat.string1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Without2Test {

    @Test
    void testLeft() {
        var mk = new Without2();
        assertEquals("lloHe", mk.without2("HelloHe"));
        assertEquals("HelloHi", mk.without2("HelloHi"));
        assertEquals("", mk.without2("Hi"));
    }

}