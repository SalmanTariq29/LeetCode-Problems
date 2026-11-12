import java.util.HashMap;
import java.util.PriorityQueue;

public class TopKFrequent {
    public int[] topKFrequent(int[] nums,int k){

        HashMap<Integer,Integer> frequency = new HashMap<>();

        for (int num : nums){
            frequency.merge(num,1,Integer::sum);
        }
        PriorityQueue<Integer> minHeap = new PriorityQueue<>((a,b) -> Integer.compare(frequency.get(a),frequency.get(b)));

        for (int num : frequency.keySet()){
            minHeap.offer(num);

            if (minHeap.size() > k){
                minHeap.poll();
            }
        }
        int[] topKValues = new int[k];
        for (int i = 0; i < k; i++) {
            topKValues[i] = minHeap.poll();
        }
        return topKValues;
    }
}
