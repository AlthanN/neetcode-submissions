class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        ArrayList<List<Integer>> ans = new ArrayList<>();
        HashSet<Integer> seen = new HashSet<>();
        Arrays.sort(nums);
        int threeSum = 0;

        for(int i = 0; i < nums.length; i++) {
            if(seen.contains(nums[i])) {
                continue;
            }
            int j = i + 1;
            int k = nums.length - 1;
            while(j < k) {
                threeSum = nums[i] + nums[j] + nums[k];
                if(threeSum == 0) {
                    ArrayList<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(nums[k]);
                    ans.add(list);
                    seen.add(nums[i]);
                    j++;
                    while(nums[j] == nums[j - 1] && j < k) {
                        j++;
                    }
                } else if(threeSum < 0) {
                    j++;
                } else {
                    //threeSum > 0
                    k--;
                }
            }
        }
        return ans;
    }
}
