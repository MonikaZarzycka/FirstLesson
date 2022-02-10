package FilesTasks;

import java.io.IOException;

public class UpperCaseTextMain {
    public static void main(String[] args) throws IOException {

        String nameOfInputFile = "data.txt";
        String nameOfOutputFile = "output.txt";

        UpperCaseText.convertToCapitalLetters(nameOfInputFile, nameOfOutputFile);
    }
}
