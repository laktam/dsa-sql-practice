class MinStack {
    private int min = Integer.MAX_VALUE;
    private int val;
    private MinStack next;

    public MinStack() {
        
    }
    
    public void push(int val) {
        MinStack n = new MinStack();
        n.val = val;

        MinStack old = this.next;
        this.next = n;
        n.next = old;
        
        if(n.next == null) n.min = val;
        else if(val < old.min) n.min = val;
        else n.min = old.min;
    }
    
    public void pop() {
        this.next = this.next.next;
    }
    
    public int top() {
        return this.next.val;
    }
    
    public int getMin() {
        return next.min;
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