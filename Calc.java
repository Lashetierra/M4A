import java.util.Scanner;

public class Calc {
    private double num1;
    private double num2;

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public double add() {
        return num1 + num2;
    }

    public double subtract() {
        return num1 - num2;
    }

    public double multiply() {
        return num1 * num2;
    }

    public double divide() {
        return num1 / num2;
    }

    // Repeatedly asks for input until a valid number is entered
    private static double readNumber(Scanner input, String prompt) {
        while (true) {
            System.out.print(prompt);

            if (input.hasNextDouble()) {
                return input.nextDouble();
            } else {
                System.out.println("Invalid input. Please enter a numeric value.");
                input.next(); // Remove the invalid input
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Calc calc = new Calc();

        // Get the first number
        calc.setNum1(readNumber(input, "Enter first number: "));

        // Get the second number
        calc.setNum2(readNumber(input, "Enter second number: "));

        // Display the results
        System.out.println("Addition: " + calc.add());
        System.out.println("Subtraction: " + calc.subtract());
        System.out.println("Multiplication: " + calc.multiply());
        System.out.println("Division: " + calc.divide());

        input.close();
    }
}
