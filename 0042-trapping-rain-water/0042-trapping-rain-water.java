class Solution {
    public int trap(int[] height) {
        int water = 0;
        int n = height.length;
        int[] leftarr = new int[n];
        int[] rightarr = new int[n];
        leftarr[0] = height[0];
        rightarr[n-1] = height[n-1];
        for(int i=1;i<n;i++){
            leftarr[i] = Math.max(height[i],leftarr[i-1]);
        }

        for(int i = n-2;i>=0;i--){
            rightarr[i] = Math.max(height[i],rightarr[i+1]);
        }
        for(int i = 0;i<n;i++){
            water+= Math.min(leftarr[i],rightarr[i]) - height[i];
        }
        return water;
    }
}