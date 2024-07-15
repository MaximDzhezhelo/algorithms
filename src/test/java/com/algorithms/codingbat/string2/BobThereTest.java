package com.algorithms.codingbat.string2;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class BobThereTest {

    @Test
    public void testBobThere() {
        var mk = new BobThere();
        assertTrue(mk.bobThere("b9b"));
        assertTrue(mk.bobThere("abcbob"));
        assertFalse(mk.bobThere("bac"));
    }

}