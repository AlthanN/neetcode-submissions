class Solution {
    public boolean isPalindrome(String s) {
        int l = 0;
        int r = s.length() - 1;
        String st = s.toLowerCase();
        while(l < r) {
            System.out.println("l: " + s.charAt(l) + " size: " + l);
            System.out.println("r: " + s.charAt(r) + " size: " + r + "\n");
            if(st.charAt(l) == ' ') {
                l++;
                continue;
            }
            if(st.charAt(r) == ' ') {
                r--;
                continue;
            }
            if(!Character.isLetterOrDigit(st.charAt(l))) {
                l++;
                continue;
            }
            if(!Character.isLetterOrDigit(st.charAt(r))) {
                r--;
                continue;
            }
            if(st.charAt(l) != st.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
