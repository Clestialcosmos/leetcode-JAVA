class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        int n = nums.length;

        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        int ma = 0;
        for (Map.Entry<Integer, Integer> p : freq.entrySet()) {
            ma = Math.max(ma, p.getValue());
        }

        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < ma; i++) {
            ans.add(new ArrayList<>());
        }

        for (Map.Entry<Integer, Integer> p : freq.entrySet()) {
            int val = p.getKey();
            int count = p.getValue();
            for (int i = 0; i < count; i++) {
                ans.get(i).add(val);
            }
        }

        return ans;
    }
}