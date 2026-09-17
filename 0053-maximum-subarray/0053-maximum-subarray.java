class Solution {
    public int maxSubArray(int[] nums) {
        int currentsum = nums[0];
        int maxsum = nums[0];
        int n = nums.length;
        for(int i = 1;i<n;i++){
            currentsum = Math.max(nums[i],currentsum + nums[i]);
            maxsum = Math.max(maxsum,currentsum);
        }

        return maxsum;
    }
}