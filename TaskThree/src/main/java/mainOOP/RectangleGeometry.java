package mainOOP;

public class RectangleGeometry implements Geometry {
    private double a;
    private double b;

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }


    @Override
    public double figureArea() {
        if (a > 0 && b > 0) {
            return a * b;
        } else return 0;
    }

    @Override
    public double figurePerimeter() {
        if (a > 0 && b > 0) {
            return (a * 2) + (b * 2);
        } else return 0;
    }
}

