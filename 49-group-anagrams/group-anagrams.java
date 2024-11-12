class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(int s = 0; s < strs.length; s++){
            String current = strs[s];
            char arr[] = current.toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);
            if(map.containsKey(key)) map.get(key).add(current);
            else {
                List<String> l = new ArrayList<>();
                l.add(current);
                map.put(key, l);
            }
        }
        List<List<String>> anagrams = new ArrayList<>();
        for(List<String> anagramLists : map.values()){
            anagrams.add(anagramLists);
        }
        return anagrams;
    }
}