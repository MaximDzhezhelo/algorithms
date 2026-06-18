package com.algorithms.codingbat.string2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountCodeTest {

    @Test
    void testCountCode() {
        var mk = new CountCode();
        assertEquals(1, mk.countCode("aaacodebbb"));
        assertEquals(2, mk.countCode("codexxcode"));
        assertEquals(2, mk.countCode("cozexxcope"));
    }

}