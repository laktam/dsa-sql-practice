class Solution {
    public List<String> letterCasePermutation(String s) {
        return letterCasePermutation("", s);
    }

    public List<String> letterCasePermutation(String prefix, String subS) {
        List<String> possibilities = new ArrayList<>();
        if(subS.length() != 0){
            if(Character.isAlphabetic(subS.charAt(0))){
                possibilities.addAll(
                    letterCasePermutation(prefix + Character.toString(Character.toLowerCase(subS.charAt(0))), subS.substring(1))
                );
                possibilities.addAll(
                    letterCasePermutation(prefix +  Character.toString(Character.toUpperCase(subS.charAt(0))), subS.substring(1))
                );
                
            }else{
                possibilities.addAll(
                    letterCasePermutation(prefix + subS.charAt(0), subS.substring(1))
                );
            }
        }else{
            possibilities.add(prefix);
            return possibilities;
        }
        return possibilities;


    }
}