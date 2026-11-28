class Solution {
    static void subseq(int[] arr,int index,int n,List<List<Integer>> ans,List<Integer> temp){
        if(index == n){
            ans.add(new ArrayList<>(temp));;
            return;
        }
        subseq(arr,index+1,n,ans,temp);
        temp.add(arr[index]);
        subseq(arr,index+1,n,ans,temp);
        temp.remove(temp.size()-1);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        subseq(nums,0,nums.length,ans,temp);
        return ans;
    }
}