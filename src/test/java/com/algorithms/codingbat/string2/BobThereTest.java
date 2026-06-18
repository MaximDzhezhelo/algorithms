package com.algorithms.codingbat.string2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BobThereTest {

    @Test
    void testBobThere() {
        var mk = new BobThere();
        assertTrue(mk.bobThere("b9b"));
        assertTrue(mk.bobThere("abcbob"));
        assertFalse(mk.bobThere("bac"));
    }

}