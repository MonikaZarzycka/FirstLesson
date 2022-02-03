package mainOOP;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConvertTest {

        @Test
        void shouldReturn60(){
            //given
            Convert convert= new Convert(1);
            long result;

            result = Convert.minutesToSeconds();
            //then
            assertEquals(60, result);
        }

        @Test
        void shouldHaveMaxInteger(){
            //given
            Convert convert= new Convert(Integer.MAX_VALUE);
            long result;

            result = Convert.minutesToSeconds();
            //then
            assertEquals(128849018820L, result);
        }

        @Test
        void shouldHaveMinInteger(){
            //given
            Convert convert= new Convert(Integer.MIN_VALUE);
            long result;

            result = Convert.minutesToSeconds();
            //then
            assertEquals(0, result);
        }

        @Test
        void shouldCheckZero(){
            //given
            Convert convert= new Convert(0);
            long result;

            result = Convert.minutesToSeconds();
            //then
            assertEquals(0, result);
        }



}