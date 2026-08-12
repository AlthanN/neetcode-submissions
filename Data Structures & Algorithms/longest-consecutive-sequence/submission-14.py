class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        globalMax = 1
        r = sorted(nums)
        if len(nums) == 0:
            return 0
        elif len(nums) == 1:
            return 1
        
        tempMax = 1
        
        for i in range(1, len(nums)):
            if r[i] == r[i-1]:
                continue
            if r[i] - 1 == r[i-1]:
                tempMax += 1
            if r[i] - 1 > r[i-1]:
                if tempMax > globalMax:
                    globalMax = tempMax
                
                tempMax = 1

        
        if tempMax > globalMax:
            return tempMax

        return globalMax
