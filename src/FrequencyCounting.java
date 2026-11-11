import java.util.HashMap;

public class FrequencyCounting{
    public void frequencyCounting(int[] nums){
        HashMap<Integer,Integer> frequency = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            frequency.put(nums[i],frequency.getOrDefault(nums[i],0) + 1);
        }
        for (Integer key : frequency.keySet()){
            System.out.println(key+" : "+frequency.get(key));
        }
        for (var data : frequency.entrySet()){
            System.out.println("\n"+data.getKey()+" = "+data.getValue());
        }
    }
}
