class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        // if(s.length() == 1 || s.charAt(0) == '}' || s.charAt(0) == ']' || s.charAt(0) == ')' || s.length() % 2 == 1){
        //     return false;
        // }
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
                return false;
            }
        }
        if(stack.size() > 0){
            return false;
        }
    return true;

    }
}