class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        # nums[i] + nums[j] = -nums[k]
        seen = set()
        res = []
        nums = sorted(nums)

        for i in range(len(nums) - 2):
            j = i + 1
            k = len(nums) - 1
            if nums[i] in seen:
                continue

            while j < k:
                threeSum = nums[i] + nums[j] + nums[k]
                if threeSum == 0:
                    tempList = [nums[i], nums[j], nums[k]]
                    res.append(tempList)
                    j += 1
                    seen.add(nums[i])

                    while nums[j] == nums[j-1] and j < k:
                        j += 1
                elif threeSum > 0:
                    k -= 1
                else:
                    j += 1
        
        return res

            

