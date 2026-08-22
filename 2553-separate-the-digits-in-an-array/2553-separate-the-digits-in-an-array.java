class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer>  ans = new ArrayList<>();
        int n = nums.length;
        for(int i = 0;i<n;i++){
            String a = Integer.toString(nums[i]);
            for(char c: a.toCharArray()){
                int k = c - '0';
                ans.add(k);
            }
        }
        int m = ans.size();
        int[] res = new int[m];
        for(int i = 0;i<m;i++){
            res[i] = ans.get(i);
        }
        return res;

    }
}