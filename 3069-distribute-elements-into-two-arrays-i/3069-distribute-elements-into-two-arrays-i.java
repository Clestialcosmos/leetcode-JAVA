class Solution {
    public int[] resultArray(int[] nums) {
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        int n = nums.length;

        a.add(nums[0]);
        b.add(nums[1]);

        for (int i = 2; i < n; i++) {
            if (a.get(a.size() - 1) > b.get(b.size() - 1)) {
                a.add(nums[i]);
            } else {
                b.add(nums[i]);
            }
        }

        a.addAll(b);

        int[] res = new int[a.size()];
        for (int i = 0; i < a.size(); i++) {
            res[i] = a.get(i);
        }
        return res;
    }
}
