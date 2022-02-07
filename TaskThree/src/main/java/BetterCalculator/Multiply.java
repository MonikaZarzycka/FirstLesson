package BetterCalculator;

public class Multiply implements TheResult {

    private int a;
    private int b;

    public Multiply(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double getResult() {
        return a * b;
    }
}
