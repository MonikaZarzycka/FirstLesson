package mainOOP;

public class FirstFormat implements TextFormatter{

    @Override
    public String formatText(String text) {
        return text.toUpperCase();
    }
}
