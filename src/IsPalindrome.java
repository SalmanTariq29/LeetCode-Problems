public class IsPalindrome {

    public boolean isPalindrome(String s){
        int left = 0;
        int right = s.length() - 1;

        while (left <= right){

            if (Character.isLetterOrDigit(s.charAt(left))){
                left++;
                continue;
            }

            if (Character.isLetterOrDigit(s.charAt(right))){
                right--;
                continue;
            }

            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))){
                return false;
            }
            left++;
            right--;
        }
        return true;


//        String word = s.toLowerCase().trim();
//        StringBuilder newWord = new StringBuilder();
//
//        for (int i = 0; i < word.length(); i++) {
//            char ch = word.charAt(i);
//            if (Character.isAlphabetic(ch) || Character.isDigit(ch)){
//                newWord.append(ch);
//            }
//        }
//        String foo = newWord.toString();
//        int startingIndex = 0;
//        int endingIndex = foo.length() - 1;
//        while (startingIndex <= endingIndex){
//            if (foo.charAt(startingIndex) != foo.charAt(endingIndex)){
//                return false;
//            }
//            startingIndex++;
//            endingIndex--;
//        }
//
//        return true;
    }
}

//        int startingIndex = 0;
//        int endingIndex = word.length() - 1;
//        while (startingIndex <= endingIndex) {
//            char ch = word.charAt(startingIndex);
//            char ch2 = word.charAt(endingIndex);
////            char ch = word.charAt(startingIndex);
//            if (!(Character.isAlphabetic(ch2) || Character.isDigit(ch2))){
//                endingIndex--;
//            }else if (!(Character.isAlphabetic(ch) || Character.isDigit(ch))){
//                startingIndex++;
//            }else if (word.charAt(ch) == word.charAt(ch2)){
//                System.out.println("Ch "+word.charAt(startingIndex)+ "  " +word.charAt(endingIndex));
//                startingIndex++;
//                endingIndex--;
//            }
//
////            if (ch != word.charAt(endingIndex)){
////                return false;
////            }
//
//
////            startingIndex++;
////            endingIndex--;
//
//        }
