class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        freq_map = {}
        for num in nums:
            freq_map[num] = 1 + freq_map.get(num, 0)

        buckets = []
        for i in range(len(nums) + 1):
            buckets.append([])
        for key, value in freq_map.items():
            buckets[value].append(key)
        res = []
        idx = len(nums) 
        while len(res) != k:
            for e in buckets[idx]:
                res.append(e)
                if len(res) == k:
                    return res
            idx -= 1

        return res
