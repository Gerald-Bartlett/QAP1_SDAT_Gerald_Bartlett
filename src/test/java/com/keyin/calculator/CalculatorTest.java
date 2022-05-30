package com.keyin.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    private Calculator calculatorUnderTest = new Calculator();

    @Test
    @DisplayName("Test Addition successful ")
    public void testAdd() {
        Assertions.assertEquals(2, calculatorUnderTest.add(-1, 3));
        Assertions.assertNotEquals(0, calculatorUnderTest.add(5, 2));
        Assertions.assertNotEquals(10, calculatorUnderTest.add(15, 25));
    }

    @Test
    @DisplayName("Test Subtraction successful ")
    public void testDifference(){
        Assertions.assertEquals(28, calculatorUnderTest.difference(7,35));
        Assertions.assertNotEquals(1, calculatorUnderTest.difference(5, 5));
        Assertions.assertEquals(-45, calculatorUnderTest.difference(80,35));
    }

    @Test
    @DisplayName("Test Multiplication successful ")
    public void testProduct(){
        Assertions.assertEquals(70, calculatorUnderTest.product(35,2));
        Assertions.assertNotEquals(1, calculatorUnderTest.product(5, 5));
        Assertions.assertNotEquals(1, calculatorUnderTest.product(55, 105));
    }

    @Test
    @DisplayName("Test Division successful ")
    public void testQuotient(){
        Assertions.assertEquals(5, calculatorUnderTest.quotient(7,35));
        Assertions.assertEquals(25, calculatorUnderTest.quotient(5,125));
        Assertions.assertNotEquals(0, calculatorUnderTest.quotient(5, 5));
    }
    @Test
    @DisplayName("Test Number is Square successful ")
    public void testSquare() {
        Assertions.assertEquals(49, calculatorUnderTest.square(7));
        Assertions.assertEquals(100, calculatorUnderTest.square(10));
        Assertions.assertNotEquals(55, calculatorUnderTest.square(5));
    }
        @Test
        @DisplayName("Test Number is a Square Root successful ")
    public void testSquareRoot(){
        Assertions.assertEquals(7, calculatorUnderTest.squareRoot(49));
        Assertions.assertEquals(10, calculatorUnderTest.squareRoot(100));
        Assertions.assertNotEquals(11, calculatorUnderTest.squareRoot(144));
    }

}