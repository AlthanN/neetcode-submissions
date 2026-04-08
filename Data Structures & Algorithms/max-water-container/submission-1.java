class Solution {
    public int maxArea(int[] heights) {
        int curMax = -1;
        int l = 0;
        int r = heights.length - 1;
        while(l < r) {
            int tempMax = Math.min(heights[l], heights[r]) * (r-l);
            if(tempMax > curMax) {
                curMax = tempMax;
            }
            if(heights[l] > heights[r]) {
                r--;
            } else {
                l++;
            }
        }
        return curMax;

    }
}
