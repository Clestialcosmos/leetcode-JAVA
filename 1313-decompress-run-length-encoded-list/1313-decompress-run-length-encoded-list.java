class Solution {
    public int[] decompressRLElist(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int n = nums.length;

        for(int i = 0; i < n; i += 2) {
            int freq = nums[i];     
            int val = nums[i+1];    
            for(int j = 0; j < freq; j++) {
                ans.add(val);
            }
        }

   
        int[] result = new int[ans.size()];
        for(int i = 0; i < ans.size(); i++) {
            result[i] = ans.get(i);
        }
        return result;
    }
}