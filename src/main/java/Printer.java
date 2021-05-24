import java.util.List;
import java.util.Map;

public class Printer {
    public void printWordsCount (List<String> results){
        System.out.println("Total words count:" + results.size());
    }

    public void print10values (Map<String, Integer> map){
        map.entrySet().stream()
                .map(Map.Entry::getKey)
                .limit(10)
                .forEach(System.out::println);
    }

    public void printLastSentence(List<String> sentences, Map<String, Integer> sortedByCount){
        sentences.stream().filter(e->e.contains(sortedByCount.entrySet().stream()
                .map(Map.Entry::getKey)
                .limit(1).findFirst().get()))
                .findFirst().ifPresent(System.out::println);
    }
}
