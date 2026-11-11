
public class MaxProfit {
    public int maxProfit(int[] prices){
        int minProfit = prices[0];
        int max = 0;

        for (int i = 1; i < prices.length; i++) {
            int profit = prices[i] - minProfit;
            max = Math.max(max,profit);
            minProfit = Math.min(minProfit,prices[i]);
        }
        return max;

        //        int minimum = prices[0];
//        int maximum = -1;
//        int minIndex = 0;
//
//        for (int i = 1; i < prices.length; i++) {
//            if (prices[i] < minimum){
//                minIndex = i;
//                minimum = prices[i];
//            }
//
//
//        }
//        for (int i = minIndex + 1; i < prices.length; i++) {
//            maximum = Math.max(prices[i],maximum);
//        }
//        if(maximum == -1){
//            return 0;
//        }
//        System.out.println(maximum);
//        return maximum - minimum;
//        System.out.println(minimum);
//        int minIndex = 0;

//        int maxIndex = 0;
//        int max = prices[0];
//        int min = 0;
//
//        for (int i = 0; i < prices.length; i++) {
//            if (prices[i] < min){
//                min = prices[i];
//                minIndex = i;
//            } else if (prices[i] > max) {
//                max = prices[i];
//                maxIndex = i;
//            }
//        }
//        return minIndex < maxIndex ? prices[maxIndex] - prices[minIndex] : 0;
//        int max = 0;
////        boolean  = false;
////        boolean isSell = false;
//        int min = prices[0];
//        for (int i = 0; i < prices.length; i++) {
//            if (prices[i] > max && isBuy){
//                max = prices[i];
//                isSell = true;
//            } else if (prices[i] < min) {
//                min = prices[i];
//                isBuy = true;
//            }
//        }
//
//        if (isSell){
//            return max - min;
//        }
//        return 0;
    }
}
