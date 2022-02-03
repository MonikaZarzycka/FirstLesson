package mainOOP;
import java.lang.Math;
public class RectangularTriangle {

    private int a;
    private int b;
    private int c;

    public RectangularTriangle(int a, int b, int c) {
        this.c=c;
        this.a=a;
        this.b=b;
    }

    public boolean isNotNegative(){
        return a > 0 && b > 0 && c > 0;
    }

    public boolean pythagoreanTheorem() {
        return isNotNegative() && a*a+b*b==c*c;
    }
}
class MathMain{
    public void main(String[] args) {
        RectangularTriangle rectangularTriangle = new RectangularTriangle(5,4,3);
        System.out.println(rectangularTriangle.pythagoreanTheorem());
    }
}