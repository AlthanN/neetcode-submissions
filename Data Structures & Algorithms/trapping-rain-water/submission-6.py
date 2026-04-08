class Solution:
    def trap(self, height: List[int]) -> int:
        l = 0
        r = len(height) - 1
        maxL = height[l]
        maxR = height[r]
        totalArea = 0
        while l <= r:
            if maxL < maxR:
                area = maxL - height[l]
                if area > 0:
                    totalArea += area
                if height[l] > maxL:
                    maxL = height[l]
                l += 1
            else:
                area = maxR - height[r]
                if area > 0:
                    totalArea += area
                if height[r] > maxR:
                    maxR = height[r]
                r -= 1
        return totalArea
            
                    