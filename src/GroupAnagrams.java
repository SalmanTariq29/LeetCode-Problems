import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs){
        HashMap<String,List<String>> anagram = new HashMap<>();

        for (String word : strs) {
            char[] characters = word.toCharArray();
            Arrays.sort(characters);
            String cast = new String(characters);

            anagram.computeIfAbsent(cast, _ -> new ArrayList<>()).add(word);
        }
        return new ArrayList<>(anagram.values());
//        return anagram.values().stream().toList();
    }
}
