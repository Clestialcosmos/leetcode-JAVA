class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        int[] slist = new int[26];
        int[] tlist = new int[26];

        for(int i = 0;i<s.length();i++){
            slist[s.charAt(i) - 'a']++;
            tlist[t.charAt(i)-'a']++;
        }
        for( int i = 0;i<26;i++){
            if(slist[i] != tlist[i]){
                return false;
            }
        }
        return true;
    }
}
