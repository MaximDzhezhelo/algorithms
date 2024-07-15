package com.algorithms.codingbat.string2;

import junit.framework.TestCase;
import org.junit.Test;

public class CountCodeTest extends TestCase {

    @Test
    public void testCountCode() {
        var mk = new CountCode();
        assertEquals(1, mk.countCode("aaacodebbb"));
        assertEquals(2, mk.countCode("codexxcode"));
        assertEquals(2, mk.countCode("cozexxcope"));
    }

}