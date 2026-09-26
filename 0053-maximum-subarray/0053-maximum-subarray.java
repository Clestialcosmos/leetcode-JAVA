class Solution {
    public int maxSubArray(int[] nums) {
        int currmax = nums[0],endmax = nums[0];
        int n = nums.length;
        for(int i =1;i<n;i++){
            currmax = Math.max(currmax+nums[i],nums[i]);
            endmax = Math.max(endmax,currmax);
        }
        return endmax;
    }
}