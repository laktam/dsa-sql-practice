class Solution {
    private List<String> possibilities = new ArrayList<>();

    public List<String> letterCasePermutation(String s) {
        letterCasePermutation("", s);
        return possibilities;
    }

    public void letterCasePermutation(String prefix, String subS) {
        if(subS.length() != 0){
            if(Character.isAlphabetic(subS.charAt(0))){
                    letterCasePermutation(prefix + Character.toString(Character.toLowerCase(subS.charAt(0))), subS.substring(1));
                    letterCasePermutation(prefix +  Character.toString(Character.toUpperCase(subS.charAt(0))), subS.substring(1));                
            }else{
                    letterCasePermutation(prefix + subS.charAt(0), subS.substring(1));
            }
        }else{
            possibilities.add(prefix);
        }
    }
}