package ParamsMockito;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

class NumbersTest {
    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6, 100, -16, 0})
    void shouldVerifyNumberIsEven(int input) {
        //given, when
        boolean isEven = Numbers.isEven(input);
        //then
        Assertions.assertTrue(isEven);
    }

    @ParameterizedTest
    @CsvSource(value = {"432 : 9", "14 : 5", "666 : 18", "-534 : 12", "-3345 : 15"}, delimiter = ':')
    void shouldVerifySumOfDigits(String input, String expected) {
        //given
        int actualValue = Integer.parseInt(input);
        int expectedValue = Integer.parseInt(expected);

        //when
        actualValue = Numbers.calcSumOfNumbers(actualValue);

        //then
        Assertions.assertEquals(expectedValue, actualValue);
    }
}