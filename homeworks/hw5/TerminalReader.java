package homeworks.hw5;

import java.util.Scanner;

public class TerminalReader {
    private Scanner scanner;

    public TerminalReader() {
        this.scanner = new Scanner(System.in);
    }

    public String readExpression() {
        System.out.print("Enter an expression (or 'q' to quit): ");
        String input = scanner.nextLine();
        return input;
    }

    public void close() {
        scanner.close();
    }
}
