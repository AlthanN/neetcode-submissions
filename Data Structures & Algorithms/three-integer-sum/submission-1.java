class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
     // nums[i] + nums[j] + nums[k] = 0
     // nums[i] = -(nums[j] + nums[k])
     // -nums[i] = nums[j] + nums[j]
        
        Arrays.sort(nums);
        HashSet<Integer> seen = new HashSet<>();
        ArrayList<List<Integer>> ans = new ArrayList<>();
        for(int i = 0; i < nums.length; i++) {
            if(seen.contains(nums[i])) continue;
            int j = i + 1;
            int k = nums.length - 1;
            while(j < k) {
                if(j == k) break;
                if(nums[j] + nums[k] == -nums[i]) {
                    ArrayList<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(nums[k]);
                    ans.add(list);
                    j++;
                    while(nums[j] == nums[j-1] && j < k) {
                        j++;
                    }
                }
                if(nums[j] + nums[k] < -nums[i]) {
                    j++;
                } else {
                    k--;
                }
            }
            seen.add(nums[i]);
        }
        return ans;
    }
}
