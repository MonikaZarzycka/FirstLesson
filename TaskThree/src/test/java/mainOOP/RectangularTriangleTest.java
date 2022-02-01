package mainOOP;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangularTriangleTest {

    @Test
    void shouldReturnTrueWhen5_4_3(){
        //given
        RectangularTriangle rectangularTriangle=new RectangularTriangle(5,4,3);
        boolean result;
        //when
        result=RectangularTriangle.PythagoreanTheorem();
        //then
        assertTrue(result);
    }

    @Test
    void shouldReturnTrueWhen82_80_18(){
        //given
        RectangularTriangle rectangularTriangle=new RectangularTriangle(82,80,18);
        boolean result;
        //when
        result=RectangularTriangle.PythagoreanTheorem();
        //then
        assertTrue(result);
    }
    @Test
    void shouldReturnTrueWhen543(){
        //given
        RectangularTriangle rectangularTriangle=new RectangularTriangle(5,4,3);
        boolean result;
        //when
        result=RectangularTriangle.PythagoreanTheorem();
        //then
        assertTrue(result);
    }
    @Test
    void shouldReturnFalseWhen0All(){
        //given
        RectangularTriangle rectangularTriangle=new RectangularTriangle(0,0,0);
        boolean result;
        //when
        result=RectangularTriangle.PythagoreanTheorem();
        //then
        assertFalse(result);
    }
    @Test
    void shouldReturnFalseWhenFirstIs0(){
        //given
        RectangularTriangle rectangularTriangle=new RectangularTriangle(5,0,5);
        boolean result;
        //when
        result=RectangularTriangle.PythagoreanTheorem();
        //then
        assertFalse(result);
    }
    @Test
    void shouldReturnFalseWhenSecondIs0(){
        //given
        RectangularTriangle rectangularTriangle=new RectangularTriangle(4,4,0);
        boolean result;
        //when
        result=RectangularTriangle.PythagoreanTheorem();
        //then
        assertFalse(result);
    }
    @Test
    void shouldReturnFalseWhenHypotenuse0(){
        //given
        RectangularTriangle rectangularTriangle=new RectangularTriangle(0,4,3);
        boolean result;
        //when
        result=RectangularTriangle.PythagoreanTheorem();
        //then
        assertFalse(result);
    }
    @Test
    void shouldReturnFalseWhenMaxIntegerAndMinInteger(){
        //given
        RectangularTriangle rectangularTriangle=new RectangularTriangle(Integer.MAX_VALUE,Integer.MIN_VALUE,Integer.MAX_VALUE);
        boolean result;
        //when
        result=RectangularTriangle.PythagoreanTheorem();
        //then
        assertFalse(result);
    }



}