class Solution {
    public int trap(int[] height) {
        if(height.length == 0 || height.length == 1) return 0;
        int i = 1;
        int j = height.length - 2;
        int maxL = height[0];
        int maxR = height[height.length-1];
        int maxArea = 0;
        while(i <= j) {
            if(maxL < maxR) {
                if(maxL - height[i] > 0) {
                    maxArea += maxL - height[i];
                }
                if(height[i] > maxL) {
                    maxL = height[i];
                }
                i++;
            } else {
                if(maxR - height[j] > 0) {
                    maxArea += maxR - height[j];
                }
                if(height[j] > maxR) {
                    maxR = height[j];
                }
                j--;
            }
        }
        return maxArea;
    
    }
}
