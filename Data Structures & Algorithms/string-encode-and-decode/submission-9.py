class Solution:

    def encode(self, strs: List[str]) -> str:
        st = ""
        for i in range(len(strs)):
            st += strs[i] + "😄"
        return st

    def decode(self, s: str) -> List[str]:

        res = []
        i = 0
        r = len(s)
        while len(s) > 0:
            word = s[:s.find("😄")]
            s = s[s.find("😄") + 1:]
            res.append(word)
        return res
            
