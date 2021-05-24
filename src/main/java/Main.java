import parser.Parser;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        String filename = "src/main/resources/passage.txt";
        Parser parser = new Parser();
        String str = parser.parse(filename);
        Splitter splitter = new Splitter();
        List<String> results = splitter.getWords(str);

        Printer printer = new Printer();
        printer.printWordsCount(results);


        WordsIdentificator identificator = new WordsIdentificator();
        Map<String, Integer> sortedByCount = identificator.mapCreator(results);


        printer.print10values(sortedByCount);


        List<String> sentences = splitter.getSentences(str);

        printer.printLastSentence(sentences,sortedByCount);

    }

}
