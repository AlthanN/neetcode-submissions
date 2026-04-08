class Solution:
    def trap(self, height: List[int]) -> int:
        l,r = 0, len(height) - 1
        maxL, maxR = height[l], height[r]
        maxArea = 0
        while l <= r:
            if maxL < maxR:
                area = maxL - height[l]
                if area > 0:
                    maxArea += area
                if height[l] > maxL:
                    maxL = height[l]
                l += 1
            else:
                area = maxR - height[r]
                if area > 0:
                    maxArea += area
                if height[r] > maxR:
                    maxR = height[r]
                r -= 1
        return maxArea
        