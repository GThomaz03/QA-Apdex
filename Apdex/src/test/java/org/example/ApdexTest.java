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
        double result = apdex.calcApdex(90, 10, 100);
        assertEquals(0.95, result, 0.01);
    }

    @Test
    public void TestGoodApdex(){
        double result = apdex.calcApdex(80, 20, 100);
        assertEquals(0.9, result, 0.01);
    }

    @Test
    public void TestReasonableApdex(){
        double result = apdex.calcApdex(75, 12, 100);
        assertEquals(0.81, result, 0.01);
    }

    @Test
    public void TestBadApdex(){
        double result = apdex.calcApdex(20, 80, 100);
        assertEquals(0.6, result, 0.01);
    }

    @Test
    public void TestUnacceptableApdex(){
        double result = apdex.calcApdex(10, 90, 100);
        assertEquals(0.55, result, 0.01);
    }
}