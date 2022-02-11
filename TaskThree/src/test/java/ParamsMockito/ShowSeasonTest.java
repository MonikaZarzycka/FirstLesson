package ParamsMockito;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.time.Month;

class SeasonCheckerTest {

    @ParameterizedTest
    @EnumSource(value = Month.class, names = {"DECEMBER", "JANUARY", "FEBRUARY"})
    void shouldReturnWinter(Month month) {
        //given, when
        Seasons expected = Seasons.WINTER;
        Seasons actual = ShowSeason.getSeason(month);
        //then
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @EnumSource(value = Month.class, names = {"MARCH", "APRIL", "MAY"})
    void shouldReturnSpring(Month month) {
        //given, when
        Seasons expected = Seasons.SPRING;
        Seasons actual = ShowSeason.getSeason(month);
        //then
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @EnumSource(value = Month.class, names = {"JUNE", "JULY", "AUGUST"})
    void shouldReturnSummer(Month month) {
        //given, when
        Seasons expected = Seasons.SUMMER;
        Seasons actual = ShowSeason.getSeason(month);
        //then
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @EnumSource(value = Month.class, names = {"SEPTEMBER", "OCTOBER", "NOVEMBER"})
    void shouldReturnAutumn(Month month) {
        //given, when
        Seasons expected = Seasons.AUTUMN;
        Seasons actual = ShowSeason.getSeason(month);
        //then
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @NullSource
    void shouldReturnEmptyStringForNull(Month month) {
        //given, when
        Seasons expected = Seasons.valueOf("");
        Seasons actual = ShowSeason.getSeason(month);
        //then
        Assertions.assertEquals(expected, actual);
    }
}