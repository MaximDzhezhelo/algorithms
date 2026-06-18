package com.algorithms.codingbat.string2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RepeatFrontTest {

    @Test
    public void repeatFront() {
        var mk = new RepeatFront();
        assertEquals("ChocChoChC", mk.repeatFront("Chocolate", 4));
        assertEquals("ChoChC", mk.repeatFront("Chocolate", 3));
        assertEquals("IcI", mk.repeatFront("Ice Cream", 2));
    }
}