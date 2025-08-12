package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ApdexTest {

    @Test
    public void testCalculusGoodApdex(){
        Apdex apdex = new Apdex();
        double result = apdex.calculus(80, 20, 100);

        assertEquals(0.9, result);
    }
}