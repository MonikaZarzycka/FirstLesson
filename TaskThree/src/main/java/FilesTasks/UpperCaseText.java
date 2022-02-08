package FilesTasks;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class UpperCaseText {

    private static final String filePath = "src/main/resources/";

    public static void convertToCapitalLetters(String nameOfInputFile, String nameOfOutputFile) throws IOException {

        String text = Files.readString(Path.of(filePath + nameOfInputFile));
        text = text.toUpperCase();
        Files.write(Path.of(filePath + nameOfOutputFile), text.getBytes(StandardCharsets.UTF_8));
    }
}

