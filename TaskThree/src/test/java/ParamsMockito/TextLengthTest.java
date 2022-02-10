package ParamsMockito;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.NullSource;
import java.util.stream.Stream;

class TextLengthTest {

    @ParameterizedTest
    @MethodSource("provideSampleTexts")
    void shouldVerifyTextLength(String input, int expected) {
        //given, when
        int actual = TextLength.getTextLength(input);
        //then
        Assertions.assertEquals(expected, actual);
    }

    private static Stream<Arguments> provideSampleTexts() {
        return Stream.of(
                Arguments.of("Text", 4),
                Arguments.of("", 0),
                Arguments.of("ReallyLongTextToTest", 20)
        );
    }

    @ParameterizedTest
    @NullSource
    void shouldReturnZeroLengthForNull (String input){
        //given, when
        int actual = TextLength.getTextLength(input);
        int expected = 0;
        //then
        Assertions.assertEquals(expected, actual);
    }

}