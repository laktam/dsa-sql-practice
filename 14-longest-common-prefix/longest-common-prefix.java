class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) return "";
        if(strs.length == 1) return strs[0];

        String prefix = strs[0];
        for(int i = 1; i < strs.length; i++){
            for(int j = prefix.length(); j >= 0; j--){
                if(strs[i].startsWith(prefix.substring(0, j))) {
                    prefix = prefix.substring(0, j);
                    break;
                }
                
            }
        
        }
        return prefix;
    }

    private String commun(String s1, String s2){
        String out = "";
        for(int i = 0; i < s1.length() && i < s2.length(); i++){
            if(s1.charAt(i) == s2.charAt(i)){
                out += s1.charAt(i);
            }
            else break;
        }
        return out;
    }
}