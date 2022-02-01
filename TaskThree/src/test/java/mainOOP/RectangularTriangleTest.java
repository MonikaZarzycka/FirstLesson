package mainOOP;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangularTriangleTest {

    @Test
    void shouldReturnTrueWhen3_4_5() {
        //given
        RectangularTriangle rectangularTriangle = new RectangularTriangle(3,4,5);
        boolean result;
        //when
        result = RectangularTriangle.pythagoreanTheorem();
        //then
        assertTrue(result);
    }

    @Test
    void shouldReturnTrueWhen4_3_5() {
        //given
        RectangularTriangle rectangularTriangle = new RectangularTriangle(4,3,5);
        boolean result;
        //when
        result = RectangularTriangle.pythagoreanTheorem();
        //then
        assertTrue(result);
    }

    @Test
    void shouldReturnFalseWhen5_4_3() {
        //given
        RectangularTriangle rectangularTriangle = new RectangularTriangle(5, 4, 3);
        boolean result;
        //when
        result = RectangularTriangle.pythagoreanTheorem();
        //then
        assertFalse(result);
    }

    @Test
    void shouldReturnFalseWhen4_5_3() {
        //given
        RectangularTriangle rectangularTriangle = new RectangularTriangle(4, 5, 3);
        boolean result;
        //when
        result = RectangularTriangle.pythagoreanTheorem();
        //then
        assertFalse(result);
    }

    @Test
    void shouldReturnTrueWhen18_80_82() {
        //given
        RectangularTriangle rectangularTriangle = new RectangularTriangle(18, 80, 82);
        boolean result;
        //when
        result = RectangularTriangle.pythagoreanTheorem();
        //then
        assertTrue(result);
    }

    @Test
    void shouldReturnFalseWhen0All() {
        //given
        RectangularTriangle rectangularTriangle = new RectangularTriangle(0, 0, 0);
        boolean result;
        //when
        result = RectangularTriangle.pythagoreanTheorem();
        //then
        assertFalse(result);
    }

    @Test
    void shouldReturnFalseWhenFirstIs0() {
        //given
        RectangularTriangle rectangularTriangle = new RectangularTriangle(5, 0, 5);
        boolean result;
        //when
        result = RectangularTriangle.pythagoreanTheorem();
        //then
        assertFalse(result);
    }

    @Test
    void shouldReturnFalseWhenSecondIs0() {
        //given
        RectangularTriangle rectangularTriangle = new RectangularTriangle(4, 4, 0);
        boolean result;
        //when
        result = RectangularTriangle.pythagoreanTheorem();
        //then
        assertFalse(result);
    }

    @Test
    void shouldReturnFalseWhenHypotenuse0() {
        //given
        RectangularTriangle rectangularTriangle = new RectangularTriangle(0, 4, 3);
        boolean result;
        //when
        result = RectangularTriangle.pythagoreanTheorem();
        //then
        assertFalse(result);
    }

    @Test
    void shouldReturnFalseWhenMaxIntegerAndMinInteger() {
        //given
        RectangularTriangle rectangularTriangle = new RectangularTriangle(Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        boolean result;
        //when
        result = RectangularTriangle.pythagoreanTheorem();
        //then
        assertFalse(result);
    }


}