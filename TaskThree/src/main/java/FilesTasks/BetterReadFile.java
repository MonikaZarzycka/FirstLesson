package FilesTasks;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

class BetterFileReader {

    public static void showCharactersFromFile(String filePath) throws IOException {

        String text = Files.readString(Path.of(filePath));
        System.out.println(text);
    }

}