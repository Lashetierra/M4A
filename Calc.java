public class Calc {

    // Private data fields
    private double num1;
    private double num2;

    // Default constructor
    public Calc() {
        num1 = 0;
        num2 = 0;
    }

    // Accessor (getter) methods
    public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }

    // Mutator (setter) methods
    public void setNum1(double newNum1) {
        num1 = newNum1;
    }

    public void setNum2(double newNum2) {
        num2 = newNum2;
    }

    // Mathematical methods
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

    // toString method
    public String toString() {
        String output = "";
        output += "Num1: " + num1 + "\n";
        output += "Num2: " + num2;
        return output;
    }
}