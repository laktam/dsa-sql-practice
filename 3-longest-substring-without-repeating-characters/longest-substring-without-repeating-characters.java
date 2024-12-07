class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start = 0;
        int max = 0;
        Set<Character> set = new HashSet<>();
        for(int end = 0; end < s.length(); end++){
            char c = s.charAt(end);
            while(set.contains(c)){
                set.remove(s.charAt(start));
                start++;
            }
            set.add(c);
            max = Math.max(max, set.size());
        }
        return max;
    }
}