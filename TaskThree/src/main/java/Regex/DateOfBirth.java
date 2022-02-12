package Regex;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class DateOfBirth {

    private static LocalDate parseDate(String birthDate) {
        return LocalDate.parse(birthDate);
    }

    private static DayOfWeek computeDayOfWeek(LocalDate date) {
        return date.getDayOfWeek();
    }

    private static int weekOfYear(LocalDate date) {
        return (date.getDayOfYear() / 7) + 1;
    }

    private static int computeAge(LocalDate date) {
        LocalDate dateNow = LocalDate.now();
        return dateNow.getYear() - date.getYear();
    }

    public static void main(String[] args) {

        String birthDate = "2001-10-01";
        LocalDate dateParsed = parseDate(birthDate);

        System.out.println(computeAge(dateParsed)+" years");
        System.out.println(computeDayOfWeek(dateParsed));
        System.out.println(weekOfYear(dateParsed));
    }
}
