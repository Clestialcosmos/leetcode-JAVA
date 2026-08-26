class Solution {
    public int minOperations(int[] nums, int k) {
        int check = 0;
        for (int num : nums) {
            check ^= num;   
        }
        
        int diff = check ^ k;  
        int count = 0;
        
        while (diff != 0) {
            count += diff & 1; 
            diff >>= 1;
        }
        
        return count;  
    }
}