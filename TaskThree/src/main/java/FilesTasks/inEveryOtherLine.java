package FilesTasks;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class InEveryOtherLine {

    public static void everyOtherLine(String filePath) throws IOException {

        int lineNumber = 0;
        String line;

        BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
        while ((line = bufferedReader.readLine()) != null) {
            if (lineNumber % 2 == 0) {
                System.out.println(line);
            }
            lineNumber++;
        }
    }
}