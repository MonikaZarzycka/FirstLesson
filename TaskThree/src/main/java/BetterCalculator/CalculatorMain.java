package BetterCalculator;

public class CalculatorMain {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.sum(2, 2));
        System.out.println(calculator.subtract(4, 2));
        System.out.println(calculator.multiply(3, 2));
        System.out.println(calculator.divide(6, 3));
    }
}