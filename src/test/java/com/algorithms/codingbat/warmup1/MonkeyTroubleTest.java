package com.algorithms.codingbat.warmup1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MonkeyTroubleTest {

    @Test
    void testMonkeyTrouble(){
        var mk = new MonkeyTrouble();
        assertTrue(mk.monkeyTrouble(true, true));
        assertTrue(mk.monkeyTrouble(false, false));
        assertFalse(mk.monkeyTrouble(true, false));
    }

}