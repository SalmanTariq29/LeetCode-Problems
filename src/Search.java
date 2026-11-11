public class Search {
    public int search(int[] nums,int target){
        int start = 0;
        int end = nums.length - 1;
        while (start <= end){
            int mid = start + (end - start) / 2;
            if (nums[mid] == target){
                return mid;
            } else if (nums[mid] < target) {
                start = mid + 1;
            }else {
                end = mid - 1;
            }
        }
        return -1;
//        int start = 0;
//        int end = nums.length;
//        while (start < end){
//            int mid = start + ( end - start ) / 2;
//            if (nums[mid] == target){
//                return mid;
//            }
//            if (nums[mid] > target){
//                start = mid + 1;
//            }else if (nums[mid] < target){
//                end = mid - 1;
//            }
//        }
//        return -1;
//        if (nums[0] == target){
//            return 0;
//        }
//        int start;
//        for (int i = 1; i < nums.length; i = i * 2) {
//            if (target > nums[i]){
//                continue;
//            }
//
////            if (nums[i] == target){
////                return i;
////            }else if (nums[i + 1] == target){
////                return i + 1;
////            }
//        }
//        return -1;
////        int half = nums.length / 2;
////
////        if (nums[half] == target){
////            return half;
////        }
////
////        if (nums[half] < target){
////            for (int i = half; i < nums.length; i=i+2) {
////                if (nums[i] == target){
////                    return i;
////                }
////            }
////
////        }else {
////            for (int i = 0; i < half; i++) {
////                if (nums[i] == target){
////                    return i;
////                }
////            }
////        }
////        return -1;
    }

}
