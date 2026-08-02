class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        maxL = 0
        l = 0
        seen = set()
        if len(s) == 0:
            return 0
        
        for i in range(len(s)):
            while s[i] in seen:
                seen.remove(s[l])
                l += 1
            
            seen.add(s[i])
            maxL = max(maxL, i - l + 1)
        
        return maxL

        