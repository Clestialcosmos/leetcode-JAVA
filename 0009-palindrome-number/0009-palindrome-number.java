class Solution {
    public boolean isPalindrome(int x) {
        if(x<0 || x%10==0 && x!=0){
            return false;
        }
        long ans = 0;
        int a = x;
        while(x != 0){
            ans = ans * 10+x%10;
            x /= 10;
        }
        return a == ans;  
    }
}