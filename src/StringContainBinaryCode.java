import java.util.HashSet;
import java.util.Set;

public class StringContainBinaryCode {
    public boolean hasAllCodes(String s,int k){
        Set<Integer> subStringSet = new HashSet<>();
        for (int i = 0; i <= s.length() - k; i++) {
            int value = Integer.parseInt(s.substring(i,i+k),2);
            subStringSet.add(value);
        }

        return subStringSet.size() == 1 << k;
    }
}
