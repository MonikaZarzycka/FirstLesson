package Regex;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class PhoneBookTest {

    public PhoneBook phoneBook;

    @BeforeEach
    void setUp() {
        phoneBook = new PhoneBook();
    }

    @Test
    void printBook() {
        phoneBook.printBook();
    }

    @Test
    void getRecordWithoutPhoneNumber() throws Exception {
        Record record = phoneBook.getRecord("Ignacy Kwiatkowski");
        assertEquals("Ignacy Kwiatkowski", record.getFullName());
        assertEquals("Truskawkowa 23", record.getAddress());
        assertEquals(Optional.empty(), record.getPhoneNumber());
    }

    @Test
    void getRecordWithPhoneNumber() throws Exception {
        Record record = phoneBook.getRecord("Filip Wróblewski");
        assertEquals("Filip Wróblewski", record.getFullName());
        assertEquals("Kocia 9", record.getAddress());
        assertEquals("754583945", record.getPhoneNumber().get());
    }

    @Test
    void getExceptionIfKeyNotExist() {
        assertThrows(Exception.class, () -> {
            phoneBook.getRecord("Monika Zarzycka");
        });
    }
}