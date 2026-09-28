class Solution {
    public int majorityElement(int[] nums) {
        //insertion sort
        int vote =0;
        int n = nums.length;
        int maj = 0;
        for(int i = 0;i<n;i++){
            if(vote == 0) maj = nums[i];
            if(maj == nums[i]) vote++; else vote--;
            
       
    }
    return maj; 
    }
}