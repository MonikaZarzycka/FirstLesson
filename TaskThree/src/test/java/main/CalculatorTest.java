package main;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void shouldAddNumbersForSum(){
        //given
        int valueOne = 2;
        int valueTwo = 2;

        //when
        long result = Calculator.sum(valueOne,valueTwo);

        //then
        assertEquals(4, result);
    }

    @Test
    void shouldAddMaxNumbersForSum(){
        //given
        int valueOne = 1;
        int valueTwo = Integer.MAX_VALUE;

        //when
        long result = Calculator.sum(valueOne,valueTwo);

        //then
        assertEquals(2147483648L, result);

    }

    @Test
    void shouldAddNumbersForSubtract(){
        //given
        int valueOne = 2;
        int valueTwo = 1;

        //when
        long result = Calculator.subtract(valueOne,valueTwo);

        //then
        assertEquals(1, result);

    }

    @Test
    void shouldAddTheSmallestNumbersForSubtract(){
        //given
        int valueOne = Integer.MIN_VALUE;
        int valueTwo = 1;

        //when
        long result = Calculator.subtract(valueOne,valueTwo);

        //then
        assertEquals(-2147483649L, result);

    }

    @Test
    void shouldAddNumbersForMultiply(){
        //given
        int valueOne = 3;
        int valueTwo = 3;

        //when
        long result = Calculator.multiply(valueOne,valueTwo);

        //then
        assertEquals(9, result);

    }

    @Test
    void shouldAddMaxNumbersForMultiply(){
        //given
        int valueOne = Integer.MAX_VALUE;
        int valueTwo = Integer.MAX_VALUE;

        //when
        long result = Calculator.multiply(valueOne,valueTwo);

        //then
        assertEquals(2147483647L*2147483647L, result);

    }

    @Test
    void shouldAddMaxAndMinNumbersForMultiply(){
        //given
        int valueOne = Integer.MIN_VALUE;
        int valueTwo = Integer.MAX_VALUE;

        //when
        long result = Calculator.multiply(valueOne,valueTwo);

        //then
        assertEquals(-2147483648L*2147483647L, result);

    }

    @Test
    void shouldAddNumbersForDivide(){
        //given
        int valueOne = 6;
        int valueTwo = 3;

        //when
        double result = Calculator.divide(valueOne,valueTwo);

        //then
        assertEquals(2, result);

    }

    @Test
    void shouldAddMinAndMaxIntegersNumbersForDivide(){
        //given
        int valueOne = Integer.MIN_VALUE;
        int valueTwo = Integer.MAX_VALUE;

        //when
        double result = Calculator.divide(valueOne,valueTwo);

        //then
        assertEquals(-2147483648D/2147483647D, result);

    }

    @Test
    void shouldAddMaxAndMinIntegersNumbersForDivide(){
        //given
        int valueOne = Integer.MAX_VALUE;
        int valueTwo = Integer.MIN_VALUE;

        //when
        double result = Calculator.divide(valueOne,valueTwo);

        //then
        assertEquals(2147483647D/-2147483648D, result);

    }

    @Test
    void shouldAddZeroAndMaxNumberForDivide(){
        //given
        int valueOne = 0;
        int valueTwo = Integer.MAX_VALUE;

        //when
        double result = Calculator.divide( valueOne,valueTwo);

        //then
        assertEquals(0, result);

    }
    @Test
    void shouldAddTwoZeroForDivide(){
        //given
        int valueOne = 0;
        int valueTwo = 0;

        //when
        double result = Calculator.divide( valueOne,valueTwo);

        //then
        assertEquals(0, result);

    }

    @Test
    void shouldAddMaxNumberAndZeroForDivide(){
        //given
        int valueOne = Integer.MIN_VALUE;
        int valueTwo = 0;

        //when
        double result = Calculator.divide( valueOne, valueTwo);

        //then
        assertEquals(404, result);

    }
}