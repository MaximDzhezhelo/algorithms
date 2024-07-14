package com.algorithms.codingbat.string1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MakeOutWordTest {

    @Test
    public void testHelloName() {
        var mk = new MakeOutWord();
        assertEquals("<<Yay>>", mk.makeOutWord("<<>>", "Yay"));
        assertEquals("<<WooHoo>>", mk.makeOutWord("<<>>", "WooHoo"));
        assertEquals("[[word]]", mk.makeOutWord("[[]]", "word"));
    }

}