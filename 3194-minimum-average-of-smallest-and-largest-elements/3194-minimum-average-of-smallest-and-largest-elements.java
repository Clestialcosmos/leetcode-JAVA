class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums); 
        int n = nums.length;
        List<Double> avg = new ArrayList<>();

        for (int i = 0; i < n / 2; i++) {
            double a = (nums[i] + nums[n - 1 - i]) / 2.0;
            avg.add(a);
        }

        return Collections.min(avg);
    }
}
