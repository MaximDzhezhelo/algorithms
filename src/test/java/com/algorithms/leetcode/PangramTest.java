package com.algorithms.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PangramTest {

    @Test
    public void test(){
        Pangram pangram = new Pangram();
        assertTrue(pangram.checkIfPangram("thequickbrownfoxjumpsoverthelazydog"));
        assertFalse(pangram.checkIfPangram("leetcode"));
    }

}