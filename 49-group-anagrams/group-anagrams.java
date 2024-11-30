class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String str : strs){
            char chars[] = str.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            if(map.containsKey(key)){
                map.get(key).add(str);
            }else{
                List<String> l = new ArrayList<>();
                l.add(str);
                map.put(key, l);
            }
        }
        List<List<String>> result = new ArrayList<>();
        for(Map.Entry<String, List<String>> entry : map.entrySet()){
            result.add(entry.getValue());
        }
        return result;
        
    }
}