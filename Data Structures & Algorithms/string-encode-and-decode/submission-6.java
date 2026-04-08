class Solution {

    public String encode(List<String> strs) {
        String ans = "";
        for(int i = 0; i < strs.size(); i++) {
            ans = ans + strs.get(i) + "/";
        }
        return ans;
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<String>();
        String subStr = str;
        int index = 0;
        
        while(subStr.length() > 0) {
            int spaceIndex = subStr.indexOf("/");
            res.add(subStr.substring(0, spaceIndex));
            subStr = subStr.substring(spaceIndex + 1);
            index++;
        }
        return res;
    }
}
