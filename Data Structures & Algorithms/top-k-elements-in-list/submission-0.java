class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int[] res = new int[k];
        for(int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }
        List<Integer>[] buckets = new ArrayList[nums.length+1];
        //will initialize every bucket to be an ArrayList,
        //then it will take the freq of each number and use it
        //as an index within the bucket
        for(int key : map.keySet()) {
            int freq = map.get(key);
            if(buckets[freq] == null) {
                buckets[freq] = new ArrayList<Integer>();
            }
            buckets[freq].add(key);
        }
        int index = 0;
        for(int i = buckets.length-1; i >= 0; i--) {
            if(buckets[i] != null) {
                for(int e : buckets[i]) {
                    if(index == k) {
                        break;
                    }
                    res[index] = e;
                    index++;
                }
            }
        }
        return res;

        
    }
}
