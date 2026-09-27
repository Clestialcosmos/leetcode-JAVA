public class Solution {
    public boolean isMonotonic(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        boolean increasing = true, decreasing = true;

        for (int num : nums) {
            if (!stack.isEmpty()) {
                if (num < stack.peek()) {
                    increasing = false;
                }
                if (num > stack.peek()) {
                    decreasing = false; 
                }
            }
            stack.push(num);
        }
        return increasing || decreasing;
    }
}