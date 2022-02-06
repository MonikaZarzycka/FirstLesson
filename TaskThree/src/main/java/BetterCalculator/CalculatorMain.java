package BetterCalculator;

public class CalculatorMain {
    public static void main(String[] args) {

        Sum sum = new Sum(2, 2);
        Subtract subtract = new Subtract(4,2);
        Multiply multiply = new Multiply(3, 2);
        Divide divide = new Divide(6, 3);

        System.out.println(sum.getResult());
        System.out.println(subtract.getResult());
        System.out.println(multiply.getResult());
        System.out.println(divide.getResult());
    }
}