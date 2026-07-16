package com.jayasri.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TemperatureConverterTest {

    private TemperatureConverter converter;

    @Before
    public void setUp() {
        converter = new TemperatureConverter();
        System.out.println("Test setup completed");
    }

    @After
    public void tearDown() {
        converter = null;
        System.out.println("Test resources released");
    }

    @Test
    public void shouldConvertCelsiusToFahrenheit() {

        // Arrange
        double input = 25.0;

        // Act
        double result = converter.celsiusToFahrenheit(input);

        // Assert
        assertEquals(77.0, result, 0.001);
    }
}
