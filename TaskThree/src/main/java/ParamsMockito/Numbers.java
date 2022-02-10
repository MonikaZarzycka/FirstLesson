package ParamsMockito;

public class Numbers {
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static int calcSumOfNumbers(int number) {
        int sum = 0;
        if (number < 0) {
            number = -number;
        }
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}