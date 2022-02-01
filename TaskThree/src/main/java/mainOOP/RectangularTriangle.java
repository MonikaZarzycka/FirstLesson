package mainOOP;
import java.lang.Math;
public class RectangularTriangle {

    private static int hypotenuse;
    private static int firstCathetus;
    private static int secondCathetus;

    public RectangularTriangle(int hypotenuse, int firstCathetus, int secondCathetus) {
        RectangularTriangle.hypotenuse=hypotenuse;
        RectangularTriangle.firstCathetus=firstCathetus;
        RectangularTriangle.secondCathetus=secondCathetus;
    }

    public static int getHypotenuse() {
        return hypotenuse;
    }

    public static int getFirstCathetus() {
        return firstCathetus;
    }

    public static int getSecondCathetus() {
        return secondCathetus;
    }

    public static boolean isNotNegative(boolean is){
        return hypotenuse > 0 && firstCathetus > 0 && secondCathetus > 0;
    }

    public static boolean PythagoreanTheorem() {
        return isNotNegative(true) && hypotenuse * hypotenuse == firstCathetus * firstCathetus + secondCathetus * secondCathetus;
    }
}
