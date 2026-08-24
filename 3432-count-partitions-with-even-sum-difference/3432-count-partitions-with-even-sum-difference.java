class Solution {
    public int countPartitions(int[] nums) {
      int n = nums.length;
        int left = 0;
        int res = 0;
        for(int i = 0;i<n;i++) left += nums[i];
        int right = 0;
        for(int i = 0;i<n-1;i++){
            left -= nums[i];
            right += nums[i];
            int a = right-left;
            if(a%2 == 0) res++;
        }
        return res;  
    }
}