package parser;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Parser {
    public String parse (String filename){
        StringBuilder result = new StringBuilder();
        File devFile = new File(filename);
        Scanner scanner = null;
        try {
            scanner = new Scanner(devFile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while (scanner.hasNext()) {
            String nextLine = scanner.nextLine();
            result.append(nextLine);
        }
        return  result.toString();
    }
}
