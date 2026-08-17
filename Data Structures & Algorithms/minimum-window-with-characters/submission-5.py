class Solution:
    def minWindow(self, s: str, t: str) -> str:
        if t == "": return ""

        l = 0
        countT = {}
        for c in t:
            countT[c] = countT.get(c, 0) + 1
        
        match, threshold = 0, len(countT)
        win_map = {}
        res, resLen = [-1, -1], float('inf')

        for r in range(len(s)):
            c = s[r]
            win_map[c] = win_map.get(c, 0) + 1

            if c in countT and win_map[c] == countT[c]:
                # If this is true, it means the character is present in both strings and have the same amount
                match += 1
            
            while match == threshold:
                # we must continue to shrink our window by incrementing our left pointer until our condition fails
                
                if r - l + 1 < resLen:
                    resLen = r - l + 1
                    res = [l, r]
                    
                win_map[s[l]] -= 1
                
                if s[l] in countT and win_map[s[l]] < countT[s[l]]:
                    # we failed and must lower our match
                    match -= 1
                
                l += 1
        
        l, r = res
        # we never had to change 
        if resLen != float('inf'):
            return s[l:r+1]
        else:
            return ""






























        # if t == "": return ""

        # res, resLen = [-1, -1], float('inf')
        # freq_map = {}
        # win_map = {}
        # for c in t:
        #     freq_map[c] = freq_map.get(c, 0) + 1
    
        # l = 0
        # matches, need = 0, len(freq_map)
        # for r in range(len(s)):
        #     win_map[s[r]] = 1 + win_map.get(s[r], 0)

        #     # we check if our current char is in our t freq map
        #     if s[r] in freq_map and win_map[s[r]] == freq_map[s[r]]:
        #         matches += 1
    
        #     while matches == need:
        #         if r - l + 1 < resLen:
        #             res = [l, r]
        #             resLen = r - l + 1
                
        #         win_map[s[l]] -= 1
        #         if s[l] in freq_map and win_map[s[l]] < freq_map[s[l]]:
        #             matches -= 1
        #         l += 1
        
        # l, r = res
        # if resLen != float('inf'):
        #     return s[l:r+1]
        # else:
        #     return ""




        