package main;

public class Calculator {
    public static long sum (int a, int b){
        return (long) a + b;
    }

    public static long subtract(int a, int b){
        return (long) a - b;
    }

    public static long multiply( int a, int b){
        return (long) a * b;
    }

    public static double divide(int a, int b) {
        if(b != 0) {
            return (double) a / b;
        }
        else if (a==0) {
            return 0;
        }
        else {
            return 404;
        }

    }
}
