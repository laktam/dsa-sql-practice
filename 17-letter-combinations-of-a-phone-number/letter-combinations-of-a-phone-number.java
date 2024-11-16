class Solution {
    private Map<Character, String> digitsMap;
    private List<String> combinations;
    public List<String> letterCombinations(String digits) {
        if(digits.length() == 0) return Collections.EMPTY_LIST;
        digitsMap = new HashMap<>();
        digitsMap.put('2', "abc");
        digitsMap.put('3', "def");
        digitsMap.put('4', "ghi");
        digitsMap.put('5', "jkl");
        digitsMap.put('6', "mno");
        digitsMap.put('7', "pqrs");
        digitsMap.put('8', "tuv");
        digitsMap.put('9', "wxyz");

        combinations = new ArrayList<>();
        combinations(digits, "", 0);
        return combinations;
    }

    public void combinations(String digits, String prefix, int index){
        String letters = digitsMap.get(digits.charAt(index));
        for(char c : letters.toCharArray()){
            if(index == digits.length() - 1){
                combinations.add(prefix + c);
            }else{
                combinations(digits, prefix + c, index + 1);
            }
        }
    }
}