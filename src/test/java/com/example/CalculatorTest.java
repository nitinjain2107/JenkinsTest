package com.example;

import org.testng.Assert;

import org.testng.annotations.Test;

public class CalculatorTest {
    private Calculator calculator= new Calculator();


    @Test(groups={"smoke"})
    public void testAdd() {
        Assert.assertEquals(calculator.add(2, 3), 5);
    }

    @Test(groups={"smoke"})
    public void testSubtract() {
        Assert.assertEquals(calculator.subtract(5, 3), 2);
    }

    @Test(groups={"regression"})
    public void testMultiply() {
        Assert.assertEquals(calculator.multiply(2, 3), 6);
    }

    @Test(groups={"regression"})
    public void testDivide() {
        Assert.assertEquals(calculator.divide(6, 3), 2.0);
    }

    @Test(expectedExceptions = IllegalArgumentException.class, expectedExceptionsMessageRegExp = "Division by zero is not allowed.",groups={"regression"})
    public void testDivideByZero() {
        calculator.divide(1, 0);
    }
}
