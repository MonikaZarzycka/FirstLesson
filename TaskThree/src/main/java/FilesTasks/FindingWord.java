package FilesTasks;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FindingWord {

        public static void findWord(String pathFile) throws IOException {

            String wordToFind = "Koniec";

            String text = Files.readString(Path.of(pathFile));
            System.out.println(text.contains(wordToFind));
        }

}

