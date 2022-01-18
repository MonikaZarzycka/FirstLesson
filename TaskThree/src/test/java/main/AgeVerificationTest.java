package main;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AgeVerificationTest {

    @Test
    void shouldSay18isTrue(){
        //given
        byte value = 18;

        //when
        boolean yourAge = AgeVerification.age(value);

        //then
        assertTrue(yourAge);
    }

    @Test
    void shouldSay19isTrue(){
        //given
        byte value = 19;

        //when
        boolean yourAge = AgeVerification.age(value);

        //then
        assertTrue(yourAge);
    }

    @Test
    void shouldSay17isFalse(){
        //given
        byte value = 17;

        //when
        boolean yourAge = AgeVerification.age(value);

        //then
        assertFalse(yourAge);
    }

    @Test
    void shouldSayMaxValueIsTrue(){
        //given
        byte value = Byte.MAX_VALUE;

        //when
        boolean yourAge = AgeVerification.age(value);

        //then
        assertTrue(yourAge);
    }

    @Test
    void shouldSayMinValueIsFalse(){
        //given
        byte value = Byte.MIN_VALUE;

        //when
        boolean yourAge = AgeVerification.age(value);

        //then
        assertFalse(yourAge);


    }

    @Test
    void shouldSayZeroIsFalse(){
        //given
        byte value = 0;

        //when
        boolean yourAge = AgeVerification.age(value);

        //then
        assertFalse(yourAge);
    }
}