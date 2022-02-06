package BetterCalculator;

public class Sum implements TheResult {

    private int a;
    private int b;

    public Sum(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double getResult() {
        return a + b;
    }
}
