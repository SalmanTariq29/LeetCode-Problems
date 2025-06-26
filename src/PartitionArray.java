import java.util.Arrays;

public class PartitionArray {
    public int partitionArray(int[] nums,int k){
        Arrays.sort(nums);
        int start = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] - nums[start] > k){
                count++;
                start = i;
            }
        }
        count++;

        return count;
    }

    public static void main(String[] args) {
        PartitionArray partitionArray = new PartitionArray();
        System.out.println(partitionArray.partitionArray(new int[]{1,2,3,4,5},3));
    }
}
