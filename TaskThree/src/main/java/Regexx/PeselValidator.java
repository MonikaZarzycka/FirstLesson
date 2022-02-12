package Regexx;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PeselValidator {
    public static boolean checkPesel(String pesel) {
        Pattern pattern = Pattern.compile("\\d{11}");
        Matcher matcher = pattern.matcher(pesel);
        return matcher.matches();
    }

    public static void main(String[] args) {
        System.out.println(checkPesel("64333467864"));
    }
}