class MinStack {
    private StackNode top;

    public MinStack() {
        
    }
    
    public void push(int val) {
        if(top == null){
            StackNode newNode = new StackNode(val, val);
            top = newNode;
        }else{
            int min = Math.min(top.min, val);
            StackNode newNode = new StackNode(val, min);
            newNode.next = top;
            top = newNode;
        }
    }
    
    public void pop() {
        top = top.next;
    }
    
    public int top() {
        return top.val;
    }
    
    public int getMin() {
        return top.min;
    }

    private class StackNode {
        private int min = 0;
        private int val;
        private StackNode next;

        public StackNode(int val, int min){
            this.val = val;
            this.min = min;
        }
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