class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < tokens.length; i++){
            String current = tokens[i];
            switch (current) {
                case "-":
                    stack.push(-stack.pop() + stack.pop());
                    break;
                case "+":
                    stack.push(stack.pop() + stack.pop());
                    break;
                case "/":
                    int i2 = stack.pop();
                    int i1 = stack.pop();
                    stack.push(i1 / i2);
                    break;
                case "*":
                    stack.push(stack.pop() * stack.pop());
                    break;
                default :
                    stack.push(Integer.parseInt(current));
            } 
        }
        return stack.pop();
    }

    public boolean isOperation(String s){
        return s.matches("\\*|\\+|/|-");
    }

    private int operation(String s1, String s2, String op){
        int i1 = Integer.parseInt(s1);
        int i2 = Integer.parseInt(s2);
        if(op.equals("*")){
            return i1 * i2;
        }else if(op.equals("/")){
            return i1 / i2;
        }else if(op.equals("-")){
            return i1 - i2;
        }else {
            return i1 + i2;
        }
    }
}