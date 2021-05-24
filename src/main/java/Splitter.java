import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Splitter {
    public List<String> getWords(String str) {
        ArrayList<String> result = new ArrayList<>();
        String[] words = str.split("\\s+[^\\w]|[^\\w]\\s+|[^\\w&^-]");
        for (String subStr : words) {
            if (!subStr.equals(""))
                result.add(subStr.toLowerCase());
        }
        return result;
    }

    public List<String> getSentences(String str) {
        String[] sentences = str.split("[.!?]\\s+");
        List<String> result = Arrays.asList(sentences);
        Collections.reverse(result);

        return result;
    }
}
