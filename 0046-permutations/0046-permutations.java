class Solution {
    List<List<Integer>> result = new ArrayList<>();
    void followback(int[] nums,List<Integer> temp){
        if(temp.size() == nums.length){
            result.add(new ArrayList<>(temp));
            return;
        }
        for(int i = 0;i<nums.length;i++){
            if(!temp.contains(nums[i])){
                temp.add(nums[i]);
                followback(nums,temp);
                temp.remove(temp.size()-1);
            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> temp = new ArrayList<>();
        followback(nums,temp);
        return result;
    }
}