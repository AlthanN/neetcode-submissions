class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] answer = {0, 1};
        int leftP = 0;
        int rightP = 1;
        for(int i = 0; i < nums.length-1; i++) {
            for(int j = i; j < nums.length-1; j++) {
                if(nums[leftP] + nums[rightP] == target) {
                    answer[0] = leftP;
                    answer[1] = rightP;
                    return answer;
                }
                rightP++;
            }
            leftP++;
            rightP = leftP + 1;
        }
        return answer;
    }
}
