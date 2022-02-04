package mainOOP;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SecondFormatTest {

    @Test
    void shouldBeTheSame(){
        //given
        SecondFormat secondFormat = new SecondFormat();
        //when
        String result = secondFormat.formatText("text");
        //then
        assertEquals("text", result);
    }

    @Test
    void shouldBeLowerCase(){
        //given
        SecondFormat secondFormat = new SecondFormat();
        //when
        String result = secondFormat.formatText("Split TEXT");
        //then
        assertEquals("split text", result);
    }

    @Test
    void shouldBeLowerCaseWhenRandom(){
        //given
        SecondFormat secondFormat = new SecondFormat();
        //when
        String result = secondFormat.formatText("SoMe WeiRD TExT");
        //then
        assertEquals("some weird text", result);
    }

    @Test
    void shouldBeLowerCaseWhenNormalAndUpper(){
        //given
        SecondFormat secondFormat = new SecondFormat();
        //when
        String result = secondFormat.formatText("Split TEXT");
        //then
        assertEquals("split text", result);
    }

    @Test
    void shouldBeLowerCaseWhenTextIsUpperCase(){
        //given
        SecondFormat secondFormat = new SecondFormat();
        //when
        String result = secondFormat.formatText("Certain Text Is Formatted");
        //then
        assertEquals("certain text is formatted", result);
    }



}