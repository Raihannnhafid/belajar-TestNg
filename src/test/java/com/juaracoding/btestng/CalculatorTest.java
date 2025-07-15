package com.juaracoding.btestng;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CalculatorTest {
    
    private int a;
    private int b;
    private int expected;

    @BeforeClass
    public void BeforeClass() {
        a = 10;
        b = 2;
        expected = 12;
    }

    @Test
    public void addTest() {
        int actual = Calculator.add(a, b);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void substractTest() {
        int a = 10;
        int b = 2;
        int expected = 8;
        int actual = Calculator.subtract(a, b);

        Assert.assertEquals(expected, actual);
    }

    @AfterClass
    public void tearDown() {
        a = 0;
        b = 0;
    }
}
