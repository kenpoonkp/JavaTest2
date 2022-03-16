package com.example;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

public class MathTest {
    static Math m;

    @BeforeClass
    //run once before all test cases start running
    public static void setup(){
        m = new Math();
    }
    
    @Test
    public void canAdd() {
        assertEquals(3, m.add(1,2));
    }

    @Test
    public void canDivide() {
        double d = m.divide(6,2,3);
        assertEquals(3, d, 0.01);
    }

    @Test
    public void canDivisionByZero() {
        double d = m.divide(6,0,3);
        double d2 = m.divide(6,1,4);
        assertEquals(-9999, d, 0.01);
        assertEquals(-9999, d2, 0.01);
    }

    @Test
    public void canMultiply() {
        assertEquals(6, m.multiply(2, 3));
    }

    @Test
    public void canSubtract() {
        assertEquals(1, m.subtract(2, 1));
    }
}
