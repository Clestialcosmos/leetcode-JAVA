class Solution {
    public int lengthOfLastWord(String s) {
        int n = s.length()-1;
        while(n>= 0 && s.charAt(n)==' '){
            n--;
        }
        int l = 0;
        while(n>=0 && s.charAt(n)!= ' '){
            l++;
            n--;
        }
        return l;
    }
}