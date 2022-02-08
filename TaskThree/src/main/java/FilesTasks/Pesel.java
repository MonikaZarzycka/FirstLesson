package FilesTasks;

import java.util.Scanner;

public class Pesel {

    public static void checkPesel(String pesel) {

        if (!pesel.matches("[0-9]+")) {
            throw new WrongTypeOfDataException("Only numbers here.");
        }

        if (pesel.length() != 11) {
            throw new IllegalLengthException("PESEL sould have eleven numbers.");
        }
    }

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            String pesel = scanner.next();
            Pesel.checkPesel(pesel);
        } catch (WrongTypeOfDataException typeOfDataException) {
            System.out.println(typeOfDataException.getMessage());
        } catch (IllegalLengthException lengthException) {
            System.out.println(lengthException.getMessage());
        }

    }

}
