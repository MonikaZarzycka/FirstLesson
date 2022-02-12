package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UrlValidator {

    public static boolean urlValidator(String url) {
        Pattern pattern = Pattern.compile("(http|https)://(www\\.)?[a-z](.)+[a-z]{2,3}");
        Matcher matcher = pattern.matcher(url);
        return matcher.matches();
    }

    public static void main(String[] args) {
        System.out.println(urlValidator("http://www.onet.pl"));
        System.out.println(urlValidator("https://mail.google.com"));
        System.out.println(urlValidator("http://wiadmosci.onet.pl"));
        System.out.println(urlValidator("http://onet.pl"));
    }

}
