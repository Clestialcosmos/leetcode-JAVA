class Solution {
    public int largestRectangleArea(int[] heights) {

        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;

        for (int i = 0; i <= heights.length; i++) {

            // If we reached the end, use height 0
            int currentHeight;

            if (i == heights.length) {
                currentHeight = 0;
            } else {
                currentHeight = heights[i];
            }

            // Remove taller bars
            while (!stack.isEmpty() &&
                   currentHeight < heights[stack.peek()]) {

                int index = stack.pop();

                int height = heights[index];

                int width;

                if (stack.isEmpty()) {
                    width = i;
                } else {
                    width = i - stack.peek() - 1;
                }

                int area = height * width;

                if (area > maxArea) {
                    maxArea = area;
                }
            }

            stack.push(i);
        }

        return maxArea;
    }
}