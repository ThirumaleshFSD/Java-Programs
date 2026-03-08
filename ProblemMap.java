import java.util.HashMap;
import java.util.Map;

public class ProblemMap {
    public static void main(String[] args) {

        String str = "java is easy java is";

        String[] words = str.split(" ");

        Map<String, Integer> map = new HashMap<>();

        // Step 1: Count frequency of each word
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        // Step 2: Print words that appear only once
        for (String word : map.keySet()) {
            if (map.get(word) == 1) {
                System.out.print(word + " ");
            }
        }
    }
}