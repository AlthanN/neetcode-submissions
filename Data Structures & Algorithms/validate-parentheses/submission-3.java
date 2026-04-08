class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        if(s.length() == 1) return false;
        if(s.length() == 0) return true;
        int open = 0;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                open++;
                stack.add(s.charAt(i));
            } else if(s.charAt(i) == ')') {
                if(stack.size() == 0) return false;
               if(stack.pop() == '(') {
                open--;
                continue;
               } else {
                return false;
               }
            } else if(s.charAt(i) == '}') {
                if(stack.size() == 0) return false;
                if(stack.pop() == '{') {
                    open--;
                    continue;
                } else {
                    return false;
                }
            } else if(s.charAt(i) == ']') {
                if(stack.size() == 0) return false;
                if(stack.pop() == '[') {
                    open--;
                    continue;
                } else {
                    return false;
                }
            }
        }
        if(open != 0) return false;
        return true;
    }
}
