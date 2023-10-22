package homework_nr_8;
import java.util.HashMap;
public class ExFiveCreateDictionary {
    public static void main(String[] args) {
        HashMap<String, String> dictionaryMap = new HashMap<>();

        dictionaryMap.put("hello","o zi buna");
        dictionaryMap.put("bye bye","la revedere");
        dictionaryMap.put("I","eu");
        dictionaryMap.put("world","lume");
        dictionaryMap.put("one","unu");
        dictionaryMap.put("two","doua");
        dictionaryMap.put("zhree","trei");
        dictionaryMap.put("four","patru");
        dictionaryMap.put("five","cinci");
        dictionaryMap.put("six","sase");

        System.out.println(dictionaryMap);

        dictionaryMap.forEach((key,value)-> {
            System.out.println(key+" = "+value);
        });
    }
}
