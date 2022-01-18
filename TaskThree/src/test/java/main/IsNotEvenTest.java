package main;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsNotEvenTest {

    @Test
    void should1BeTrue(){
        //given
        int value = 1;

        //when
        boolean number = IsNotEven.notEvenNumber(value);

        //then
        assertTrue(number);
    }

    @Test
    void should2BeFalse(){
        //given
        int value = 2;

        //when
        boolean number = IsNotEven.notEvenNumber(value);

        //then
        assertFalse(number);
    }

    @Test
    void shouldZeroBeFalse(){
        //given
        int value = 0;

        //when
        boolean number = IsNotEven.notEvenNumber(value);

        //then
        assertFalse(number);
    }
    
    @Test
    void shouldIntegerMaxBeTrue(){
        //given
        int value = Integer.MAX_VALUE;

        //when
        boolean number = IsNotEven.notEvenNumber(value);

        //then
        assertTrue(number);
    }

    @Test
    void shouldIntegerMinBeFalse(){
        //given
        int value = Integer.MIN_VALUE;

        //when
        boolean number = IsNotEven.notEvenNumber(value);

        //then
        assertFalse(number);
    }

    @Test
    void shouldIntegerMaxPlusOneBeFalse(){
        //given
        int value = Integer.MAX_VALUE;
        int value2 =1;

        //when
        boolean number = IsNotEven.notEvenNumber(value+value2);

        //then
        assertFalse(number);
    }

    @Test
    void shouldIntegerMinPlusOneBeTrue(){
        //given
        int value = Integer.MIN_VALUE;
        int value2 = 1;

        //when
        boolean number = IsNotEven.notEvenNumber(value+ value2);

        //then
        assertTrue(number);
    }

    @Test
    void shouldTwoIntegerMaxBeFalse(){
        //given
        int value = Integer.MAX_VALUE;
        int value2 =Integer.MAX_VALUE;

        //when
        boolean number = IsNotEven.notEvenNumber(value+value2);

        //then
        assertFalse(number);
    }

    @Test
    void shouldIntegerMinAndMaxBeTrue(){
        //given
        int value = Integer.MIN_VALUE;
        int value2 =Integer.MAX_VALUE;

        //when
        boolean number = IsNotEven.notEvenNumber(value+value2);

        //then
        assertTrue(number);
    }

}