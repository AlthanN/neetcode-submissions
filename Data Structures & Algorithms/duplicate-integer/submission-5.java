class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        for(int e : nums) {
            seen.add(e);
        }
        return seen.size() != nums.length;
    }
}