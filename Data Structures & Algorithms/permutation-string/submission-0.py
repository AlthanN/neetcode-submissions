class Solution:
    def checkInclusion(self, s1: str, s2: str) -> bool:
        ogCount = {}
        for s in s1:
            ogCount[s] = 1 + ogCount.get(s, 0)

        l = 0
        matches = 0

        for r in range(len(s2)):
            if s2[r] not in ogCount:
                while matches != 0:
                    matches -= 1
                    ogCount[s2[l]] += 1
                    l += 1
                    continue
                l += 1
                continue
            else:
                # s2[r] is in our dictionary
                
                # need to check if the value in dictionary is 0. If it is, then we can't use that value anymore and need to bring
                # left pointer forwards. We can most likely just use a while loop here.
                while ogCount[s2[r]] == 0:
                    # We found a value that is in the og count, but is repeated more than it should be.
                    ogCount[s2[l]] += 1
                    matches -= 1
                    l += 1

                ogCount[s2[r]] -= 1
                matches += 1
                if matches == len(s1):
                    return True
                
        return False
                