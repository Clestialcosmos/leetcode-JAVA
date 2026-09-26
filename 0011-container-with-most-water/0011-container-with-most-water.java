class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int i = 0,j = n-1;
        int maxarea = 0,currarea = 0;
        while(i <= j){
            int h = Math.min(height[i],height[j]);
            currarea = h * (j-i);
            maxarea = Math.max(currarea,maxarea);
            if(height[i] >= height[j]) j--;
            else i++;
        }
        return maxarea;
    }
}