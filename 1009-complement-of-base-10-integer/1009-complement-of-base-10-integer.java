class Solution {
    public int bitwiseComplement(int n) {
        if(n == 0) return 1;
        
        int rem , ans = 0, mul2 = 1;
        while(n>0){
            rem = n%2;
            if(rem == 1){
                rem = 0;
            }else{
                rem = 1;
            }
            n /= 2;
            ans = ans + rem * mul2;
            mul2 *= 2;
        }
        return ans;
        
    }
}