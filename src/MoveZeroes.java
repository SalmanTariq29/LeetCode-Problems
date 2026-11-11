public class MoveZeroes {
    public void moveZeroes(int[] nums){
        int nonZeroElementIndex = 0;
        int temp;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0){
                temp = nums[nonZeroElementIndex];
                nums[nonZeroElementIndex] = nums[i];
                nums[i] = temp;
                nonZeroElementIndex++;
            }
        }
    }
}
