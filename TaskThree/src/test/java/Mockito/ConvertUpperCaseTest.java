package Mockito;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

class ConverterUpperCaseTest {

    @ParameterizedTest
    @ValueSource(strings = {"maRta", "Future Collars", "JavA"})
    void shouldVerifyTextIsConvertedToUpperCase(String input) {
        //given, when
        String expected = input.toUpperCase();
        String actual = ConvertUpperCase.convertToUpperCase(input);
        //then
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @NullAndEmptySource
    void shouldReturnEmptyString(String input) {
        //given, when
        String expected = "";
        String actual = ConvertUpperCase.convertToUpperCase(input);
        //then
        Assertions.assertEquals(expected, actual);
    }
}