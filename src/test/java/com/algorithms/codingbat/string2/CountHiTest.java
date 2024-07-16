package com.algorithms.codingbat.string2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountHiTest {

    @Test
    public void countHi() {
        var mk = new CountHi();
        assertEquals(1, mk.countHi("abc hi ho"));
        assertEquals(2, mk.countHi("ABChi hi"));
        assertEquals(2, mk.countHi("hihi"));
    }

}