class Solution:
    def isValid(self, s: str) -> bool:
        stack = []
        myDict = {"}": "{", "]": "[", ")": "("}
        for c in s:
            if c in "]})":
                if not stack:
                    return False
                if stack.pop() != myDict[c]:
                    return False
            elif c in "[{(":
                stack.append(c)
        if stack:
            return False
            
        return True
