class Solution {
    public boolean halvesAreAlike(String s) {
        s = s.toLowerCase();
        int n = s.length();
        int countstart = 0,countend = 0;
        for(int i = 0;i<n/2;i++){
            if(s.charAt(i) == 'a'|| s.charAt(i) == 'e'|| s.charAt(i) == 'i'||s.charAt(i) == 'o'||s.charAt(i) == 'u') countstart++;
            if(s.charAt(n-i-1) == 'a'||s.charAt(n-i-1) == 'e'||s.charAt(n-i-1) == 'i'||s.charAt(n-i-1) == 'o'||s.charAt(n-i-1) == 'u') countend++;
        }
        return countstart == countend;
    }
}