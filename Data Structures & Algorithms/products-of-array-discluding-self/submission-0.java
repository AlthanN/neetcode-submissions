class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
            int runningProduct = 1;
            for(int j = 0; j < nums.length; j++) {
                if(i == j) {
                    continue;
                }
                runningProduct *= nums[j];
            }
            res[i] = runningProduct;
        }
        return res;
    }
}  
