class Solution {
    public int characterReplacement(String s, int k) {
        int max = 0;
        int l = 0;
        int maxFreq = 0;
        Map<Character, Integer> map = new HashMap<>();
        int length = s.length();
        for(int r = 0; r < length; r++){
            char c = s.charAt(r);
            map.put(c, map.getOrDefault(c, 0) + 1);
            maxFreq = Math.max(maxFreq, map.get(c));
            while((r - l + 1) - maxFreq > k){
                char toRemoveC = s.charAt(l);
                map.put(toRemoveC, map.get(toRemoveC) - 1);
                l++;
            }
            max = Math.max(max, r - l + 1);
        }
        return max;
    }
}