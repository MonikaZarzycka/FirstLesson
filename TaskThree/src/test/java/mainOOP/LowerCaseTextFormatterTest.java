package mainOOP;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LowerCaseTextFormatterTest {

    @Test
    void shouldBeTheSame(){
        //given
        LowerCaseTextFormatter lowerCaseTextFormatter = new LowerCaseTextFormatter();
        //when
        String result = lowerCaseTextFormatter.formatText("text");
        //then
        assertEquals("text", result);
    }

    @Test
    void shouldBeLowerCase(){
        //given
        LowerCaseTextFormatter lowerCaseTextFormatter = new LowerCaseTextFormatter();
        //when
        String result = lowerCaseTextFormatter.formatText("Split TEXT");
        //then
        assertEquals("split text", result);
    }

    @Test
    void shouldBeLowerCaseWhenRandom(){
        //given
        LowerCaseTextFormatter lowerCaseTextFormatter = new LowerCaseTextFormatter();
        //when
        String result = lowerCaseTextFormatter.formatText("SoMe WeiRD TExT");
        //then
        assertEquals("some weird text", result);
    }

    @Test
    void shouldBeLowerCaseWhenNormalAndUpper(){
        //given
        LowerCaseTextFormatter lowerCaseTextFormatter = new LowerCaseTextFormatter();
        //when
        String result = lowerCaseTextFormatter.formatText("Split TEXT");
        //then
        assertEquals("split text", result);
    }

    @Test
    void shouldBeLowerCaseWhenTextIsUpperCase(){
        //given
        LowerCaseTextFormatter lowerCaseTextFormatter = new LowerCaseTextFormatter();
        //when
        String result = lowerCaseTextFormatter.formatText("Certain Text Is Formatted");
        //then
        assertEquals("certain text is formatted", result);
    }



}