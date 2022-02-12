package JCollections;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class QueueTest {
    Queue queue = new Queue();
    Queue nullQueue = new Queue();

    @BeforeEach
    void setQueue(){
        queue.add(0);
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
    }

    @Test
    void shouldAddElement(){
        boolean added =queue.add(6);

        Assertions.assertTrue(added);
    }

    @Test
    void shouldCheckSize(){
        int size = queue.size();

        Assertions.assertEquals(6, size);
        }

    @Test
    void removeElement() {
        queue.remove();
        Integer newHead = queue.element();
        //then
        Assertions.assertEquals(5, queue.size());
        Assertions.assertEquals(1, newHead);
        }

    @Test
    void elementException() {
        try {
            nullQueue.remove();
            Assertions.fail("This method should throw NoSuchElementException");
        } catch (NoSuchElementException e) {
            String message = e.getMessage();
            boolean rightMessage = message.equals("Can not remove element from empty queue");
            Assertions.assertTrue(rightMessage);
        }
    }
    @Test
    void elementExceptionWithNullQueue() {
        //given, when
        try {
            nullQueue.element();
            Assertions.fail("This method should throw NoSuchElementException");
        } catch (NoSuchElementException e) {
            String message = e.getMessage();
            boolean rightMessage = message.equals("Can not retrieve element from empty queue");
            Assertions.assertTrue(rightMessage);
        }
    }

}