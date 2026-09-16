class Solution {
    public boolean isMonotonic(int[] nums) {
        int asc = 0;
        int desc = 0;
        int n = nums.length;
        for(int i = 0;i<n-1;i++){
            if(nums[i] < nums[i+1]) asc++;
            else if(nums[i] > nums[i+1]) desc++;
        }
        if(asc == 0 || desc == 0) return true;
        return false;
    }
}