package homeworks.hw5;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    private List<String> history;
    private Logger logger;
    private Parser parser;

    public Calculator() {
        this.history = new ArrayList<>();
        this.logger = new Logger();
        this.parser = new Parser();
    }

    public RationalNumber calculate(String expression) {
        List<String> tokens = parser.tokenize(expression);
        List<RationalNumber> numbers = new ArrayList<>();
        List<String> operations = new ArrayList<>();

        for (String token : tokens) {
            if (isNumber(token)) {
                RationalNumber number = parseNumber(token);
                numbers.add(number);
            } else if (isOperator(token)) {
                operations.add(token);
            } else {
                throw new IllegalArgumentException("Invalid token: " + token);
            }
        }

        while (!operations.isEmpty()) {
            int index = findNextOperationIndex(operations);
            RationalNumber a = numbers.get(index);
            RationalNumber b = numbers.get(index + 1);
            String operation = operations.get(index);
            RationalNumber result = performOperation(a, b, operation);
            numbers.set(index, result);
            numbers.remove(index + 1);
            operations.remove(index);
        }
    
        if (numbers.size() != 1) {
            throw new IllegalArgumentException("Invalid expression: " + expression);
        }
    
        RationalNumber result = numbers.get(0);
        history.add(expression + " = " + result.toString());
        logger.log(expression + " = " + result.toString());
        return result;
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
        for (String expression : history) {
            System.out.println(expression);
        }
    }
    
    private RationalNumber parseNumber(String token) {
        String[] parts = token.split("/");
        if (parts.length == 1) {
            int numerator = Integer.parseInt(parts[0]);
            return new RationalNumber(numerator, 1);
        } else if (parts.length == 2) {
            int numerator = Integer.parseInt(parts[0]);
            int denominator = Integer.parseInt(parts[1]);
            return new RationalNumber(numerator, denominator);
        } else {
            throw new IllegalArgumentException("Invalid number: " + token);
        }
    }
    
    private int findNextOperationIndex(List<String> operations) {
        int minIndex = -1;
        int minPrecedence = Integer.MAX_VALUE;
    
        for (int i = 0; i < operations.size(); i++) {
            String operation = operations.get(i);
            int precedence = getPrecedence(operation);
    
            if (precedence < minPrecedence) {
                minIndex = i;
                minPrecedence = precedence;
            }
        }
    
        return minIndex;
    }
    
    private int getPrecedence(String operation) {
        switch (operation) {
            case "+":
            case "-":
                return 1;
            case "*":
            case "/":
                return 2;
            default:
                throw new IllegalArgumentException("Invalid operation: " + operation);
        }
    }
    
    private boolean isNumber(String token) {
        return token.matches("-?\\d+/?\\d*");
    }
    
    private boolean isOperator(String token) {
        return "+-*/".contains(token);
    }
}