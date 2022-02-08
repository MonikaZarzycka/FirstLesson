package FilesTasks;

public class TextMain {
    public static void main(String[] args) {
        Text text = new Text("KamilslimaK");
        boolean isItPalindrome = text.Palindrome();
        System.out.println(isItPalindrome);

        int length = text.sumOfLength();
        System.out.println(length);
    }
}
