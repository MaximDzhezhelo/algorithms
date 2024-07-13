package com.algorithms.codingbat.warmup1;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class MonkeyTroubleTest {

    @Test
    public void testMonkeyTrouble(){
        var mk = new MonkeyTrouble();
        assertTrue(mk.monkeyTrouble(true, true));
        assertTrue(mk.monkeyTrouble(false, false));
        assertFalse(mk.monkeyTrouble(true, false));
    }

}