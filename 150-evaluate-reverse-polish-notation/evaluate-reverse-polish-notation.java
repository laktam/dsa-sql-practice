class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> stack = new Stack<>();
        for(int i = 0; i < tokens.length; i++){
            String current = tokens[i];
            if(!isOperation(current)){
                stack.push(current);
            }else{
                String s2 = stack.pop();
                String s1 = stack.pop();
                String op = current;
                stack.push(String.valueOf(operation(s1, s2, op)));
            }
        }
        return Integer.parseInt(stack.pop());
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