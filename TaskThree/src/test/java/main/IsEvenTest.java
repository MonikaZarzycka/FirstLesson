package main;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class IsEvenTest {
    @Test
    void should2BeTrue(){
        //given
        int value = 2;

        //when
        boolean number = IsEven.evenNumber(value);

        //then
        assertTrue(number);
    }

    @Test
    void should1BeFalse(){
        //given
        int value = 1;

        //when
        boolean number = IsEven.evenNumber(value);

        //then
        assertFalse(number);
    }

    @Test
    void shouldZeroBeTrue(){
        //given
        int value = 0;

        //when
        boolean number = IsEven.evenNumber(value);

        //then
        assertTrue(number);
    }

    @Test
    void shouldIntegerMaxBeFalse(){
        //given
        int value = Integer.MAX_VALUE;

        //when
        boolean number = IsEven.evenNumber(value);

        //then
        assertFalse(number);
    }

    @Test
    void shouldIntegerMinBeTrue(){
        //given
        int value = Integer.MIN_VALUE;

        //when
        boolean number = IsEven.evenNumber(value);

        //then
        assertTrue(number);
    }

    @Test
    void shouldIntegerMaxPlusOneBeTrue(){
        //given
        int value = Integer.MAX_VALUE;
        int value2 = 1;

        //when
        boolean number = IsEven.evenNumber(value+value2);

        //then
        assertTrue(number);
    }

    @Test
    void shouldIntegerMinPlusOneBeFalse(){
        //given
        int value = Integer.MIN_VALUE;
        int value2 = 1;

        //when
        boolean number = IsEven.evenNumber(value+value2);

        //then
        assertFalse(number);
    }

    @Test
    void shouldTwoIntegerMaxBeTrue(){
        //given
        int value = Integer.MAX_VALUE;
        int value2 = Integer.MAX_VALUE;

        //when
        boolean number = IsEven.evenNumber(value+value2);

        //then
        assertTrue(number);
    }

    @Test
    void shouldIntegerMaxAndMinBeFalse(){
        //given
        int value = Integer.MAX_VALUE;
        int value2 = Integer.MIN_VALUE;

        //when
        boolean number = IsEven.evenNumber(value+value2);

        //then
        assertFalse(number);
    }
}
