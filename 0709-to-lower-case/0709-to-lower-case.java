class Solution {
    public String toLowerCase(String s) {
        String ans = "";
        for(char c: s.toCharArray()){
            if((int)c >= 65 && (int)c <=90){
                ans += (char)((int)c + 32);
            }
            else{
                ans += c;
            }
        }
        return ans;
    }
}