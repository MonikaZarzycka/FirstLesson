package BetterCalculator;

public class Subtract implements TheResult {

    private int a;
    private int b;

    public Subtract(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double getResult() {
        return a - b;
    }
}
