class Solution {
    List<List<Integer>> result = new ArrayList<>();
    void backtracking(int idx,int[] nums,List<Integer> temp){
        if(idx == nums.length){
            result.add(new ArrayList<>(temp));
            return;
        }
        temp.add(nums[idx]);
        backtracking(idx+1,nums,temp);

        temp.remove(temp.size()-1);
        backtracking(idx+1,nums,temp);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> temp = new ArrayList<>();
        int idx = 0;
        backtracking(idx,nums,temp);
        return result;
    }
}