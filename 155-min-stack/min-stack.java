class MinStack {
    private StackNode top;

    public MinStack() {
        top = null;
    }
    
    public void push(int val) {
        if(top == null) top = new StackNode(val, val);
        else {
            int min = Math.min(top.min, val);
            StackNode newTop = new StackNode(val, min);
            newTop.next = top;
            top = newTop;
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

    public class StackNode {
        private int min;
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