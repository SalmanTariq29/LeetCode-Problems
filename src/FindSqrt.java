public class FindSqrt {

    public int mySqrt(int x){
        int value = 1;
        int count = 0;
        int temp = x;
        while (temp > 0){
            temp -=  value;
            count++;
            value += 2;
        }
        if (count * count ==  x){
            return count;
        }else {
            return count - 1;
        }
    }

    public static void main(String[] args) {
        FindSqrt findSqrt = new FindSqrt();
        System.out.println(findSqrt.mySqrt(8));
    }
}
