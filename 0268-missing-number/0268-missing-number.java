class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length-1;
        int[] freq = new int[n+2];
        for(int i : nums) freq[i]++;
        for(int i = 0;i<n+1;i++){
            if(freq[i] == 0) return i;
        }
        return n+1;
    }
}