package homeworks.hw5;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {
    private String filename;

    public Logger(String filename) {
        this.filename = filename;
    }

    public void log(String message) {
        LocalDateTime now = LocalDateTime.now();
        String timestamp = now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        String logMessage = timestamp + " - " + message + "\n";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true))) {
            writer.write(logMessage);
        } catch (IOException e) {
            System.err.println("Error writing log message: " + e.getMessage());
        }
    }
}
