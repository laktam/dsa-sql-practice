class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<List<Character>, List<String>> map  = new HashMap<>();
        for(String str : strs){
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            List<Character> key = new ArrayList<>();
            for(char c : chars){
                key.add(c);
            }

            if(map.containsKey(key)){
                map.get(key).add(str);
            }else{
                List<String> anagrams = new ArrayList<>();
                anagrams.add(str);
                map.put(key, anagrams);
            }
        }
        List<List<String>> result = new ArrayList<>();
        map.forEach((k, v) -> result.add(v));
        return result;
    }
}