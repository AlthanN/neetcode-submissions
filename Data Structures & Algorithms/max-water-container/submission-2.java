class Solution {
    public int maxArea(int[] heights) {
        int maxArea = 0;
        int curArea = 0;
        int l = 0;
        int r = heights.length - 1;
        int height = 0;
        int width = 0;
        while(l < r) {
            height = Math.min(heights[l], heights[r]);
            width = r - l;
            curArea = height * width;
            if(curArea > maxArea) {
                maxArea = curArea;
            }
            if(heights[l] > heights[r]) {
                r--;
            } else {
                l++;
            }
        }
        return maxArea;
    }
}
