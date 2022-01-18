package main;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsNotEvenTest {

    @Test
    void should1BeNotEven(){
        //given
        int value = 1;

        //when
        boolean number = IsNotEven.notEvenNumber(value);

        //then
        assertTrue(number);
    }

    @Test
    void should2ShowFalseIfNotEven(){
        //given
        int value = 2;

        //when
        boolean number = IsNotEven.notEvenNumber(value);

        //then
        assertFalse(number);
    }
    
    @Test
    void shouldIntegerMaxBeNotEven(){
        //given
        int value = Integer.MAX_VALUE;

        //when
        boolean number = IsNotEven.notEvenNumber(value);

        //then
        assertTrue(number);
    }

    @Test
    void shouldIntegerMaxPlusOneBeNotEven(){
        //given
        int value = Integer.MAX_VALUE;
        int value2 = 2;

        //when
        boolean number = IsNotEven.notEvenNumber(value+value2);

        //then
        assertTrue(number);
    }

    @Test
    void shouldTwoIntegerMaxValueShowFalseIfNotEven(){
        //given
        int value = Integer.MAX_VALUE;
        int value2 = Integer.MAX_VALUE;

        //when
        boolean number = IsNotEven.notEvenNumber(value+value2);

        //then
        assertFalse(number);
    }

    @Test
    void shouldMinIntegerShowFalseIfNotEven(){
        //given
        int value = Integer.MIN_VALUE;

        //when
        boolean number = IsNotEven.notEvenNumber(value);

        //then
        assertFalse(number);
    }

}