class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        generate(result, "", 0, 0, n);
        return result;

    }

    private void generate(List<String> result,String prefix, int openCount,int closeCount, int n){
        if(prefix.length() == n * 2) {
            result.add(prefix);
            return;
        }

        if(openCount < n){
            generate(result, prefix + "(", openCount + 1, closeCount, n);
        }
        if(closeCount < openCount){
            generate(result, prefix + ")", openCount, closeCount + 1, n);
        }
    }
}