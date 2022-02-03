package mainOOP;

public class GeometryMain {
    public static void main(String[] args) {
        RectangleGeometry rectangleGeometry = new RectangleGeometry();
        SquareGeometry squareGeometry= new SquareGeometry();

        rectangleGeometry.setA(2);
        rectangleGeometry.setB(5);
        System.out.println(rectangleGeometry.figureArea());
        System.out.println(rectangleGeometry.figurePerimeter());

        squareGeometry.setA(2);
        System.out.println(squareGeometry.figureArea());
        System.out.println(squareGeometry.figurePerimeter());
    }
}
