package mainOOP;

public abstract class Shape {

    public abstract float getArea();
    public abstract float getPerimeter();

}

class Triangle extends Shape{

   private int a;
   private int b;
   private int c;
   private int h;

    public Triangle(int a, int b, int c, int h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
    }

    @Override
    public float getArea() {
        return a/2*h;
    }

    @Override
    public float getPerimeter() {
        return a+b+c;
    }
}
class Circle extends Shape{

    private int r;
    private final float pi = (float) 3.14;

    public Circle(int r) {
        this.r = r;
    }

    @Override
    public float getArea() {
        return pi*(r*r);
    }

    @Override
    public float getPerimeter() {
        return 2*pi*r;
    }
}
class Rectangle extends Shape{

    private int a;
    private int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public float getArea() {
        return a*b;
    }

    @Override
    public float getPerimeter() {
        return a+a+b+b;
    }
}
class Square extends Rectangle{


    public Square(int a, int b) {
        super(a, b);

         boolean c = a == b;

    }

    @Override
    public float getArea() {
        return super.getArea();
    }

    @Override
    public float getPerimeter() {
        return super.getPerimeter();
    }
}