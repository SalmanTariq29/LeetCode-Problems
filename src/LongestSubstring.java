public class LongestSubstring {

    public String longestPalindrome(String s){
        StringBuilder subString = new StringBuilder();
        String previous = "";
        if (s.length() == 1){
            return s;
        }

        for (int i = 0; i < s.length(); i++) {
            for (int j = s.length() - 1; j > i; j--) {
                if (s.charAt(i) == s.charAt(j)){
                    String subPattern = s.substring(i , j + 1);
                    for (int k = 0,l = subPattern.length() - 1; k < subPattern.length(); k++,l--) {
                        if (subPattern.charAt(k) == subPattern.charAt(l)) {
                            subString.append(subPattern.charAt(k));
                        }else {
                            subString = new StringBuilder();
                            break;
                        }

                    }

                }
                if (subString.length() == s.length()){
                    return subString.toString();
                }

                if (subString.length() > previous.length()){
                    previous = subString.toString();
                }
                subString = new StringBuilder();
            }

        }

        if (previous.isEmpty()){
            previous = s.substring(0,1);
        }
        return previous;

    }
}
