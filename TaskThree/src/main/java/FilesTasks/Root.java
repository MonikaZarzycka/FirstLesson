package FilesTasks;

public class Root {

    public static double getRoot(double number) {

        if (number >= 0) {
            return Math.pow(number, 0.5);
        }
        throw new IllegalArgumentException("There can't be zero here");
    }


    public static void main(String[] args) {

        System.out.println(getRoot(5));
    }
}
