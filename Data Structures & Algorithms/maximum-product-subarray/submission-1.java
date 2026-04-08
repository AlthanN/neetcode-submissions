class Solution {
    public int maxProduct(int[] nums) {
        int maxProd = -Integer.MAX_VALUE;
        for(int i = 1; i < nums.length; i++) {
            int curProd = 1;
            for(int j = 0; j < i; j++) {
                curProd *= nums[j];
                if(curProd > maxProd) {
                    maxProd = curProd;
                }
            }
        }
        for(int i = 0; i < nums.length; i++) {
            int curMax = 1;
            for(int j = i; j < nums.length; j++) {
                curMax *= nums[j];
                if(curMax > maxProd) {
                    maxProd = curMax;
                }
            }
        }
        return maxProd;
    }
}
