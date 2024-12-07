class Solution {
    /*
    keep a freqency map
    have a window of characters
    each time test if replacing the other words the most frequent word
    will give use a repeating substring
    if not remove first character
    */
    public int characterReplacement(String s, int k) {
        Map<Character, Integer> map = new HashMap<>();
        int start = 0;
        int maxFreq = 0;
        int result = 0;
        for(int end = 0; end < s.length(); end++){
            char c = s.charAt(end);
            map.put(c, map.getOrDefault(c, 0) + 1);
            maxFreq = Math.max(maxFreq, map.get(c));
            while((end - start + 1) - maxFreq> k){
                char startC = s.charAt(start);
                map.put(startC, map.get(startC) - 1);
                start++;
            }
            result = Math.max(result, end - start + 1);
        }
        return result;
    }
}