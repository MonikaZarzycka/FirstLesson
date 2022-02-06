package WriteFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
    Scanner read = new Scanner(new File("src/main/java/WriteFile/data.txt"));

    public ReadFile() throws FileNotFoundException {
    }

    String text = read.nextLine();
}
