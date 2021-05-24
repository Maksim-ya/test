import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class WordsIdentificator {
    public Map<String, Integer> mapCreator(List<String> results) {
        Map<String, Integer> map = new HashMap<>();
        for (String s : results) {
            map.computeIfPresent(s,(key,value)-> ++value);
            map.computeIfAbsent(s, value -> 1);
        }
        Map<String, Integer> result = sortByCount(map);
        return result;
    }

    private Map<String, Integer> sortByCount (Map<String, Integer> map){
       return map.entrySet()
                .stream()
                .sorted((Map.Entry.<String, Integer>comparingByValue().reversed()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
    }
}
