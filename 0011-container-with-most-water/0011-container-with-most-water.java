class Solution {
    public int maxArea(int[] height) {
        //Two pointer {whenever we need to find max  from
        // two loop then we have to use this approach}
       int max= 0;
       int area = 0;
       int i = 0;
       int j = height.length-1;
       while(i<j){
                int height1 = Math.min(height[i],height[j]);
                int width = j-i;
                area = height1*width;              
                max = Math.max(area,max);
                if(height[i] < height[j]){
                    i++;
                }
                else{
                    j--;
                }
                }

        return max;
    }
}