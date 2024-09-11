class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c == '{' || c == '(' || c == '['){
                stack.push(c);
            } else  if((c == '}' || c == ')' || c == ']')&& !stack.isEmpty())         {
                if(c == '}' && stack.peek().equals('{')){
                    stack.pop();
                }else if(c == ']' && stack.peek().equals('[')){
                        stack.pop();
                }else if(c == ')' && stack.peek().equals('(')){
                        stack.pop();
                }else {
                    return false;
                }
            }else {
                return false;// if there is a closing bracket and the stack is empty
            }
        }
        if(stack.size() > 0){
            return false;
        }
    return true;

    }
}
