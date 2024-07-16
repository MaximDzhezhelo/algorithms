package com.algorithms.codingbat.string2;

import org.junit.Test;

import static org.junit.Assert.*;

public class RepeatEndTest {

    @Test
    public void repeatEnd() {
        var mk = new RepeatEnd();
        assertEquals("llollollo", mk.repeatEnd("Hello", 3));
        assertEquals("lolo", mk.repeatEnd("Hello", 2));
        assertEquals("o", mk.repeatEnd("Hello", 1));
    }
}