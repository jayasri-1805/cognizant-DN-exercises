package com.jayasri.junit;

import org.junit.Test;

import static org.junit.Assert.*;

public class AssertionsTest {

    @Test
    public void verifyCommonAssertions() {

        int expectedSum = 12;
        int actualSum = 7 + 5;
        assertEquals(expectedSum, actualSum);

        String message = "JUnit";
        assertTrue(message.startsWith("J"));
        assertFalse(message.isEmpty());

        Object reference = null;
        assertNull(reference);

        Object instance = new StringBuilder("Ready");
        assertNotNull(instance);

        assertSame(instance, instance);
    }
}
