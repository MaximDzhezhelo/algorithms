package com.algorithms.codingbat.string1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MakeOutWordTest {

    @Test
    void testHelloName() {
        var mk = new MakeOutWord();
        assertEquals("<<Yay>>", mk.makeOutWord("<<>>", "Yay"));
        assertEquals("<<WooHoo>>", mk.makeOutWord("<<>>", "WooHoo"));
        assertEquals("[[word]]", mk.makeOutWord("[[]]", "word"));
    }

}