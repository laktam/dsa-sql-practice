class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0) return 0;
        int longest = 1;
        String substring = "" + s.charAt(0);
        for(int i = 1; i < s.length(); i++){
            char c = s.charAt(i);
            if(!substring.contains(c + "")){
                substring += c;
            }else{
                // index of c in substring
                int index = substring.lastIndexOf(c);
                substring = substring.substring(index + 1) + c;
            }
            longest = Math.max(substring.length(), longest);
        }
        return longest;
    }
}