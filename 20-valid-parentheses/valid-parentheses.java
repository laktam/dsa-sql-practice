class Solution {
    public boolean isValid(String s) {
        if(s.length() % 2 != 0) return false;
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(stack.isEmpty()){
                stack.push(c);
            }
            else if(isValidPair(stack.peek(), c)){
                stack.pop();
            }else {
                stack.push(c);
            }
        }
        return stack.size() == 0;
    }

    private boolean isValidPair(char o, char c){
        if(o == '(' && c == ')') return true;
        if(o == '[' && c == ']') return true;
        if(o == '{' && c == '}') return true;
        return false;
    }
}