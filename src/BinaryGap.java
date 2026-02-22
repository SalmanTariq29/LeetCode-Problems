public class BinaryGap {

    public int binaryGap(int n){

       String valueInBinary =  Integer.toBinaryString(n);
       int start = valueInBinary.indexOf("1");
       int pregap = 0;
       int nextGap = 0;

        for (int i = valueInBinary.indexOf("1") + 1; i < valueInBinary.length(); i++) {
           if (valueInBinary.charAt(i) == '1') {
               nextGap = i - start;
               start = i;
           }
           if (nextGap > pregap){
               pregap = nextGap;
           }

        }
        return pregap;
    }
}
