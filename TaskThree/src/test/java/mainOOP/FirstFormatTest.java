package mainOOP;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstFormatTest {

    @Test
    void shouldBeTheSame(){
        //given
        FirstFormat firstFormat = new FirstFormat();
        //when
        String result = firstFormat.formatText("TEXT");
        //then
        assertEquals("TEXT", result);
    }

    @Test
    void shouldBeUpperCase(){
        //given
        FirstFormat firstFormat = new FirstFormat();
        //when
        String result = firstFormat.formatText("Split TEXT");
        //then
        assertEquals("SPLIT TEXT", result);
    }

    @Test
    void shouldBeUpperCaseWhenRandom(){
        //given
        FirstFormat firstFormat = new FirstFormat();
        //when
        String result = firstFormat.formatText("SoMe WeiRD TExT");
        //then
        assertEquals("SOME WEIRD TEXT", result);
    }

    @Test
    void shouldBeUpperCaseWhenNormalAndUpper(){
        //given
        FirstFormat firstFormat = new FirstFormat();
        //when
        String result = firstFormat.formatText("Split TEXT");
        //then
        assertEquals("SPLIT TEXT", result);
    }

    @Test
    void shouldBeUpperCaseWhenFirstLetterIsBig(){
        //given
        FirstFormat firstFormat = new FirstFormat();
        //when
        String result = firstFormat.formatText("Certain Text Is Formatted");
        //then
        assertEquals("CERTAIN TEXT IS FORMATTED", result);
    }


}