class Solution {
    public int trap(int[] height) {
        int l = 1;
        int r = height.length-2;
        int maxL = height[0];
        int maxR = height[height.length - 1];
        int maxArea = 0;
        while(l <= r) {
            int area;
            if(maxL < maxR) {
                //maxL is minimum
                area = maxL - height[l];
                if(area > 0) {
                    maxArea += area;
                }
                if(maxL < height[l]) maxL = height[l];
                l++;
                
            } else {
                //maxR is minimum
                area = maxR - height[r];
                if(area > 0) {
                    maxArea += area;
                }
                if(maxR < height[r]) maxR = height[r];
                r--;
            }
        }
        return maxArea;
    }
}
