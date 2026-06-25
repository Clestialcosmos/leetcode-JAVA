class Solution {
    public int findPeakElement(int[] nums) {
        int pe = nums[0];
        int n = nums.length;
        int res=0;
        for(int i=0;i<n;i++){
            if(nums[i]>pe){
                res = i;
                pe = nums[i];
            }
        }
        return res;
    }
}