class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) return "";
        if(strs.length == 1) return strs[0];

        String prefix = strs[0];
        for(int i = 1; i < strs.length; i++){
            if(prefix.equals("")) return "";
            else prefix = commun(prefix, strs[i]);
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