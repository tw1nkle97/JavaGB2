package homeworks.hw5;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    private static final String LOG_FILE = "calculator.log";

    private Logger logger;
    private List<String> history;

    public Calculator() {
        this.logger = new Logger(LOG_FILE);
        this.history = new ArrayList<>();
    }

    public RationalNumber calculate(String expression) {
        String[] tokens = expression.split(" ");
        List<RationalNumber> numbers = new ArrayList<>();
        List<String> operations = new ArrayList<>();

        for (String token : tokens) {
            if (isNumber(token)) {
                numbers.add(parseNumber(token));
            } else if (isOperator(token)) {
                operations.add(token);
            }
        }

        while (operations.size() > 0) {
            int index = findNextOperationIndex(operations);
            RationalNumber a = numbers.remove(index);
            RationalNumber b = numbers.remove(index);
            RationalNumber result = performOperation(a, b, operations.remove(index));
            numbers.add(index, result);
        }

        RationalNumber result = numbers.get(0);
        history.add(expression + " = " + result.toString());
        logger.log(expression + " = " + result.toString());
        return result;
    }

    private RationalNumber parseNumber(String token) {
        String[] parts = token.split("/");
        int numerator = Integer.parseInt(parts[0]);
        int denominator = parts.length > 1 ? Integer.parseInt(parts[1]) : 1;
        return new RationalNumber(numerator, denominator);
    }
    
    private boolean isNumber(String token) {
        return token.matches("-?\\d+/\\d+");
    }
    
    private boolean isOperator(String token) {
        return token.matches("[+\\-*/]");
    }
    
    private int findNextOperationIndex(List<String> operations) {
        if (operations.contains("*") && operations.contains("/")) {
            int multiplyIndex = operations.indexOf("*");
            int divideIndex = operations.indexOf("/");
            return multiplyIndex < divideIndex ? multiplyIndex : divideIndex;
        } else if (operations.contains("*")) {
            return operations.indexOf("*");
        } else if (operations.contains("/")) {
            return operations.indexOf("/");
        } else {
            return 0;
        }
    }
    
    private RationalNumber performOperation(RationalNumber a, RationalNumber b, String operation) {
        switch (operation) {
            case "+":
                return a.add(b);
            case "-":
                return a.subtract(b);
            case "*":
                return a.multiply(b);
            case "/":
                return a.divide(b);
            default:
                throw new IllegalArgumentException("Invalid operation: " + operation);
        }
    }
    
    public void printHistory() {
        for (String item : history) {
            System.out.println(item);
        }
    }
}