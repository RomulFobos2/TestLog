import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    public static Logger slf4jLogger = LoggerFactory.getLogger(Main.class);
    private static final String FILENAME = "/file/does/not/exist";
    public static void main(String[] args) {
        slf4jLogger.info("Just a log message.");
        slf4jLogger.debug("Message for debug level.");
        try {
            Files.readAllBytes(Paths.get(FILENAME));
        } catch (IOException ioex) {
            slf4jLogger.error("Failed to read file {}.", FILENAME, ioex);
        }
    }
}