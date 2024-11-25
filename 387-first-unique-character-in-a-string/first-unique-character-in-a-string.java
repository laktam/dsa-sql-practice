class Solution {
    public int firstUniqChar(String s) {
        Map<Character, Integer> map = new LinkedHashMap<>();

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            if(entry.getValue() == 1) return s.indexOf(entry.getKey());
        }
        return -1;
        // int result[] = map.entrySet().stream()
        //         .filter(e -> e.getValue() == 1)
        //         .mapToInt(e -> s.indexOf(e.getKey()))
        //         .toArray();
        // if(result.length < 1) return -1;
        // else return result[0];

        // try{
        //     char unique = set.iterator().next();
        //     return s.indexOf(unique);
        // }catch(Exception e){
        //     return -1;
        // }
    }
}