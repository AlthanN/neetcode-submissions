class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //The idea is that i want to sort each individual string 
        //Into a character array, and then sort it
        //If i do this for every String, i can then see which values
        //are anagrams, since they will have the same value
        //I can then put that into a HashMap, where I set the sorted value
        //as the Key, and the unique string into a list of Strings, which 
        //will be the value part
        HashMap<String, List<String>> map = new HashMap<>();
        for(int i = 0; i < strs.length; i++) {
            char[] charArr = strs[i].toCharArray();
            Arrays.sort(charArr);
            String sorted = new String(charArr);
            if(!map.containsKey(sorted)) {
                map.put(sorted, new ArrayList<String>());
            }
            map.get(sorted).add(strs[i]);
        }
        return new ArrayList<>(map.values());
    }
}
