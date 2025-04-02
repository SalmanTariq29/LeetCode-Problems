public class MergeSortedArray {

    public void merge(int[] nums1,int m,int[] nums2,int n){
//       Flag variable that count no of possible variable
        int count = 0;
        int[] mergedArray = new int[m+n];

//        Merged Array
        for (int firstArray = 0; firstArray < m; firstArray++) {
            if (nums1[firstArray] > 0){
                mergedArray[count] = nums1[firstArray];
                count++;
            }
        }

        for (int secondArray = 0;secondArray < n;secondArray++){
            if (nums2[secondArray] > 0){
                mergedArray[count] = nums2[secondArray];
                count++;
            }
        }
//        Sorting the mergedArray
        for (int i = 0; i < count; i++) {
            for (int j = i + 1 ; j < count; j++) {
                if (mergedArray[i] > mergedArray[j]){
                    int temp = mergedArray[i];
                    mergedArray[i] = mergedArray[j];
                    mergedArray[j] = temp;
                }
            }
        }

//        Copy the elements of mergedArray in num1 Array
        m = count;
        nums1 = new int[m];
        System.arraycopy(mergedArray, 0, nums1, 0, m);
        for (int num : nums1){
            System.out.println(num);
        }

//        int i = m - 1;
//        int j = n - 1;
//        int k = m + n - 1;
//
//        while (i >= 0 && j >= 0){
//            if (num1[i] > num2[j]){

//            }
//        }
    }
}
