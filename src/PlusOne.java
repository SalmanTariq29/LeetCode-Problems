
public class PlusOne {
    public int[] plusOne(int[] digits) {
        int[] numArray;
        int di = 0;
        for (int a : digits){
            if (a == 9) {
                di++;
            }
        }

        if (digits.length == di){
            numArray = new int[digits.length + 1];
        }else {
            numArray = new int[digits.length];
        }

        int length = numArray.length - 1;
        int carry = 0;
        int no = 1;
        int sum;
        for (int i = digits.length - 1; i >= 0; i--) {
            sum = digits[i] + carry + no;
            if (sum > 9){
                numArray[length] = 0;
                carry = 1;
            }else {
                numArray[length] = sum;
                carry = 0;
            }
            length--;
            no = 0;
        }
        if (carry == 1){
            numArray[0] = 1;
        }
        return numArray;
    }
}
