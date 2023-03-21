package homeworks.hw5;

public class Program {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        TerminalReader reader = new TerminalReader();

        while (true) {
            String input = reader.readExpression();

            if (input.equals("q")) {
                break;
            }

            try {
                RationalNumber result = calculator.calculate(input);
                System.out.println(input + " = " + result.toString());
            } catch (IllegalArgumentException e) {
                System.err.println("Error: " + e.getMessage());
            }
        }

        calculator.printHistory();
        reader.close();
    }
}
