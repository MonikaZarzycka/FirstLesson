package mainOOP;

public class TextMain {
    public static void main(String[] args) {

            FirstFormat firstFormat = new FirstFormat();
            System.out.println(firstFormat.formatText("Some Text"));
            SecondFormat secondFormat = new SecondFormat();
            System.out.println(secondFormat.formatText("Some Other Text"));
    }
}
