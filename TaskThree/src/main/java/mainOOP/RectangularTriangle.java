package mainOOP;
import java.lang.Math;
public class RectangularTriangle {

    private static int a;
    private static int b;
    private static int c;

    public RectangularTriangle(int a, int b, int c) {
        RectangularTriangle.c=c;
        RectangularTriangle.a=a;
        RectangularTriangle.b=b;
    }

    public static boolean isNotNegative(){
        return a > 0 && b > 0 && c > 0;
    }

    public static boolean pythagoreanTheorem() {
        return isNotNegative() && a*a+b*b==c*c;
    }
}
class MathMain{
    public static void main(String[] args) {
        RectangularTriangle rectangularTriangle = new RectangularTriangle(5,4,3);
        System.out.println(RectangularTriangle.pythagoreanTheorem());
    }
}