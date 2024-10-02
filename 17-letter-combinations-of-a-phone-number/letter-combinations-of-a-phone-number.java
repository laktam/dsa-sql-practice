class Solution {
    private Map<Character, String> map = new HashMap<>();
    private List<String> combinations = new ArrayList<>();

    public List<String> letterCombinations(String digits) {
        if(digits.length() == 0){
            return combinations;
        }
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");

        combinationsOff(0, "", digits);
        return combinations;
    }

    public void combinationsOff(int c, String combination, String digits){
        if(combination.length() == digits.length()){
            combinations.add(combination);
            return;
        }
        if(c < digits.length()){
            String letters = map.get(digits.charAt(c));
            for(int i = 0; i < letters.length(); i++){
                combinationsOff(c + 1, combination + letters.charAt(i), digits);
            }
        }
        
    }
}