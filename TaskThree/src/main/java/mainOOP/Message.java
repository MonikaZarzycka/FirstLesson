package mainOOP;

public abstract class Message {

    public abstract String getMessage();

}

class WindowMessage extends Message{

    @Override
    public String getMessage() {
        return "This is class WindowMessage";

    }
}

class ConsoleMessage extends Message {

    @Override
    public String getMessage() {

        return "This is class ConsoleMessage";
    }
}

class MainMessage{

    public static void main(String[] args) {
        ConsoleMessage consoleMessage = new ConsoleMessage();
        System.out.println(consoleMessage.getMessage());
        WindowMessage windowMessage = new WindowMessage();
        System.out.println(windowMessage.getMessage());
    }
}