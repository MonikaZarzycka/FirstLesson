package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidator {

    private static final Pattern pattern = Pattern.compile("^(?=.*[0-9])(?=.*[A-Z])(?!.*?(?:2022|22)).{7,}$");

    public static boolean checkPassword(String password) {
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }

    public static void main(String[] args) {
        System.out.println(checkPassword("MonZar2001"));
        System.out.println(checkPassword("monzar2001"));
        System.out.println(checkPassword("MonZarMonZar"));
        System.out.println(checkPassword("MonZar"));
        System.out.println(checkPassword("MonZar2022"));
    }
}