class Solution:
    def characterReplacement(self, s: str, k: int) -> int:
        res = 0
        l = 0
        biggestVal = 0
        myDict = {}
        for r in range(len(s)):
            myDict[s[r]] = 1 + myDict.get(s[r], 0)
            
            
            while (r - l + 1) - max(myDict.values()) > k:
                myDict[s[l]] -= 1
                l += 1
            
            res = max(res, r-l+1)

        return res