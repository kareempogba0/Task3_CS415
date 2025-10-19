package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    @Test
    public void testAddition() {
        Calculator calc = new Calculator();
        assertEquals(5, calc.add(2, 3), "2 + 3 should equal 5");
    }
    @Test
    public void testSubtraction() {
        Calculator calc = new Calculator();
        assertEquals(1, calc.subtract(3, 2), "3 - 2 should equal 1");
    }
    @Test
    public void testMultiplication() {
        Calculator calc = new Calculator();
        assertEquals(6, calc.multiply(2, 3), "2 * 3 should equal 6");
    }
    @Test
    public void testDivision() {
        Calculator calc = new Calculator();
        assertEquals(2.0, calc.divide(6, 3), 0.001, "6 / 3 should equal 2");
    }
    @Test
    public void testDivisionByZero() {
        Calculator calc = new Calculator();
        assertThrows(ArithmeticException.class, () -> {
            calc.divide(5, 0);
        }, "Division by zero should throw ArithmeticException");
    }
}