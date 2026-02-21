public class PrimeSetBits {
    public int countPrimeSetBits(int left, int right) {
        int count = 0;
        int numberInBinary;
        for (int i = left; i <= right; i++) {
            numberInBinary = Integer.bitCount(i);
            if (checkIsPrime(numberInBinary)){
                count++;
            }
        }
        return count;
    }

    public boolean checkIsPrime(int number) {
        if (number <= 1) return false;
        if (number == 2) return true;
        if (number % 2 == 0) return false;
        for (int i = 3; i * i <= number; i = i + 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
