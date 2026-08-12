class Solution:
    def maxArea(self, heights: List[int]) -> int:
        globalMax = 0
        l = 0
        r = len(heights) - 1
        while l < r:
            height = min(heights[l], heights[r])
            tempArea = height * (r - l)
            if tempArea > globalMax:
                globalMax = tempArea
            
            if heights[l] > heights[r]:
                r -= 1
            else:
                l += 1

        return globalMax