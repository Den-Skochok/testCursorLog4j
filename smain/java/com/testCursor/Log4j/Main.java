package com.testCursor.Log4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    public static final Logger LOGGER = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        LOGGER.trace("Debug log message");
        LOGGER.debug("Debug log message");
        LOGGER.info("Info log massage");
        LOGGER.warn("Warn log massage");
        LOGGER.error("Error log massage");
        LOGGER.fatal("Fatal log massage");

    }
}
