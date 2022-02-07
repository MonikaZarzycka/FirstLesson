package FilesTasks;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ReverseText {

    public static void getReverseText(String pathFile) throws IOException {

        String text = Files.readString(Path.of(pathFile));

        int characterPosition = text.length() - 1;

        while (characterPosition >= 0) {
            System.out.print(text.charAt(characterPosition));
            characterPosition--;
        }
    }
}
