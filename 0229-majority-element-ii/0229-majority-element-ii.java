class Solution {
    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();
        int n = nums.length;
        int  a = n/3;
        for(int i = 0;i<n;i++){
            int count = 0;
            for(int j = i;j<n;j++){
                if(nums[i] == nums[j]){
                    count++;
                } 
        }
            if(count > a && !arr.contains(nums[i])){
                arr.add(nums[i]);
            }
        }
        return arr;
    }
}