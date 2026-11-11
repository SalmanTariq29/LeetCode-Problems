
public class MaxSubArray {

    public int maxSubArray(int[] nums){
      int max = nums[0];
      int sum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            sum = Math.max(nums[i],sum + nums[i]);
            max = Math.max(sum,max);
        }
        return max;




//        int max = 0;
//        int sum = 0;
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i; j < nums.length; j++) {
//                sum += nums[j];
//            }
//            if (sum > max){
//                max = sum;
//            }
//            sum = 0;
//        }
//        return max;
    }
}
