//Gabriel Alves Thomaz - RM558637
package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ApdexTest {

    private Apdex apdex;
    @BeforeEach
    public void arrange(){
        this.apdex = new Apdex();
    }

    @Test
    public void TestExcelentApdex(){
        double result = apdex.calcApdex(520000, 2000, 558637);
        assertEquals(0.94, result, 0.01);
    }

    @Test
    public void TestGoodApdex(){
        double result = apdex.calcApdex(470000, 70000, 558637);
        assertEquals(0.9, result, 0.01);
    }

    @Test
    public void TestReasonableApdex(){
        double result = apdex.calcApdex(370000, 100000, 558637);
        assertEquals(0.75, result, 0.01);
    }

    @Test
    public void TestBadApdex(){
        double result = apdex.calcApdex(320000, 20000, 558637);
        assertEquals(0.6, result, 0.01);
    }

    @Test
    public void TestUnacceptableApdex(){
        double result = apdex.calcApdex(8000, 10000, 558637);
        assertEquals(0.03, result, 0.01);
    }
}