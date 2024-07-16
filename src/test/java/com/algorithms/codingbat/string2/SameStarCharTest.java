package com.algorithms.codingbat.string2;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SameStarCharTest {

    @Test
    public void sameStarChar() {
        var mk = new SameStarChar();
        assertTrue(mk.sameStarChar(""));
        assertTrue(mk.sameStarChar("*"));
        assertTrue(mk.sameStarChar("**"));
        assertTrue(mk.sameStarChar("xy*yzz"));
        assertTrue(mk.sameStarChar("xa*az"));
        assertTrue(mk.sameStarChar("*xa*az"));
        assertTrue(mk.sameStarChar("*xa*a*a"));
        assertFalse(mk.sameStarChar("xy*zzz"));
        assertFalse(mk.sameStarChar("*xa*bz"));
        assertFalse(mk.sameStarChar("*xa*a*b"));
        assertFalse(mk.sameStarChar("12*2*3*"));
    }
}