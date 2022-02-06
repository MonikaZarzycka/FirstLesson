package FilesTasks;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;


public class FileEdit {
    public static void main(String[] args) throws IOException {

        File file = new File("src/main/resources/data.txt");

        String course = "Kurs";
        String java = "Java";
        String lesson = "Lekcja 6";
        String files = "Pliki";
        String exceptions = "Wyjątki";
        String endOfFile = "Koniec pliku";

        Files.writeString(Path.of("src/main/resources/data.txt"), course + " " + java + " " + lesson + " " + files + " " + exceptions + " " + files + " " + endOfFile);
    }
}
