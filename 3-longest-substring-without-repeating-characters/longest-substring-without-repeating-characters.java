class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start = 0;
        int end = 0;
        int maxLength = 0;
        Set<Character> chars = new HashSet<>();
        for(int i = 0; i < s.length(); i++){
            
            if(chars.contains(s.charAt(i))){
                // move start until no repeating character
                // move until chars don't contain the duplicate char then add it
                for(int j = start; start < end; j++){
                    if(!chars.contains(s.charAt(i))){
                        start = j;
                        break;
                    }else{
                       // if it still contains it remove an element and move forward
                       chars.remove(s.charAt(j));
                    }
                }
                chars.add(s.charAt(i));
            }else{
                chars.add(s.charAt(i));
            }
            end++;
            if(chars.size() > maxLength){
                maxLength = chars.size();
            }
        }
        return maxLength;
    }
}