public class CanConstruct {
    public boolean canConstruct(String ransomNote,String magazine){
        int[] count = new int[26];

        for (int i = 0; i < magazine.length(); i++) {
            count[magazine.charAt(i) - 'a']++;
        }

        for (char c : ransomNote.toCharArray()) {
            if (count[c - 'a'] == 0){
                return false;
            }
            count[c - 'a']--;
        }
        return true;
    }
}
