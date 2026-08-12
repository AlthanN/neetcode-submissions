class Solution:
    def trap(self, height: List[int]) -> int:
        l, r = 0, len(height) - 1
        maxL, maxR = height[l], height[r]
        totalArea = 0

        while l <= r:
            if maxL < maxR:
                # maxL is limiting height
                if maxL - height[l] > 0:
                    totalArea += maxL - height[l]
                
                if height[l] > maxL:
                    maxL = height[l]
                
                l += 1
            else:
                if maxR - height[r] > 0:
                    totalArea += maxR - height[r]

                if height[r] > maxR:
                    maxR = height[r]

                r -= 1

        return totalArea
                