class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        my_dict = dict()
        for i in range(len(strs)):
            og_str = strs[i]
            cArr = sorted(og_str)
            key_str = ''.join(cArr)
            if key_str in my_dict:
                my_dict[key_str].append(og_str)
            else:
                my_dict[key_str] = [og_str]
        
        return list(my_dict.values())
        
        