class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int start = 0;
        int end = n-1;
        while(start<= end){
            int ch = start + (end-start)/2;
            if(nums[ch] == target){
                return ch;
            }
            else if(nums[ch] < target){
                start = ch+1;
            }else{
                end = ch-1;
            }
        }
        return -1;
    }
}