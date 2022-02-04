package mainOOP;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareGeometryTest {

    @Test
    void shouldAreaBe0(){
        //given
        SquareGeometry squareGeometry = new SquareGeometry();
        double result;
        squareGeometry.setA(0);
        //when
        result=squareGeometry.figureArea();
        //then
        assertEquals(0, result);
    }

    @Test
    void shouldAreaBe4(){
        //given
        SquareGeometry squareGeometry = new SquareGeometry();
        double result;
        squareGeometry.setA(2);
        //when
        result=squareGeometry.figureArea();
        //then
        assertEquals(4, result);
    }

    @Test
    void shouldAreaBe0_25(){
        //given
        SquareGeometry squareGeometry = new SquareGeometry();
        double result;
        squareGeometry.setA(0.5);
        //when
        result=squareGeometry.figureArea();
        //then
        assertEquals(0.25, result);
    }

    @Test
    void shouldPerimeterBe4(){
        //given
        SquareGeometry squareGeometry = new SquareGeometry();
        double result;
        squareGeometry.setA(1);
        //when
        result=squareGeometry.figurePerimeter();
        //then
        assertEquals(4, result);
    }

    @Test
    void shouldPerimeterBe0(){
        //given
        SquareGeometry squareGeometry = new SquareGeometry();
        double result;
        squareGeometry.setA(0);
        //when
        result=squareGeometry.figurePerimeter();
        //then
        assertEquals(0, result);
    }


    @Test
    void shouldPerimeterBe2(){
        //given
        SquareGeometry squareGeometry = new SquareGeometry();
        double result;
        squareGeometry.setA(0.5);
        //when
        result=squareGeometry.figurePerimeter();
        //then
        assertEquals(2, result);
    }



}