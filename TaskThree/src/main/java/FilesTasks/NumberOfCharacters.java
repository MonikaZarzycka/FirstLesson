package FilesTasks;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class NumberOfCharacters {


    public static void calculateNumberOfCharacters(String filePath) throws IOException {

        String text = Files.readString(Path.of(filePath ));
        System.out.println(text.length());
    }

    public static void main(String[] args) throws IOException {
        NumberOfCharacters.calculateNumberOfCharacters( "src/main/resources/data.txt");
    }
}