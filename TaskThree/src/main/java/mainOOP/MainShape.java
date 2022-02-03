package mainOOP;

class MainShape{

    public static void main(String[] args) {


        Triangle triangle = new Triangle(3, 5, 2, 6);
        System.out.println(triangle.getArea());
        System.out.println(triangle.getPerimeter());

        Circle circle = new Circle(2);
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());

        Rectangle rectangle=new Rectangle(3,7);
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());

        Square square= new Square(3,3);
        System.out.println(square.getArea());
        System.out.println(square.getPerimeter());
    }
}