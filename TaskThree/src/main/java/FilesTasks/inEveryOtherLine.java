package FilesTasks;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class inEveryOtherLine {

    private static final String FILE_PATH = "src/main/resources/data.txt";

    public static void EveryOtherLine(String FILE_PATH) throws IOException {

        int lineNumber = 0;
        String line;

        BufferedReader bufferedReader = new BufferedReader(new FileReader(FILE_PATH));
        while ((line = bufferedReader.readLine()) != null) {
            if (lineNumber % 2 == 0) {
                System.out.println(line);
            }
            lineNumber++;
        }
    }
}