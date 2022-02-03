package mainOOP;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleGeometryTest {
    @Test
    void shouldAreaBe0WhenAAndBIs0(){
        //given
        RectangleGeometry rectangleGeometry = new RectangleGeometry();
        double result;
        rectangleGeometry.setA(0);
        rectangleGeometry.setB(0);
        //when
        result=rectangleGeometry.figureArea();
        //then
        assertEquals(0, result);
    }

    @Test
    void shouldAreaBe0WhenAIs0(){
        //given
        RectangleGeometry rectangleGeometry = new RectangleGeometry();
        double result;
        rectangleGeometry.setA(0);
        rectangleGeometry.setB(2);
        //when
        result=rectangleGeometry.figureArea();
        //then
        assertEquals(0, result);
    }

    @Test
    void shouldAreaBe0WhenBIs0(){
        //given
        RectangleGeometry rectangleGeometry = new RectangleGeometry();
        double result;
        rectangleGeometry.setA(2);
        rectangleGeometry.setB(0);
        //when
        result=rectangleGeometry.figureArea();
        //then
        assertEquals(0, result);
    }

    @Test
    void shouldAreaBe6(){
        //given
        RectangleGeometry rectangleGeometry = new RectangleGeometry();
        double result;
        rectangleGeometry.setA(2);
        rectangleGeometry.setB(3);
        //when
        result=rectangleGeometry.figureArea();
        //then
        assertEquals(6, result);
    }

    @Test
    void shouldAreaBe2WhenA0_5(){
        //given
        RectangleGeometry rectangleGeometry = new RectangleGeometry();
        double result;
        rectangleGeometry.setA(0.5);
        rectangleGeometry.setB(4);
        //when
        result=rectangleGeometry.figureArea();
        //then
        assertEquals(2, result);
    }

    @Test
    void shouldAreaBe2WhenBIs0_5(){
        //given
        RectangleGeometry rectangleGeometry = new RectangleGeometry();
        double result;
        rectangleGeometry.setA(4);
        rectangleGeometry.setB(0.5);
        //when
        result=rectangleGeometry.figureArea();
        //then
        assertEquals(2, result);
    }

    @Test
    void shouldPerimeterBe0WhenAAndB0(){
        //given
        RectangleGeometry rectangleGeometry = new RectangleGeometry();
        double result;
        rectangleGeometry.setA(0);
        rectangleGeometry.setB(0);
        //when
        result=rectangleGeometry.figurePerimeter();
        //then
        assertEquals(0, result);
    }

    @Test
    void shouldPerimeterBe0WhenA0(){
        //given
        RectangleGeometry rectangleGeometry = new RectangleGeometry();
        double result;
        rectangleGeometry.setA(0);
        rectangleGeometry.setB(2);
        //when
        result=rectangleGeometry.figurePerimeter();
        //then
        assertEquals(0, result);
    }


    @Test
    void shouldPerimeterBe0WhenB0(){
        //given
        RectangleGeometry rectangleGeometry = new RectangleGeometry();
        double result;
        rectangleGeometry.setA(2);
        rectangleGeometry.setB(0);
        //when
        result=rectangleGeometry.figurePerimeter();
        //then
        assertEquals(0, result);
    }

    @Test
    void shouldPerimeterBe4(){
        //given
        RectangleGeometry rectangleGeometry = new RectangleGeometry();
        double result;
        rectangleGeometry.setA(1);
        rectangleGeometry.setB(1);
        //when
        result=rectangleGeometry.figurePerimeter();
        //then
        assertEquals(4, result);
    }

    @Test
    void shouldPerimeterBe2_8(){
        //given
        RectangleGeometry rectangleGeometry = new RectangleGeometry();
        double result;
        rectangleGeometry.setA(0.5);
        rectangleGeometry.setB(0.9);
        //when
        result=rectangleGeometry.figurePerimeter();
        //then
        assertEquals(2.8, result);
    }

}