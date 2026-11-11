import java.util.Arrays;

public class MaximumWealth {
    public int maximumWealth(int[][] accounts){
        int max = Arrays.stream(accounts[0]).sum();
        for (int[] account : accounts) {
            int sum = Arrays.stream(account).sum();
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }
}
