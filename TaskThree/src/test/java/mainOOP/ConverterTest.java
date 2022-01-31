package mainOOP;

import main.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConverterTest {
    @Test
    void shouldReturn60(){
        //given
        Converter converter= new Converter(1);
        long result;

        result = Converter.minutesToSeconds();
        //then
        assertEquals(60, result);
    }

    @Test
    void shouldHaveMaxInteger(){
        //given
        Converter converter= new Converter(Integer.MAX_VALUE);
        long result;

        result = Converter.minutesToSeconds();
        //then
        assertEquals(128849018820L, result);
    }

    @Test
    void shouldHaveMinInteger(){
        //given
        Converter converter= new Converter(Integer.MIN_VALUE);
        long result;

        result = Converter.minutesToSeconds();
        //then
        assertEquals(0, result);
    }

    @Test
    void shouldCheckZero(){
        //given
        Converter converter= new Converter(0);
        long result;

        result = Converter.minutesToSeconds();
        //then
        assertEquals(0, result);
    }

}