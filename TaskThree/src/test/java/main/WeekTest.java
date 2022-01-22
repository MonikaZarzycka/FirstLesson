package main;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WeekTest {

    @Test
    void shouldSayMonday() {
        //given
        int value = 1;

        //when
        int result = Week.printWeek(1);

        //then
        assertEquals(value, result);
    }

    @Test
    void shouldSayTuesday() {
        //given
        int value = 2;

        //when
        int result = Week.printWeek(2);

        //then
        assertEquals(value, result);
    }

    @Test
    void shouldSayWednesday() {
        //given
        int value = 3;

        //when
        int result = Week.printWeek(3);

        //then
        assertEquals(value, result);
    }

    @Test
    void shouldSayThursday() {
        //given
        int value = 4;

        //when
        int result = Week.printWeek(4);

        //then
        assertEquals(value, result);
    }

    @Test
    void shouldSayFriday() {
        //given
        int value = 5;

        //when
        int result = Week.printWeek(5);

        //then
        assertEquals(value, result);
    }

    @Test
    void shouldSayWeekendWhen6() {
        //given
        int value = 6;

        //when
        int result = Week.printWeek(6);

        //then
        assertEquals(value, result);
    }

    @Test
    void shouldSayWeekendWhen7() {
        //given
        int value = 7;

        //when
        int result = Week.printWeek(7);

        //then
        assertEquals(value, result);
    }

    @Test
    void shouldSayThereIsNoSuchADay() {
        //given
        int value = 8;

        //when
        int result = Week.printWeek(8);

        //then
        assertEquals(value, result);
    }

    @Test
    void shouldSayThereIsNoSuchADayWhen0() {
        //given
        int value = 0;

        //when
        int result = Week.printWeek(0);

        //then
        assertEquals(value, result);
    }

    @Test
    void shouldSayThereIsNoSuchADayMinus1() {
        //given
        int value = -1;

        //when
        int result = Week.printWeek(-1);

        //then
        assertEquals(value, result);
    }

    @Test
    void shouldSayThereIsNoSuchADayWhenMinInteger() {
        //given
        int value = Integer.MIN_VALUE;

        //when
        int result = Week.printWeek(Integer.MIN_VALUE);

        //then
        assertEquals(value, result);
    }

    @Test
    void shouldSayThereIsNoSuchADayWhenMaxInteger() {
        //given
        int value = Integer.MAX_VALUE;

        //when
        int result = Week.printWeek(Integer.MAX_VALUE);

        //then
        assertEquals(value, result);
    }
}