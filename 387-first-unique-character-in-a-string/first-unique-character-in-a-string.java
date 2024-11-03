class Solution {
    public int firstUniqChar(String s) {
        Map<Character, Integer> charsMap = new LinkedHashMap<>();
        for(int c = 0; c < s.length(); c++){
            if(charsMap.containsKey(s.charAt(c))){
                charsMap.put(s.charAt(c), charsMap.get(s.charAt(c)) + 1);
            }else{
                charsMap.put(s.charAt(c), 1);
            }
        }
        if(!charsMap.containsValue(1)){
            return -1;
        }
        for(Map.Entry<Character, Integer> entry : charsMap.entrySet()){
            if(entry.getValue().equals(1)){
                return s.indexOf(entry.getKey().toString());
            }
        }
        return -1;
    }
}