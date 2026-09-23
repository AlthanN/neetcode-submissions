class Solution:
    def checkInclusion(self, s1: str, s2: str):
        freq_list = {}
        s2_map = {}
        
        if len(s1) > len(s2):
            return False

        for c in "abcdefghijklmnopqrstuvwxyz":
            freq_list[c] = 0
            s2_map[c] = 0

        for c in s1:
            freq_list[c] = 1 + freq_list.get(c, 0)

        for i in range(len(s1)):
            s2_map[s2[i]] = 1 + s2_map.get(s2[i], 0)
        
        l = 0
        for r in range(len(s1), len(s2)):
            if freq_list == s2_map:
                return True
            else:
                s2_map[s2[l]] -= 1
                l += 1
                s2_map[s2[r]] = 1 + s2_map.get(s2[r], 0)
        
        if freq_list == s2_map:
                return True
            
        return False
            
            