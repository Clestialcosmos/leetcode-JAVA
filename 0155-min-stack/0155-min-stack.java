class MinStack {
    Stack<Integer> normalStk;
    Stack<Integer> minStk;

    public MinStack() {  //Constructor call
        normalStk = new Stack<>();
        minStk = new Stack<>();
    }
    
    public void push(int value) {
        normalStk.push(value);
        if(minStk.isEmpty() || minStk.peek() >= value) minStk.push(value);
    }
    
    public void pop() {
        int temp = normalStk.pop();
        if(temp == minStk.peek()) minStk.pop();
        
    }
    
    public int top() {
        return normalStk.peek();
    }
    
    public int getMin() {
        return minStk.peek();
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