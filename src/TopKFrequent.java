
import java.util.TreeMap;

public class TopKFrequent {
    public int[] topKFrequent(int[] nums,int k){

        TreeMap<Integer,Integer> frequency = new TreeMap<>();
        int[] topKValues = new int[k];

        for (int num : nums){
            frequency.merge(num,1,Integer::sum);
        }


        System.out.println(frequency);
        return new int[]{};
    }
}
