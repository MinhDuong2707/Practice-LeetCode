class MinStack {
    private Stack<Integer> stack;
    private Stack<Integer> stackSame;

    public MinStack() {
        stack = new Stack<>();
        stackSame = new Stack<>();
    }
    
    public void push(int value) {
        stack.push(value);
        if(stackSame.isEmpty()==true){
            stackSame.push(value);
        }else if(stackSame.peek()>value){
            stackSame.push(value);
        }else{
            stackSame.push(stackSame.peek());
        }
    }
    
    public void pop() {
        stackSame.pop();
        stack.pop();
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