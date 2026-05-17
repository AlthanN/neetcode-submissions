class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] ans = new int[2];
        int l = 0;
        int r = numbers.length - 1;
        while(l < r) {
            if(numbers[l] + numbers[r] == target) {
                // goal
                ans[0] = l + 1;
                ans[1] = r + 1;
                return ans;
            } else if(numbers[l] + numbers[r] > target) {
                r--;
            } else {
                l++;
            }
        }
        return ans;
























        // int l = 0;
        // int r = numbers.length - 1;
        // int sum = 0;
        // int[] ans = new int[2];
        // while(l <= r) {
        //     sum = numbers[l] + numbers[r];
        //     if(sum == target) {
        //         ans[0] = l+1;
        //         ans[1] = r+1; 
        //         return ans;
        //     } else if(sum > target) {
        //         r--;
        //     } else {
        //         l++;
        //     }
        // }
        // return ans;
    }
}
