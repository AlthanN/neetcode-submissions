class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        myDict = {}
        for st in strs:
            sort = sorted(st)
            key = "".join(sort)
            if key in myDict:
                myDict[key].append(st)
            else:
                myDict[key] = [st]
        return list(myDict.values())