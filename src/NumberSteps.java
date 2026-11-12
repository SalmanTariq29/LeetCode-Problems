public class NumberSteps {
    public int numSteps(String s){
        int steps = 0;
        int carry = 0;
        for (int i = s.length() - 1; i >= 0 ; i--) {
            int bit = s.charAt(i) - '0';

            if (i == 0){

                if (bit + carry == 1){
                    break;
                }
                break;
            }
            int sum = carry + bit;
            if (sum == 0){
                steps++;
                carry = 0;
            } else if (sum == 1) {
                steps++;
                carry = 1;
            }else {
                steps++;
                carry = 1;
            }
        }
        steps += s.length() - 1;
        return steps;

    }
}
