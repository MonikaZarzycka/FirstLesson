package FilesTasks;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;


public class FileEdit {
    public static void main(String[] args) throws IOException {

        File file = new File("src/main/resources");

        String course = "Kurs\n";
        String java = "Java\n";
        String lesson = "Lekcja \n";
        String files = "Pliki\n";
        String exceptions = "Wyjątki\n";
        String endOfFile = "Koniec pliku\n";

        Files.writeString(Path.of("src/main/resources/data.txt"), course  + java  + lesson + files  + exceptions + files + endOfFile);

        BetterFileReader.showCharactersFromFile("src/main/resources/data.txt");
        InEveryOtherLine.everyOtherLine("src/main/resources/data.txt");






    }
}
