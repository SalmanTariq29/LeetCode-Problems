import java.util.*;

public class FirstUniqueChar {
    public int firstUniqueChar(String s){

        LinkedHashMap<Character,Integer> uniqueCharacters = new LinkedHashMap<>();
        for (int i = 0; i < s.length(); i++) {
            uniqueCharacters.put(s.charAt(i),uniqueCharacters.getOrDefault(s.charAt(i),0) + 1);
        }

        for (var data : uniqueCharacters.entrySet()){
            if (data.getValue() == 1){
                return s.indexOf(data.getKey());
            }
        }

//                if (data.getValue().equals(1)){
//                    System.out.println(data.getKey()+ " : "+data.getValue());
//                index = s.indexOf(data.getValue());
//                break;
//                }
//        }
//            return index;
//        Queue<Character> uniqueCharacters = new PriorityQueue<>();
//        for (int i = 0; i < s.length(); i++) {
//            uniqueCharacters.add(s.charAt(i));
//        }


//        int startingIndex = 0;
//        int endingIndex = s.length() - 1;
        return  -1;
    }
}
