class Solution {
    public int lengthOfLongestSubstring(String s) {
        int length = s.length();
        if(length == 1) return 1;
        int start = 0;
        Set<Character> set = new HashSet<>();
        int max = 0;
        for(int i = 0; i < length; i++){
            char c = s.charAt(i);
            while(set.contains(c)){
                set.remove(s.charAt(start));
                start++;
            }

            set.add(c);
            max = Math.max(set.size(), max);
        }
        return max;

    }
}