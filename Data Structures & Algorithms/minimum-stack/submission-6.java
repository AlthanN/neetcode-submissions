class MinStack {

    Stack<Integer> stack;
    Stack<Integer> minStack;
    int min = Integer.MAX_VALUE;
    public MinStack() {
        this.stack = new Stack<>();
        this.minStack = new Stack<>();
    }
    
    public void push(int val) {
        stack.push(val);
        int minStackVal = Integer.MAX_VALUE;
        if(!minStack.empty()) {
            minStackVal = minStack.get(minStack.size()-1);
        }
        val = Math.min(val, minStackVal);
        minStack.push(val);
    }
    
    public void pop() {
        stack.pop();
        minStack.pop();
    }
    
    public int top() {
        return stack.get(stack.size()-1);
    }
    
    public int getMin() {
        return minStack.get(minStack.size()-1);
    }
}
