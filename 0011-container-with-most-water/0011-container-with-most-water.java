class Solution {
    public int maxArea(int[] height) {
        int currarea = 0;
        int maxarea = 0;
        int i = 0;
        int j = height.length-1;
        while(i < j){
            int h = Math.min(height[i],height[j]);
            currarea = h * (j-i);
            maxarea = Math.max(currarea,maxarea);
            if(height[i] < height[j]){
                i++;
            }
            else j--;
        }
        return maxarea;
    }
}