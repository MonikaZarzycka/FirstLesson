package mainOOP;

public class TextMain {
    public static void main(String[] args) {

            UpperCaseTextFormatter upperCaseTextFormatter = new UpperCaseTextFormatter();
            System.out.println(upperCaseTextFormatter.formatText("Some Text"));
            LowerCaseTextFormatter lowerCaseTextFormatter = new LowerCaseTextFormatter();
            System.out.println(lowerCaseTextFormatter.formatText("Some Other Text"));
    }
}
