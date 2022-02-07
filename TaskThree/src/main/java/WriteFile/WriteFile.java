package WriteFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class ReadMain {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src/main/resources/data.txt");
        Scanner in = new Scanner(file);

        String task = in.nextLine();
        System.out.println(task);
    }
}