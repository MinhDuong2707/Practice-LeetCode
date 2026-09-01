class MinStack {
    private Stack<Integer> stack;
    private Stack<Integer> stackSame;

    public MinStack() {
        stack = new Stack<>();
        stackSame = new Stack<>();
    }
    
    public void push(int value) {
        stack.push(value);
        int currentMin = stackSame.isEmpty() ? value : Math.min(value, stackSame.peek());
        stackSame.push(currentMin);
    }
    
    public void pop() {
        stack.pop();
        stackSame.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return stackSame.peek();
        
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */