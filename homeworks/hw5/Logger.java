package homeworks.hw5;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {
    private PrintWriter writer;

    public Logger() {
        try {
            this.writer = new PrintWriter(new FileWriter("log.txt", true));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void log(String message) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String timestamp = now.format(formatter);
        writer.println(timestamp + " " + message);
        writer.flush();
    }

    public void close() {
        writer.close();
    }
}

