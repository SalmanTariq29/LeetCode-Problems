public class ReverseInteger {
    public  int reverse(int x){
        int reverse = 0;
        while (x != 0){
            int percent = x % 10;
            if (reverse > Integer.MAX_VALUE / 10 || (reverse == Integer.MAX_VALUE / 10 && percent > 7)){
                return 0;
            }
            if (reverse < Integer.MIN_VALUE / 10 || (reverse == Integer.MIN_VALUE / 10 && percent < -8)){
                return 0;
            }
            reverse = reverse * 10 + percent;
            x = x / 10;
        }

        return  reverse;
    }
}
