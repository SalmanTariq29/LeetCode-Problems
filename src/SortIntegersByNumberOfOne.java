
public class SortIntegersByNumberOfOne {

    public int[] sortByBits(int[] arr){
        int[] numberInBits = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            numberInBits[i] = Integer.bitCount(arr[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (numberInBits[i] > numberInBits[j] || numberInBits[i] == numberInBits[j] && arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                    int tempBits =  numberInBits[i];
                    numberInBits[i] = numberInBits[j];
                    numberInBits[j] = tempBits;
                }
            }
        }
        return arr;
    }
}
