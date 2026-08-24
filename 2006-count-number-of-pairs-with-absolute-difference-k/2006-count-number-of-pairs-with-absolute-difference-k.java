// class Solution {
//     public int countKDifference(int[] nums, int k) {
//        int count = 0;
//         int n = nums.length;
//         for(int i = 0;i<n;i++){
//             for(int j = i+1;j<n;j++){
//                 if(Math.abs(nums[i]-nums[j])==k) count++;
//             }
//         }
//         return count; 
//     }
//     //O(N2)
// }

    class Solution {
    public int countKDifference(int[] nums, int k) {
        int[] freq = new int[101];
        int op = 0;
        for(int n: nums) freq[n]++;
        for(int i = k+1; i < 101; i++) op += freq[i] * freq[i-k];
        return op;
    }
}

