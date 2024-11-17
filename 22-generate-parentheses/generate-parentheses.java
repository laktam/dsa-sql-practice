class Solution {
    public List<String> generateParenthesis(int n) {
        // Constraints to Ensure Validity:
        // add ( only if nmbr of ( is less than n.
        // add ) only if nmbr of ) is less than added (
        // add the entries if length is (n * 2)
        if(n == 0) return Collections.EMPTY_LIST;
        if(n == 1) return Collections.singletonList("()");
        List<String> combinations = new ArrayList<>();
        generateParenthesis("", 0, 0, n, combinations);
        return combinations;
    }

    public void generateParenthesis(String prefix,int openningP, int closingP, int n, List<String> combinations){
        //valid parentheses
        if(prefix.length() == (n * 2)){
            combinations.add(prefix);
        }
        // try the two possibilities
        if(openningP < n){
            generateParenthesis(prefix + "(", openningP + 1, closingP, n, combinations);
        }
        if(closingP < openningP){
            generateParenthesis(prefix + ")", openningP, closingP + 1, n, combinations);
        }
    }
}