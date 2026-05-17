class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        s1 = list(s)
        s2 = list(t)
        s1 = sorted(s1)
        s2 = sorted(s2)
        return s1 == s2
        