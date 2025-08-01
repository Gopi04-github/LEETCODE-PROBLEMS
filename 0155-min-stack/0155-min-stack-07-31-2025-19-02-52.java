class MinStack {
    private Stack<Integer> stack;
    private Stack<Integer> min;
    public MinStack() {
        stack=new Stack<>();
        min=new Stack<>();

    }
    public void push(int val) {
        stack.push(val);
        if(min.isEmpty()||val<=min.peek())min.push(val);
    }
    public void pop() {
        if(stack.peek().equals(min.peek()))min.pop();
        stack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return min.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */