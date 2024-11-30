class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start = 0;
        // exclusive
        int end = 0;
        int max = 0;
        Set<Character> set = new HashSet<>();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(!set.contains(c)){
                set.add(c);
            }
            else{
                while(set.contains(c)){
                    set.remove(s.charAt(start));
                    start++;
                }
                set.add(c);
            }
            end++;
            max = Math.max(max, set.size());
        }
        return max;
    }
}