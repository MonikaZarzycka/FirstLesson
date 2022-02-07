package FilesTasks;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

class BetterFileReader {

    private static final String FILE_PATH = "src/main/resources/data.txt";

    public static void readFromFile(String FILE_PATH) throws IOException {

        String text = Files.readString(Path.of(FILE_PATH));
        System.out.println(text);
    }

}