class Solution {
    public boolean isAnagram(String s, String t) {
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];
       for(char i : s.toCharArray()){
        freq1[i - 'a']++;
       }
       for(char i : t.toCharArray()){
        freq2[i - 'a']++;
       }
       for(int i = 0;i<26;i++){
        if(freq1[i] != freq2[i]){
            return false;
        }
       }
       return true; 
    }
}