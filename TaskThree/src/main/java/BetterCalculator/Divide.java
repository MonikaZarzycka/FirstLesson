package BetterCalculator;

public class Divide implements TheResult {

    private int a;
    private int b;

    public Divide(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double getResult() {
        if (b != 0) {
            return (double) a / b;
        } else if (a == 0) {
            return 0;
        } else {
            return 404;
        }
    }
}
