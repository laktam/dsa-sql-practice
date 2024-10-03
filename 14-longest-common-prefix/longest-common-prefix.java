class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix = "";
        if(strs.length == 0){
            return prefix;
        }else{
            prefix = strs[0];
        }
        if(strs.length > 1){
            for(int i = 1; i < strs.length; i++){
                // loop over prefix 
                for(int j = prefix.length(); j >= 0; j--){
                    if(strs[i].startsWith(prefix.substring(0, j))){
                        break;
                    }else{
                        prefix = prefix.substring(0, j - 1);
                    }
                }
            }
        }
        return prefix;
    }
}