package FilesTasks;

public class Text {

    private final String someText;

    public Text(String someText) {
        this.someText = someText;
        if (someText.length() == 0)
            System.exit(0);
    }

    public boolean Palindrome() {
        boolean isItPalindrome = true;
        int frontOfText = 0;
        int endOfText = someText.length() - 1;

        while (frontOfText < endOfText) {
            if (someText.charAt(frontOfText) != someText.charAt(endOfText)) {
                isItPalindrome = false;
                break;
            }
            frontOfText++;
            endOfText--;
        }
        return isItPalindrome;
    }

    public int sumOfLength() {
        return someText.length();
    }
}