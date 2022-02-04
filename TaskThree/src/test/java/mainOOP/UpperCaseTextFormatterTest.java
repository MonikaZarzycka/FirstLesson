package mainOOP;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UpperCaseTextFormatterTest {

    @Test
    void shouldBeTheSame(){
        //given
        UpperCaseTextFormatter upperCaseTextFormatter = new UpperCaseTextFormatter();
        //when
        String result = upperCaseTextFormatter.formatText("TEXT");
        //then
        assertEquals("TEXT", result);
    }

    @Test
    void shouldBeUpperCase(){
        //given
        UpperCaseTextFormatter upperCaseTextFormatter = new UpperCaseTextFormatter();
        //when
        String result = upperCaseTextFormatter.formatText("Split TEXT");
        //then
        assertEquals("SPLIT TEXT", result);
    }

    @Test
    void shouldBeUpperCaseWhenRandom(){
        //given
        UpperCaseTextFormatter upperCaseTextFormatter = new UpperCaseTextFormatter();
        //when
        String result = upperCaseTextFormatter.formatText("SoMe WeiRD TExT");
        //then
        assertEquals("SOME WEIRD TEXT", result);
    }

    @Test
    void shouldBeUpperCaseWhenNormalAndUpper(){
        //given
        UpperCaseTextFormatter upperCaseTextFormatter = new UpperCaseTextFormatter();
        //when
        String result = upperCaseTextFormatter.formatText("Split TEXT");
        //then
        assertEquals("SPLIT TEXT", result);
    }

    @Test
    void shouldBeUpperCaseWhenFirstLetterIsBig(){
        //given
        UpperCaseTextFormatter upperCaseTextFormatter = new UpperCaseTextFormatter();
        //when
        String result = upperCaseTextFormatter.formatText("Certain Text Is Formatted");
        //then
        assertEquals("CERTAIN TEXT IS FORMATTED", result);
    }


}