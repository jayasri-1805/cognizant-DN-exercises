package com.jayasri.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingExample {

    private static final Logger LOG = LoggerFactory.getLogger(LoggingExample.class);

    public static void main(String[] args) {

        String username = "admin";
        boolean loginSuccessful = false;

        if (!loginSuccessful) {
            LOG.warn("Login attempt failed for user: {}", username);
        }

        try {
            throw new IllegalStateException("Sample application exception");
        } catch (IllegalStateException ex) {
            LOG.error("Application encountered an error: {}", ex.getMessage());
        }
    }
}
