package com.jayasri.junit;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void shouldAddTwoNumbers() {
        Calculator calculator = new Calculator();
        assertEquals(15, calculator.add(7,8));
    }
}
