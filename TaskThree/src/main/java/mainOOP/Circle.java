package mainOOP;

class Circle extends Shape{

    private int r;
    private final double pi = Math.PI;

    public Circle(int r) {
        this.r = r;
    }

    @Override
    public double getArea() {
        return pi*(r*r);
    }

    @Override
    public double getPerimeter() {
        return 2*pi*r;
    }
}