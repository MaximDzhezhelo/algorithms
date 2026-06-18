package com.algorithms.codingbat.string2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RepeatEndTest {

    @Test
    public void repeatEnd() {
        var mk = new RepeatEnd();
        assertEquals("llollollo", mk.repeatEnd("Hello", 3));
        assertEquals("lolo", mk.repeatEnd("Hello", 2));
        assertEquals("o", mk.repeatEnd("Hello", 1));
    }
}