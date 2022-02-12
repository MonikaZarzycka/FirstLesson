package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Numbers {
    private static boolean checkNumber(String regularExpression, String number) {
        Pattern pattern = Pattern.compile(regularExpression);
        Matcher matcher = pattern.matcher(number);

        return matcher.matches();
    }

    public static boolean isInt(String number) {
        return checkNumber("^-?\\d+$", number);
    }

    public static boolean isFloat(String number) {
        return checkNumber("^-?\\d+\\.\\d+$", number);
    }

    public static boolean isInScientificNotation(String number) {
        return checkNumber("^-?\\d+\\.?\\d*(e|E)(-|\\+)\\d+$", number);
    }


    public static void main(String[] args) {

        System.out.println(isInt("342"));
        System.out.println(isInt("756"));
        System.out.println(isInt("3457"));
        System.out.println(isInt("87"));
        System.out.println(isInt("2"));
        System.out.println(isInt("5"));
        System.out.println(isInt("1.234e+07"));
        System.out.println(isInt("7.234243E-02"));
        System.out.println(isInt("6.09"));
        System.out.println(isInt("1.0001"));
        System.out.println(isInt("5.34"));
        System.out.println();
        System.out.println(isFloat("5.34"));
        System.out.println(isFloat("6.09"));
        System.out.println(isFloat("1.0001"));
        System.out.println(isFloat("2"));
        System.out.println(isFloat("5"));
        System.out.println(isFloat("342"));
        System.out.println(isFloat("756"));
        System.out.println(isFloat("1.234e+07"));
        System.out.println(isFloat("7.234243E-02"));
        System.out.println(isFloat("3457"));
        System.out.println(isFloat("87"));
        System.out.println();

        System.out.println(isInScientificNotation("1.234e+07"));
        System.out.println(isInScientificNotation("7.234243E-02"));
        System.out.println(isInScientificNotation("6.09"));
        System.out.println(isInScientificNotation("3457"));
        System.out.println(isInScientificNotation("87"));
        System.out.println(isInScientificNotation("1.0001"));
        System.out.println(isInScientificNotation("2"));
        System.out.println(isInScientificNotation("5"));
        System.out.println(isInScientificNotation("342"));
        System.out.println(isInScientificNotation("5.34"));
        System.out.println(isInScientificNotation("756"));
    }
}