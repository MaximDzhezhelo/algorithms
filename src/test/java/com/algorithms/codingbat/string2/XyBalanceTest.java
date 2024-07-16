package com.algorithms.codingbat.string2;

import org.junit.Test;

import static org.junit.Assert.*;

public class XyBalanceTest {

    @Test
    public void xyBalance() {
        var mk = new XyBalance();
        assertTrue(mk.xyBalance("aaxbby"));
        assertFalse(mk.xyBalance("aaxbb"));
        assertFalse(mk.xyBalance("yaaxbb"));
    }
}