class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        for(int e : nums) {
            System.out.println(e);
        }
        int overallMax = 1;
        int tempMax = 1;

        if(nums.length == 0){
            return 0;
        } else if(nums.length == 1) {
            return 1;
        }

        for(int i = 1; i < nums.length; i++) {
            


            if(nums[i] == nums[i-1]) {
                continue;
            }
            //is a consecutive sequence
            if(nums[i] - 1 == nums[i-1]) {
                tempMax++;
            } else if(tempMax > overallMax) {
                overallMax = tempMax;
                tempMax = 1;
            } else {
                tempMax = 1;
            }
            
        }
        
        if(overallMax == 1 || tempMax > overallMax) {
            overallMax = tempMax;
        }
        
        return overallMax;
    }
}
